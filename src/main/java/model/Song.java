package model;


import java.util.List;

public class Song {

    private static int countId;
    /*уникальное поле */
    private int id;
    /*название песни */
    private String songName;
    /*список авторов*/
    private List<Person> authors;
    /*список исполнителей*/
    private Person singer;
    /*продолжительность песни*/
    private double time;
    /*рейтинг песни*/
    private double rating;

    public Song(String songName, List<Person> authors, Person singer, double time, double rating) {
        this.id = ++countId;
        this.songName = songName;
        this.authors = authors;
        this.singer = singer;
        this.time = time;
        this.rating = rating;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public List<Person> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Person> authors) {
        this.authors = authors;
    }

    public Person getSinger() {
        return singer;
    }

    public void setSinger(Person singer) {
        this.singer = singer;
    }
}
