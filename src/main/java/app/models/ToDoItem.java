package app.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "todo_items")
public class ToDoItem {

  @Id
  private String id;
  @Column(name = "list_id")
  private String listId;
  private String title;
  private Date created;
  private Date updated;

  public ToDoItem(String id, String listId, String title) {
    super();
    this.id = id;
    this.listId = listId;
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
    return String.format("ToDoItem[id=%s, listId='%s', title='%s']", id, listId, title);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
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