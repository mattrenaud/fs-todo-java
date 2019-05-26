package app.controllers;

import java.util.Optional;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import app.models.ToDoItem;
import app.models.ToDoItemRepository;

@RepositoryRestController
public class ToDoItemFetchController {

  private ToDoItemRepository repo;

  @RequestMapping(value = "/todolist/{id}")
  public Optional<ToDoItem> index(@PathVariable String id) {
        return repo.findById(id);
    }
}