package model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public abstract class RadioProgram {

    private static int countId;
    /*уникальное поле */
    private int id;
    /*список выбранных песен*/
    private List<Song> songs;
    /*дата проигрывания программы */
    private Date date;
    /*время проигрывания программы */
    private Time time;


    public RadioProgram(List<Song> songs, Date date, Time time) {
        this.id = ++countId;
        this.songs = songs;
        this.date = date;
        this.time = time;
    }

    public int getId() { return id; }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
