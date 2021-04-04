package repository;

import model.Proposal;
import org.springframework.stereotype.Component;

@Component
public interface ProposalRepository {

    int getCountOfThatSongProposals();

    Proposal findById(int id);
}
