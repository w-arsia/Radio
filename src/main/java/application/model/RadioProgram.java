package application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "radio_program")
public class RadioProgram {

    /*уникальное поле */
    @Id
    @GeneratedValue
    @Column(insertable = false, updatable = false)
    private int id;
    /*список выбранных песен*/
    private List<Song> songs;

}
