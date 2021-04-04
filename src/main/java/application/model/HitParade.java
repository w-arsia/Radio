package application.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class HitParade extends RadioProgram {

    public HitParade(List<Song> songs, Date date, Time time) {
        super(songs, date, time);
    }


}
