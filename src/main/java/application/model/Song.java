package application.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {

    /*уникальное поле */
    private int id;
    /*название песни */
    private String songName;
    /*список авторов*/
    private Person author;
    /*список исполнителей*/
    private Person singer;
    /*продолжительность песни*/
    private double time;
    /*рейтинг песни*/
    private double rating;
    /*дата релиза*/
    private Date releaseDate;
    /*название альбома*/
    private String albumName;


}
