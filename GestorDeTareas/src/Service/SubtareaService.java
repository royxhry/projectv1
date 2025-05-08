package Service;

import java.util.Scanner;
import Model.Subtarea;
import Repository.SubtareaRepository;

public class SubtareaService {
 SubtareaRepository subtareaRepository = new SubtareaRepository();
   Scanner sc = new Scanner(System.in);

   
    public void crearSubtarea() {
        Subtarea subtarea = new Subtarea();

        System.out.println("Ingresa el ID de la subtarea:");
        subtarea.setId(sc.nextInt());
 

        System.out.println("Ingresa el nombre de la subtarea:");
        subtarea.setNombre(sc.nextLine());

        System.out.println("Ingresa la descripción de la subtarea:");
        subtarea.setDescripcion(sc.nextLine());

        System.out.println("Ingresa el estado de la subtarea:");
        subtarea.setEstado(sc.nextLine());

        System.out.println("Ingresa el ID de la tarea principal:");
        subtarea.setIdTareaPrincipal(sc.nextInt());
      

        subtareaRepository.agregarSubtarea(subtarea);
        System.out.println("Subtarea creada con éxito.");
    }

    
    public void editarSubtarea() {
        System.out.println("Ingresa el ID de la subtarea que deseas editar:");
        int id = sc.nextInt();
        

        Subtarea subtarea = subtareaRepository.buscarSubtareaPorId(id);
        if (subtarea == null) {
            System.out.println("Subtarea no encontrada.");
            return;
        }

        System.out.println("Ingresa el nuevo nombre (deja en blanco para mantener el actual):");
        String nuevoNombre = sc.nextLine();
        if (!nuevoNombre.isEmpty()) {
            subtarea.setNombre(nuevoNombre);
        }

        System.out.println("Ingresa la nueva descripción (deja en blanco para mantener la actual):");
        String nuevaDescripcion = sc.nextLine();
        if (!nuevaDescripcion.isEmpty()) {
            subtarea.setDescripcion(nuevaDescripcion);
        }

        System.out.println("Ingresa el nuevo estado (deja en blanco para mantener el actual):");
        String nuevoEstado = sc.nextLine();
        if (!nuevoEstado.isEmpty()) {
            subtarea.setEstado(nuevoEstado);
        }

        System.out.println("Subtarea editada con éxito.");
    }

    
    public void eliminarSubtarea() {
        System.out.println("Ingresa el ID de la subtarea que deseas eliminar:");
        int id = sc.nextInt();
        sc.nextLine(); 

        boolean eliminado = subtareaRepository.eliminarSubtarea(id);
        if (eliminado) {
            System.out.println("Subtarea eliminada con éxito.");
        } else {
            System.out.println("No se encontró una subtarea con ese ID.");
        }
    }

    
    public void consultarSubtareas() {
        System.out.println("Subtareas registradas:");
        for (Subtarea subtarea : subtareaRepository.obtenerTodasLasSubtareas()) {
            System.out.println(subtarea);
        }
    }
}
