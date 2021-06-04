package application.repository.impls;

import application.mapper.PersonRowMapper;
import application.model.Person;
import application.model.Song;
import application.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Person findByName(String name) {
        Person person = jdbcTemplate.queryForObject("SELECT * FROM person p WHERE p.person_name = ?",
                new Object[]{name}, new PersonRowMapper());
        return person;
    }

    @Override
    public void save(Person person) {
        jdbcTemplate.update("INSERT INTO person(person_name) VALUES(?)", person.getName());
    }


    @Override
    public void update(Person person) {
        jdbcTemplate.update("UPDATE person SET person_name = ? WHERE id=?", person.getName(),person.getId());
    }

    @Override
    public List<Person> findAll() {
        List<Person> personList = jdbcTemplate.query("SELECT * FROM person",(rs,i ) -> new PersonRowMapper().mapRow(rs,i));
        return personList;
    }
}
