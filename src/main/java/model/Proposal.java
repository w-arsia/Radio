package model;

import java.util.List;

public class Proposal {

    private static int countId;
    /*уникальное поле */
    private int id;
    /*название песни */
    private String songName;
    /*список исполнителей*/
    private List<Person> singers;
    /*имя слушателя*/
    private Person listener;

    public Proposal(String songName, List<Person> singers, Person listener) {
        this.id = ++countId;
        this.songName = songName;
        this.singers = singers;
        this.listener = listener;
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

    public List<Person> getSingers() {
        return singers;
    }

    public void setSingers(List<Person> singers) {
        this.singers = singers;
    }

    public Person getListener() {
        return listener;
    }

    public void setListener(Person listener) {
        this.listener = listener;
    }
}
