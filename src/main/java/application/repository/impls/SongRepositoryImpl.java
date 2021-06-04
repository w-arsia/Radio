package application.repository.impls;

import application.mapper.PersonRowMapper;
import application.model.Song;
import application.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.swing.tree.RowMapper;
import java.util.List;
@Component
public class SongRepositoryImpl implements SongRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Song findByName(String name) {
        Song song = jdbcTemplate.queryForObject("SELECT * FROM song WHERE s.song_name = ?",
                new Object[]{name}, BeanPropertyRowMapper.newInstance(Song.class));
        return song;
    }

    @Override
    public List<Song> findBySinger(String singerName) {
        List<Song> songList = jdbcTemplate.query(
                "SELECT * FROM song s JOIN person p ON p.id = s.autor_id WHERE lower(p.person_name) LIKE lower(?) ",
                new Object[]{singerName + "%"}, BeanPropertyRowMapper.newInstance(Song.class));
        return songList;
    }

    @Override
    public List<Song> findByGenre(String genreName) {
        List<Song> songList = jdbcTemplate.query(
                "SELECT * FROM song s WHERE s.genre = ? ",
                new Object[]{genreName}, BeanPropertyRowMapper.newInstance(Song.class));
        return songList;
    }


}
