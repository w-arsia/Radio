package model;

import java.util.Date;
import java.util.List;

public class Album {

    private static int countId;
    /*уникальное поле */
    private int id;
    /*список жанров */
    private List<Genre> genres;
    /*список песне */
    private List<Song> songs;
    /*исполнитель */
    private Person singer;
    /*название альбома */
    private String albumName;
    /*дата выхода */
    private Date albumDate;

    public Album(List<Genre> genres, List<Song> songs, Person singer, String albumName, Date albumDate) {
        this.id = ++countId;
        this.genres = genres;
        this.songs = songs;
        this.singer = singer;
        this.albumName = albumName;
        this.albumDate = albumDate;
    }

    public int getId() {
        return id;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Person getSinger() {
        return singer;
    }

    public void setSinger(Person singer) {
        this.singer = singer;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getAlbumDate() {
        return albumDate;
    }

    public void setAlbumDate(Date albumDate) {
        this.albumDate = albumDate;
    }
}
