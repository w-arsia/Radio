package application.mapper;

import application.model.Song;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SongRowMapper implements RowMapper<Song> {

    @Override
    public Song mapRow(ResultSet resultSet, int i) throws SQLException {
        Song song = new Song();
        song.setId(resultSet.getInt("id"));
        song.setAuthor(new PersonRowMapper().mapRow(resultSet, i));  /*поменять*/
        song.setSinger(new PersonRowMapper().mapRow(resultSet, i));
        song.setRating(resultSet.getInt("rating"));
        song.setTime(resultSet.getInt("duration"));
        song.setReleaseDate(resultSet.getDate("release_date"));
        song.setAlbumName(resultSet.getString("album_name"));
        return song;
    }
}
