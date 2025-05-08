package Model;

import java.util.ArrayList;
import java.util.List;

public class DependenciadetareasModel {
    private int idTarea;                     // ID único de la tarea
    private String nombreTarea;             // Nombre de la tarea
    private String descripcion;             // Descripción de la tarea
    private List< DependenciadetareasModel> dependencias; // Lista de dependencias

    // Constructor
    public  DependenciadetareasModel(int idTarea, String nombreTarea, String descripcion) {
        this.idTarea = idTarea;
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.dependencias = new ArrayList<>(); // Inicializar la lista de dependencias
    }

    // Getters y setters
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

    public List< DependenciadetareasModel> getDependencias() {
        return dependencias;
    }

    // Métodos para gestionar dependencias
    public void agregarDependencia( DependenciadetareasModel tarea) {
        dependencias.add(tarea);
    }

    public void eliminarDependencia( DependenciadetareasModel tarea) {
        dependencias.remove(tarea);
    }

    public void mostrarDependencias() {
        if (dependencias.isEmpty()) {
            System.out.println("La tarea '" + nombreTarea + "' no tiene dependencias.");
        } else {
            System.out.println("Dependencias de la tarea '" + nombreTarea + "':");
            for ( DependenciadetareasModel tarea : dependencias) {
                System.out.println("- " + tarea.getNombreTarea());
            }
        }
    }

    // Verificar si la tarea está bloqueada
    public boolean estaBloqueada() {
        return !dependencias.isEmpty();
    }

    // Sobrescribir toString para mostrar la tarea
    @Override
    public String toString() {
        return "DependenciaDeTareasModel{" +
                "idTarea=" + idTarea +
                ", nombreTarea='" + nombreTarea + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", dependencias=" + dependencias +
                '}';
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear tareas
        DependenciadetareasModel tarea1 = new  DependenciadetareasModel(1, "Diseñar el proyecto", "Crear el diseño inicial del proyecto.");
        DependenciadetareasModel tarea2 = new  DependenciadetareasModel(2, "Desarrollar funcionalidades", "Desarrollar las funciones principales del proyecto.");
        DependenciadetareasModel tarea3 = new  DependenciadetareasModel(3, "Testear funcionalidades", "Realizar pruebas de las funcionalidades del proyecto.");

        // Agregar dependencias
        tarea2.agregarDependencia(tarea1); // La tarea 2 depende de la tarea 1
        tarea3.agregarDependencia(tarea2); // La tarea 3 depende de la tarea 2

        // Mostrar dependencias
        tarea1.mostrarDependencias();
        tarea2.mostrarDependencias();
        tarea3.mostrarDependencias();

        // Verificar si están bloqueadas
        System.out.println("¿La tarea 'Desarrollar funcionalidades' está bloqueada? " + tarea2.estaBloqueada());
        System.out.println("¿La tarea 'Testear funcionalidades' está bloqueada? " + tarea3.estaBloqueada());

        // Eliminar una dependencia y mostrar nuevamente
        tarea3.eliminarDependencia(tarea2);
        tarea3.mostrarDependencias();
    }
}
