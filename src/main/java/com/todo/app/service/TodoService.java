package com.todo.app.service;

import com.todo.app.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    public List<Todo> getAll();
    public Optional<Todo> getById(long id);
    public void save(Todo todo);
    public void update(Todo todo);
    public void deleteById(long id);
}
