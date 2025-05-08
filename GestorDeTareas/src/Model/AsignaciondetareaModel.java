package Model;
import java.time.LocalDate;

public class AsignaciondetareaModel{
     int idTarea;
    String nombreTarea;
     String descripcion;
     LocalDate fechaAsignacion;
     LocalDate fechaLimite;
     String responsable;
     String estado; 

   
    public AsignaciondetareaModel(int idTarea, String nombreTarea, String descripcion, 
                           LocalDate fechaAsignacion, LocalDate fechaLimite, String responsable) {
        this.idTarea = idTarea;
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaLimite = fechaLimite;
        this.responsable = responsable;
        this.estado = "Pendiente"; 
    }

    
    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public void completarTarea() {
        this.estado = "Completada";
        System.out.println("La tarea '" + nombreTarea + "' ha sido completada.");
    }

   
    public void editarTarea(String nuevoNombre, String nuevaDescripcion, LocalDate nuevaFechaLimite) {
        this.nombreTarea = nuevoNombre;
        this.descripcion = nuevaDescripcion;
        this.fechaLimite = nuevaFechaLimite;
        System.out.println("La tarea '" + nombreTarea + "' ha sido actualizada.");
    }

   
    public void mostrarTarea() {
        System.out.println("ID: " + idTarea);
        System.out.println("Nombre: " + nombreTarea);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha de Asignación: " + fechaAsignacion);
        System.out.println("Fecha Límite: " + fechaLimite);
        System.out.println("Responsable: " + responsable);
        System.out.println("Estado: " + estado);
    }

    
    @Override
    public String toString() {
        return "AsignaciondetareaModel [idTarea=" + idTarea + ", nombreTarea=" + nombreTarea + ", descripcion="
                + descripcion + ", fechaAsignacion=" + fechaAsignacion + ", fechaLimite=" + fechaLimite
                + ", responsable=" + responsable + ", estado=" + estado + "]";
    }


    

    public static void main(String[] args) {
       
        AsignaciondetareaModel tarea1 = new AsignaciondetareaModel(1, "Desarrollo del Proyecto", "Desarrollar la aplicación web", 
                                                    LocalDate.of(2024, 11, 24), LocalDate.of(2024, 12, 15), "Carlos");

        
        tarea1.mostrarTarea();

        tarea1.completarTarea();

        
        tarea1.editarTarea("Desarrollo del Proyecto V2", "Desarrollar la aplicación móvil", LocalDate.of(2024, 12, 30));

       
        tarea1.mostrarTarea();
    }
}
