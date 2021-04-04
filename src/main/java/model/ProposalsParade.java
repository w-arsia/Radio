package model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class ProposalsParade extends RadioProgram {

    private List<Proposal> proposals;

    public ProposalsParade(List<Song> songs, Date date, Time time, List<Proposal> proposals) {
        super(songs, date, time);
        this.proposals = proposals;
    }

    public List<Proposal> getProposals() {
        return proposals;
    }

    public void setProposals(List<Proposal> proposals) {
        this.proposals = proposals;
    }


}
