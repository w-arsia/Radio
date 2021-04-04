package application.repository.impls;

import application.model.ProposalsParade;
import application.model.Song;
import application.repository.ProposalProgramRepository;

import java.util.ArrayList;
import java.util.List;

public class ProposalProgramRepositoryImpl implements ProposalProgramRepository {

    private List<ProposalsParade> proposalsParades;

    public ProposalProgramRepositoryImpl() {
        this.proposalsParades = new ArrayList<ProposalsParade>();
    }

    public List<Song> getAllSongs(int id) {

        for (ProposalsParade player : proposalsParades) {
            if (player.getId() == id) {
                return player.getSongs();
            }
        }
        return null;
    }

    public void addSong(int proposalsParadeID, Song newSong) {
        for (ProposalsParade player : proposalsParades) {
            if (player.getId() == proposalsParadeID) {
                player.getSongs().add(newSong);
                break;
            }
        }
    }

    public void deleteSong(int proposalsParadeID, Song badSong) {
        for (ProposalsParade player : proposalsParades) {
            if (player.getId() == proposalsParadeID) {
                player.getSongs().remove(badSong);
                break;
            }
        }
    }


}
