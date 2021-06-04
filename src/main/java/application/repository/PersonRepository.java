package application.repository;

import application.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository{

    Person findByName(String name);
    void save(Person person);
    void update(Person person);
    List<Person> findAll();

}
