package application.repository;

import application.model.HitParade;
import application.model.RadioProgram;
import application.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RadioProgramRepository extends CrudRepository<RadioProgram,Integer> {

    List<Song> getAllSongs(int id);
    void deleteSong (int id, Song newSong);

}
