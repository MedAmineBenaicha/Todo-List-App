package com.todo.app.service;

import com.todo.app.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    public List<Person> getAll();
    public Optional<Person> getById(Long id);
    public void save(Person person);
    public void update(Person person);
    public void deleteById(Long id);
}
