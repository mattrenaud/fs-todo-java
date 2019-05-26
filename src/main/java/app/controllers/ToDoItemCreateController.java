package app.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app.models.ToDoItem;
import app.models.ToDoItemRepository;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public class ToDoItemCreateController {
  private ToDoItemRepository repo;

  @RequestMapping(value = "/todoitem/{id}", method = POST)
  public ToDoItem index(@PathVariable String id, @RequestParam String listId, @RequestParam String title) {
    return repo.save(new ToDoItem(id, listId, title));
  }
}