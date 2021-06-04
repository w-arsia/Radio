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
@Table(name = "proposal_parade")
public class ProposalsParade extends RadioProgram {

    private List<Proposal> proposals;

    /*уникальное поле */
    @Id
    @GeneratedValue
    @Column(insertable = false, updatable = false)
    private int id;

    /*дата проигрывания программы */
    private Date date;
    /*время проигрывания программы */
    private Time time;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "radio_program_id")
    private RadioProgram radioProgram;


}
