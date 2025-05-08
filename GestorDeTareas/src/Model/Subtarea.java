package Model;
public class Subtarea {
    int id;
     String nombre;
     String descripcion;
     String estado; 
     int idTareaPrincipal; 

   
    public Subtarea() {}

   
    public Subtarea(int id, String nombre, String descripcion, String estado, int idTareaPrincipal) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.idTareaPrincipal = idTareaPrincipal;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdTareaPrincipal() {
        return idTareaPrincipal;
    }

    public void setIdTareaPrincipal(int idTareaPrincipal) {
        this.idTareaPrincipal = idTareaPrincipal;
    }


    @Override
    public String toString() {
        return "Subtarea [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estado=" + estado
                + ", idTareaPrincipal=" + idTareaPrincipal + "]";
    }

    
   
    }

