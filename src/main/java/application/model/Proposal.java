package application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proposal {

    /*уникальное поле */
    private int id;
    /*название песни */
    private String songName;
    /*список исполнителей*/
    private Person singer;
    /*имя слушателя*/
    private Person listener;

}
