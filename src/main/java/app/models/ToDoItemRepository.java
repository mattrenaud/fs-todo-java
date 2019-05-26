package app.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoItemRepository extends CrudRepository<ToDoItem, String> {
}