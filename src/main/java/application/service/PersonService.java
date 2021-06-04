package application.service;

import application.model.Person;
import application.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository  personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person findByName(String name){
        return personRepository.findByName(name);
    }

    public void save(Person person){
        personRepository.save(person);
    }

    public void update(Person person){
        personRepository.update(person);
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

}
