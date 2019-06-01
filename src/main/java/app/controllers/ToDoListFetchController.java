package app.controllers;

import javax.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import app.models.ToDoListRepository;

@RepositoryRestController
@RequestMapping("todolist")
public class ToDoListFetchController {
  @Autowired
  private ToDoListRepository repo;

  @GetMapping(value = { "{id}" })
  @ResponseBody
  public Map<String,String> index(@PathVariable String id) {
    final var list = repo.findById(id);
    if (!list.isPresent()){
      return null;
    }
    final var m = new HashMap<String,String>();
    m.put("one","two");
    return m;
  }

  // @ResponseBody
  // @ExceptionHandler(Exception.class)
  // public String handleException(HttpServletRequest request, Exception e) {
  //   e.printStackTrace();
    
  //   return "!!!!!!!!!! " + e.getMessage() + " " + request.getHeader("Accept");
  // }
}