package net.sparkworks.demo.resource.service;

import lombok.AllArgsConstructor;
import net.sparkworks.demo.resource.exception.EntityNotFoundException;
import net.sparkworks.demo.resource.model.Person;
import net.sparkworks.demo.resource.repository.PersonRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {
    
    private final PersonRepository personRepository;
    
    public Person findById(String id) {
        return personRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Person Not Found."));
    }
    
    public List<Person> findAll() {
        return personRepository.findAll();
    }
    
    public Person create(Person person) {
        return personRepository.save(person);
    }
    
    public Person update(Person person) {
        Person oldPerson = personRepository.findById(person.getId()).orElseThrow(() -> new EntityNotFoundException("Person Not Found."));
        
        if (Strings.isNotBlank(person.getName())) {
            oldPerson.setName(person.getName());
        }
        
        return personRepository.save(oldPerson);
    }
    
    public void delete(String id) {
        Person person = personRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Person Not Found."));
        personRepository.delete(person);
    }
}
