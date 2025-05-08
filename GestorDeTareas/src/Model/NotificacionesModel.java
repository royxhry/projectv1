package Model;

import java.time.LocalDateTime;

public class NotificacionesModel {
     int id;
     String titulo;
     String mensaje;
     String fechaHora; 
     boolean leida; 
    

    
    public NotificacionesModel() {}

    public NotificacionesModel(int id, String titulo, String mensaje, String fechaHora, boolean leida) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
        this.leida = leida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public boolean isLeida() {
        return leida;
    }

    public void setLeida(boolean leida) {
        this.leida = leida;
    }

    public void marcarComoLeida() {
        this.leida = true;
        System.out.println("Notificación marcada como leída: " + this.toString());
    }

    public void mostrar() {
        System.out.println("Notificación: " + this.toString());
    }

    @Override
    public String toString() {
        return "Notificacion [id=" + id + ", titulo=" + titulo + ", mensaje=" + mensaje + ", fechaHora=" + fechaHora
                + ", leida=" + leida + "]";
    }

   
    }

