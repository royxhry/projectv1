package Service;


import java.util.Scanner;

import Model.Proyecto;
import Repository.ProyectoRepository;

public class ProyectoService {
    ProyectoRepository listaProyectos = new ProyectoRepository();
    Scanner sc = new Scanner(System.in);
    public ProyectoService(ProyectoRepository listaProyectos){
        this.listaProyectos = listaProyectos;

    }
    

    // Crear un nuevo proyecto
    public void crearProyecto() {
        Proyecto proyecto = new Proyecto(0, null, null, null, null);

        System.out.println("Ingresa el id: ");
        proyecto.setId(sc.nextInt());
        sc.nextLine(); 

        System.out.println("Ingresa el título: ");
        proyecto.setTitle(sc.nextLine());

        System.out.println("Ingresa la descripción: ");
        proyecto.setDescription(sc.nextLine());

        System.out.println("Fecha de creación: ");
        proyecto.setCreatedAt(sc.nextLine());

        System.out.println("Ingresa la fecha de vencimiento (formato: yyyy-MM-dd HH:mm): ");
        proyecto.setDueDate(sc.nextLine());

        listaProyectos.addProyecto(proyecto);
        System.out.println("Proyecto creado con éxito.");
    }

    // Editar un proyecto existente
    public void editarProyecto() {
        System.out.println("Ingresa el id del proyecto que quieres editar:");
        int id = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea pendiente

        Proyecto proyecto = getProyectoById(id);
        if (proyecto == null) {
            System.out.println("Proyecto no encontrado.");
            return;
        }

        System.out.println("Ingresa el nuevo título (deja en blanco para mantener el actual): ");
        String nuevoTitulo = sc.nextLine();
        if (!nuevoTitulo.isEmpty()) {
            proyecto.setTitle(nuevoTitulo);
        }

        System.out.println("Ingresa la nueva descripción (deja en blanco para mantener la actual): ");
        String nuevaDescripcion = sc.nextLine();
        if (!nuevaDescripcion.isEmpty()) {
            proyecto.setDescription(nuevaDescripcion);
        }

        System.out.println("Proyecto editado con éxito.");
    }

    public Proyecto getProyectoById(int id) {
        return getProyectoById(id);
    }

    public void eliminarProyecto() {
        System.out.println("Ingresa el id del proyecto que deseas eliminar");
        
        int id = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea pendiente

        boolean eliminar = listaProyectos.eliminarProyectoPorId(id);
        if(eliminar){
            System.out.println("El proyecto ha sido eliminado");
        }else{
            System.out.println("El proyecto no pudo ser eliminado. Error de id?");
        }
    
    }

    
    public void consultarProyecto() {
    try {
        
        for (Proyecto proyecto : listaProyectos.listProyectos) {
            System.out.println(proyecto);
        }
        
    } catch (Exception e) {
        System.out.println("Ocurrio un error al consultar los usuarios");
    }
}
}