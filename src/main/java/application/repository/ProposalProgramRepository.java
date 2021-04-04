package application.repository;

import application.model.Song;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProposalProgramRepository extends RadioProgramRepository{

    List<Song> getAllSongs(int id);

    void deleteSong(int id, Song newSong);

    void addSong(int id, Song newSong);
}
