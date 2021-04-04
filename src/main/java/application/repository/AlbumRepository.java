package application.repository;

import application.model.Album;
import application.model.Genre;
import application.model.Song;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AlbumRepository {

    List<Song> findByGenre(Genre genre);
    Album findById(int id);
}
