package com.todo.app.controller;

import com.todo.app.model.Person;
import com.todo.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> getPersons()
    {
        return personService.getAll();
    }
    @GetMapping("/persons/{personId}")
    public Optional<Person> getPersonById(@PathVariable long personId)
    {
        return personService.getById(personId);
    }
    @PostMapping("/persons")
    public void savePerson(@RequestBody Person person) {
        personService.save(person);
    }

    @DeleteMapping("/persons/{personId}")
    public void deletePersonById(@PathVariable long personId)
    {
        personService.deleteById(personId);
    }
}
