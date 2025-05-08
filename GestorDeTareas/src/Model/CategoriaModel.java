package Model;

public class CategoriaModel {
     int id;
     String nombre;
     String descripcion;

    
    public CategoriaModel() {}

    
    public CategoriaModel(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    
    
    @Override
    public String toString() {
        return "Categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
    }



    

    
    public void crearCategoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        System.out.println("Categoría creada: " + this.toString());
    }

    public void editarCategoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        System.out.println("Categoría editada: " + this.toString());
    }

    public void eliminarCategoria() {
        System.out.println("Categoría eliminada: " + this.toString());
        this.id = 0;
        this.nombre = null;
        this.descripcion = null;
    }


}
