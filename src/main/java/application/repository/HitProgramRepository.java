package application.repository;

import application.model.HitParade;
import application.model.Song;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HitProgramRepository extends RadioProgramRepository {

    List<Song> getAllSongs(int id);

    void deleteSong(int id, Song newSong);

    void addHitProgram(HitParade hitParade);
}
