package application.service;

import application.model.Song;
import application.repository.SongRepository;

import java.util.List;

public class SongServise {
    private SongRepository songRepository;

    public Song findByName (String name){
        return songRepository.findByName(name);
    }

    public List<Song> findBySinger (String singerName){
        return  songRepository.findBySinger(singerName);
    }

    public List<Song> findByGenre(String genreName){
        return  songRepository.findByGenre(genreName);
    }

}
