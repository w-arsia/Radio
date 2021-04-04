package repository;

import model.Song;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RadioProgramRepository {

    List<Song> getAllSongs(int id);

    void deleteSong (int id, Song newSong);

}
