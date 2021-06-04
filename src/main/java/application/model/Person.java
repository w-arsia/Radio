package application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
public class Person{

    /*уникальное поле */
    @Id
    @GeneratedValue
    @Column(insertable = false, updatable = false)
    private int id;
    /*имя/псевдоним*/
    private String name;

}
