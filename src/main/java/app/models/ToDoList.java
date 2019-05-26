package app.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "todo_lists")
public class ToDoList {

  @Id
  private String id;
  private String title;
  private Date created;
  private Date updated;

  public ToDoList(String id, String title) {
    super();
    this.id = id;
    this.title = title;
  }

  @PrePersist
  protected void onCreate() {
    created = new Date();
  }

  @PreUpdate
  protected void onUpdate() {
    updated = new Date();
  }

  @Override
  public String toString() {
    return String.format("ToDoItem[id=%s, title='%s']", id, title);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getCreated() {
    return created;
  }

  public Date getUpdated() {
    return updated;
  }

}