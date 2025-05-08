package Model;
public class EtiquetaModel {
     int id;            
     String nombre;     
     String color;      

    
    public EtiquetaModel(int id, String nombre, String color) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarEtiqueta() {
        System.out.println("Etiqueta ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
    }

    @Override
    public String toString() {
        return "Etiqueta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        EtiquetaModel etiqueta1 = new EtiquetaModel(1, "Urgente", "#FF0000");
        EtiquetaModel etiqueta2 = new EtiquetaModel(2, "En progreso", "#FFFF00");
        EtiquetaModel etiqueta3 = new EtiquetaModel(3, "Revisión", "#00FF00");

       
        etiqueta1.mostrarEtiqueta();
        etiqueta2.mostrarEtiqueta();
        etiqueta3.mostrarEtiqueta();

       
        etiqueta2.setNombre("Finalizado");
        etiqueta2.setColor("#0000FF");

       
        System.out.println("\nEtiqueta modificada:");
        etiqueta2.mostrarEtiqueta();
    }
}
