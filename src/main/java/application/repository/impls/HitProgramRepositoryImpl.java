package application.repository.impls;

import application.model.HitParade;
import application.model.Song;
import application.repository.HitProgramRepository;

import java.util.ArrayList;
import java.util.List;

public class HitProgramRepositoryImpl implements HitProgramRepository {

    private List<HitParade> hitParades;


    public HitProgramRepositoryImpl() {
        this.hitParades = new ArrayList<HitParade>();
    }

    public List<Song> getAllSongs(int id) {

        for (HitParade player : hitParades) {
            if (player.getId() == id) {
                return player.getSongs();
            }
        }
        return null;
    }


    public void deleteSong(int hitParadeID, Song badSong) {
        for (HitParade player : hitParades) {
            if (player.getId() == hitParadeID) {
                player.getSongs().remove(badSong);
                break;
            }
        }
    }

    public void addHitProgram(HitParade hitParade) {
        this.hitParades.add(hitParade);
    }

}
