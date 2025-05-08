package Model;


public class Proyecto {
        int id;
        String title;
        String description;
        String createdAt;
        String dueDate;
        public Proyecto(int id, String title, String description, String createdAt, String dueDate){
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
        public String getCreatedAt() {
            return createdAt;
        }
        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }
        public String getDueDate() {
            return dueDate;
        }
        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }
        @Override
        public String toString() {
            return "Proyecto [id=" + id + ", title=" + title + ", description=" + description + ", createdAt=" + createdAt
            + ", dueDate=" + dueDate + "]";
        }
        
    }
    