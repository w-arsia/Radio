package application.repository;

import application.model.HitParade;
import application.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HitProgramRepository extends CrudRepository<HitParade,Integer> {

    List<Song> getAllSongs(int id);

    void deleteSong(int id, Song newSong);

    void addHitProgram(HitParade hitParade);
}
