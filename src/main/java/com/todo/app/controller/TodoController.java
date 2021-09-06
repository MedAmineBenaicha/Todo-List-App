package com.todo.app.controller;

import com.todo.app.model.Todo;
import com.todo.app.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> getTodos()
    {
        return todoService.getAll();
    }
    @GetMapping("/todos/{todoId}")
    public Optional<Todo> getTodoById(@PathVariable long todoId)
    {
        return todoService.getById(todoId);
    }
    @PostMapping("/todos")
    public void saveTodo(@RequestBody Todo todo) {
        todoService.save(todo);
    }

    @DeleteMapping("/todos/{todoId}")
    public void deleteTodoById(@PathVariable long todoId)
    {
        todoService.deleteById(todoId);
    }
}
