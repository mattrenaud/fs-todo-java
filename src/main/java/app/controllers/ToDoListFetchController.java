package app.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import app.models.ToDoList;
import app.models.ToDoListRepository;

@RepositoryRestController
@RequestMapping("todolist")
public class ToDoListFetchController {

  @Autowired
  private ToDoListRepository repo;

  @GetMapping("{id}")
  public Optional<ToDoList> index(@PathVariable String id) {
    return repo.findById(id);
  }
}