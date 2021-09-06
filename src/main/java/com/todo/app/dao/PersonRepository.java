package com.todo.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.todo.app.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    Optional<Person> findPersonByUsername(String username);
}
