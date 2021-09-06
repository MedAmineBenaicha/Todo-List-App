package com.todo.app.service;

import com.todo.app.dao.PersonRepository;
import com.todo.app.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> getById(Long id) {
        Optional<Person> person = personRepository.findById(id);
        if(person.isEmpty()) return null;

        return person;
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
