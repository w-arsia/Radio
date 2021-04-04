package application.repository.impls;

import application.model.*;
import application.repository.AlbumRepository;
import application.repository.SongRepository;

import java.util.ArrayList;
import java.util.List;

public class SongAndAlbumRepositoryImpl implements SongRepository, AlbumRepository {

    private List<Song> songs;
    private List<Album> albums;

    public Song findByName(String name) {
        for (Song song : songs) {
            if (song.getSongName().equals(name)) {
                return song;
            }
        }
        return null;
    }

    public List<Song> findBySinger(String singerName) {
        List<Song> answer = new ArrayList<>();
        for (Song song : songs) {
                if (song.getSinger().equals(singerName)) {
                    answer.add(song);
            }
        }
        return answer;
    }

    public List<Song> findByGenre(Genre genre) {
        List<Song> answer = new ArrayList<>();
        for (Album album : albums) {
            for (Genre albumGenre : album.getGenres())
                if (albumGenre.equals(genre)) {
                    answer.addAll(album.getSongs());
                }
        }
        return answer;
    }

    public Album findById(int id) {
        for (Album album : albums) {
            if (album.getId() == id) {
                return album;
            }
        }
        return null;
    }
}
