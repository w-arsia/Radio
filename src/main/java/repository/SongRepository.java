package repository;

import model.Genre;
import model.Song;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SongRepository {

    Song findByName (String name);
    List<Song> findBySinger (String singerName);

}
