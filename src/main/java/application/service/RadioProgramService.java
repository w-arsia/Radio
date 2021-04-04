package application.service;

import application.model.Genre;
import application.model.HitParade;
import application.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import application.repository.impls.HitProgramRepositoryImpl;
import application.repository.impls.ProposalProgramRepositoryImpl;
import application.repository.impls.SongAndAlbumRepositoryImpl;

import java.sql.Time;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class RadioProgramService {

    private SongAndAlbumRepositoryImpl songRepositoryImpl;
    private HitProgramRepositoryImpl hitProgramRepositoryImpl;
    private ProposalProgramRepositoryImpl proposalProgramRepositoryImpl;
    private static final double exp = 0.00001;



    @Autowired
    public RadioProgramService(SongAndAlbumRepositoryImpl songRepositoryImpl, HitProgramRepositoryImpl hitProgramRepositoryImpl,
                               ProposalProgramRepositoryImpl proposalProgramRepositoryImpl) {
        this.songRepositoryImpl = songRepositoryImpl;
        this.hitProgramRepositoryImpl = hitProgramRepositoryImpl;
        this.proposalProgramRepositoryImpl = proposalProgramRepositoryImpl;
    }

    /*
    public ProposalsParade createNewProposalsParade (Genre searchGenre, double maxTime, Date date, Time time){

    }
    */

    public HitParade createNewHitParade (Genre searchGenre, double maxTime, Date date, Time time){
        List<Song> allSongs = songRepositoryImpl.findByGenre(searchGenre);
        allSongs = sortSongsByRatingAndSingers(allSongs);
        double curr = 0;
        for( Song song : allSongs){
            if(curr - maxTime < 0) allSongs.remove(song);
        }
        HitParade hitParade = new HitParade(allSongs, date, time);
        hitProgramRepositoryImpl.addHitProgram(hitParade);
        return  hitParade;
    }

    private List<Song> sortSongsByRatingAndSingers (List<Song> allSongs){
        allSongs.sort(new Comparator<Song>() {
            public int compare(Song o1, Song o2) {
                return o1.getRating() - o2.getRating() > exp && !(o1.getSinger().equals(o2.getSinger()))
                        ?  1
                        : o1.getRating()- o2.getRating() <= exp && !(o1.getSinger().equals(o2.getSinger()))
                        ?  0
                        : o1.getRating()- o2.getRating() < 0 && !(o1.getSinger().equals(o2.getSinger()))
                        ? -1
                        : -1 ;
            }
        });
        return  allSongs;
    }
}
