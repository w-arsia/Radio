package application.mapper;

import application.model.Proposal;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProposalRowMapper implements RowMapper<Proposal> {
    public Proposal mapRow(ResultSet resultSet, int i) throws SQLException {
        Proposal proposal = new Proposal();
        proposal.setId(resultSet.getInt("id"));
        proposal.setSongName(resultSet.getString("song_name"));
        proposal.setSinger(new PersonRowMapper().mapRow(resultSet, i));
        proposal.setListener(new PersonRowMapper().mapRow(resultSet, i));   //вот тут это должны быть разные люди
        return proposal;
    }
}
