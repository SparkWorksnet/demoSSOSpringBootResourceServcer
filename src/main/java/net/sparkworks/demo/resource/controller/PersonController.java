package net.sparkworks.demo.resource.controller;

import lombok.AllArgsConstructor;
import net.sparkworks.demo.resource.model.Person;
import net.sparkworks.demo.resource.service.PersonService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/person")
public class PersonController {
    
    private final PersonService personService;
    
    @GetMapping
    public List<Person> list() {
        return personService.findAll();
    }
    
    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") String id) {
        return personService.findById(id);
    }
    
    @PostMapping
    public Person create(@RequestBody(required = true) Person person) {
        return personService.create(person);
    }
    
    @PutMapping
    public Person update(@RequestBody(required = true) Person person) {
        return personService.update(person);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        personService.delete(id);
    }
}

