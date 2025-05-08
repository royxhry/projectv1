package Model;

import java.time.LocalDateTime;

public class ReportedetareasModel {

    private int idReporte;           
    private int idTarea;              
    private String titulo;           
    private String descripcion;       
    private String autor;            
    private LocalDateTime fechaCreacion; 
    private String estado;            

    public ReportedetareasModel(int idReporte, int idTarea, String titulo, String descripcion, String autor, String estado) {
        this.idReporte = idReporte;
        this.idTarea = idTarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
        this.fechaCreacion = LocalDateTime.now(); 
        this.estado = estado;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public void mostrarReporte() {
        System.out.println("Reporte ID: " + idReporte);
        System.out.println("ID Tarea Asociada: " + idTarea);
        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha de Creación: " + fechaCreacion);
        System.out.println("Estado: " + estado);
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado del reporte ha sido actualizado a: " + nuevoEstado);
    }

 
   
    @Override
    public String toString() {
        return "ReportedetareasModel [idReporte=" + idReporte + ", idTarea=" + idTarea + ", titulo=" + titulo
                + ", descripcion=" + descripcion + ", autor=" + autor + ", fechaCreacion=" + fechaCreacion + ", estado="
                + estado + "]";
    }



    

    
    public static void main(String[] args) {
        
        ReportedetareasModel reporte = new ReportedetareasModel(1, 101, "Reporte de Progreso", "Se ha completado el 50% de la tarea.", "Juan Pérez", "Pendiente");

        
        reporte.mostrarReporte();

        
        reporte.actualizarEstado("Revisado");

        
        System.out.println(reporte);
    }
}
