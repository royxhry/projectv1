package Model;
import java.time.LocalDate;

public class RevisiondetareasModel {
    private int idRevision;         
    private int idTarea;             
    private String revisor;          
    private LocalDate fechaRevision; 
    private String comentario;       
    private String estado;           

    public RevisiondetareasModel(int idRevision, int idTarea, String revisor, LocalDate fechaRevision, String comentario, String estado) {
        this.idRevision = idRevision;
        this.idTarea = idTarea;
        this.revisor = revisor;
        this.fechaRevision = fechaRevision;
        this.comentario = comentario;
        this.estado = estado;
    }

    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public LocalDate getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void aprobarTarea() {
        this.estado = "Aprobada";
        System.out.println("La tarea " + idTarea + " ha sido aprobada.");
    }

    public void noAprobarTarea() {
        this.estado = "No Aprobada";
        System.out.println("La tarea " + idTarea + " ha sido marcada como no aprobada.");
    }

    
    public void actualizarComentario(String nuevoComentario) {
        this.comentario = nuevoComentario;
        System.out.println("El comentario de la tarea " + idTarea + " ha sido actualizado.");
    }

    
    public void mostrarRevision() {
        System.out.println("Revisión de tarea: ");
        System.out.println("ID de revisión: " + idRevision);
        System.out.println("ID de tarea: " + idTarea);
        System.out.println("Revisor: " + revisor);
        System.out.println("Fecha de revisión: " + fechaRevision);
        System.out.println("Comentario: " + comentario);
        System.out.println("Estado de la revisión: " + estado);
    }

    @Override
    public String toString() {
        return "RevisionTarea{" +
                "idRevision=" + idRevision +
                ", idTarea=" + idTarea +
                ", revisor='" + revisor + '\'' +
                ", fechaRevision=" + fechaRevision +
                ", comentario='" + comentario + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    
    public static void main(String[] args) {
       
        RevisiondetareasModel revision = new RevisiondetareasModel(1, 101, "Carlos", LocalDate.of(2024, 11, 24), "La tarea está completa, pero necesita ajustes en el diseño.", "En Progreso");

        
        revision.mostrarRevision();

        
        revision.aprobarTarea();

      
        revision.actualizarComentario("La tarea ha sido revisada y está lista para ser entregada.");

        
        revision.mostrarRevision();
    }
}
