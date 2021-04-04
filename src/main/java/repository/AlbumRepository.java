package repository;

import model.Album;
import model.Genre;
import model.Song;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AlbumRepository {

    List<Song> findByGenre(Genre genre);
    Album findById(int id);
}
