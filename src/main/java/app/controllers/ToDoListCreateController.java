package app.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app.models.ToDoListRepository;
import app.models.ToDoList;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public class ToDoListCreateController {

  @Autowired
  private ToDoListRepository repo;

  @RequestMapping(value = "/todolist/{id}", method = POST)
  public ToDoList index(@PathVariable String id, @RequestParam String title) {
    return repo.save(new ToDoList(id, title));
  }
}