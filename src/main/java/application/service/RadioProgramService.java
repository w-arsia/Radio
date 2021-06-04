package application.service;

import application.model.Genre;
import application.model.HitParade;
import application.model.RadioProgram;
import application.model.Song;
import application.repository.HitProgramRepository;
import application.repository.ProposalProgramRepository;
import application.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Service
public class RadioProgramService {

    private SongRepository songRepositoryImpl;
    private HitProgramRepository hitProgramRepositoryImpl;
    private ProposalProgramRepository proposalProgramRepositoryImpl;
    private static final double exp = 0.00001;

    public RadioProgramService(SongRepository songRepositoryImpl, HitProgramRepository hitProgramRepositoryImpl, ProposalProgramRepository proposalProgramRepositoryImpl) {
        this.songRepositoryImpl = songRepositoryImpl;
        this.hitProgramRepositoryImpl = hitProgramRepositoryImpl;
        this.proposalProgramRepositoryImpl = proposalProgramRepositoryImpl;
    }


    /*
    public ProposalsParade createNewProposalsParade (Genre searchGenre, double maxTime, Date date, Time time){

    }
    */

    public HitParade createNewHitParade (Genre searchGenre, double maxTime, Date date, Time time){
        List<Song> allSongs = songRepositoryImpl.findByGenre(searchGenre.name());
        allSongs = sortSongsByRatingAndSingers(allSongs);
        double curr = 0;
        for( Song song : allSongs){
            if(curr - maxTime < 0) allSongs.remove(song);
        }
        RadioProgram radioProgram = new RadioProgram();
        radioProgram.setSongs(allSongs);
        HitParade hitParade = new HitParade();
        hitParade.setRadioProgram(radioProgram);
        hitParade.setDate(date);
        hitParade.setTime(time);
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
