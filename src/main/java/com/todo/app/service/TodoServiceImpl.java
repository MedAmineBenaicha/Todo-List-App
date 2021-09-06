package com.todo.app.service;

import com.todo.app.dao.TodoRepository;
import com.todo.app.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    @Override
    public Optional<Todo> getById(long id) {
        Optional<Todo> todo = Optional.of(todoRepository.getById(id));
        if(todo.isEmpty()){
            return null;
        }
        return todo;
    }

    @Override
    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void update(Todo todo) {

    }

    @Override
    public void deleteById(long id) {
        todoRepository.deleteById(id);
    }
}
