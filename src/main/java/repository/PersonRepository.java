package repository;

import model.Person;
import org.springframework.stereotype.Component;

@Component
public interface PersonRepository {

    Person findByName(String name);

}
