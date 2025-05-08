package Model;
import java.time.LocalDateTime;

public class Tarea {
    int id;
    String title;
    String description;
    LocalDateTime createdAt;
    LocalDateTime dueDate;
    public Tarea(int id, String title, String description, LocalDateTime createdAt, LocalDateTime dueDate){
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.dueDate = dueDate;

    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
    @Override
    public String toString() {
        return "Task [id=" + id + ", title=" + title + ", description=" + description + ", createdAt=" + createdAt
        + ", dueDate=" + dueDate + "]";
    }
    
}
