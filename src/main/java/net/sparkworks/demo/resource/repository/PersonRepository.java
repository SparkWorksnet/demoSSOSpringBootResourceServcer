package net.sparkworks.demo.resource.repository;

import net.sparkworks.demo.resource.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends MongoRepository<Person, String> {
    
    Optional<Person> findById(String id);
    
    List<Person> findAll();
    
}
