package Service;

import Model.Tarea;
import Repository.TareaRepository;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TareaService {
    private TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public void agregarTarea(Tarea tarea) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la tarea: ");
        int id = scanner.nextInt();
        System.out.println("Ingrese el título de la tarea: ");
        String title = scanner.nextLine();
        System.out.println("Ingrese la descripción de la tarea: ");
        String description = scanner.nextLine();
        System.out.println("Ingrese el año de vencimiento (YYYY): ");
        int year = scanner.nextInt();
        System.out.println("Ingrese el mes de vencimiento (1-12): ");
        int month = scanner.nextInt();
        System.out.println("Ingrese el día de vencimiento: ");
        int day = scanner.nextInt();
        LocalDateTime createdAt = LocalDateTime.now();
        LocalDateTime dueDate = LocalDateTime.of(year, month, day, 0, 0);

        Tarea nuevaTarea = new Tarea(id, title, description, createdAt, dueDate);
        tareaRepository.agregarTarea(nuevaTarea);
        System.out.println("Tarea agregada correctamente.");
        
    }

    public void listarTareas() {
        System.out.println("Listado de tareas:");
        for (Tarea tarea : tareaRepository.obtenerTodasLasTareas()) {
            System.out.println(tarea);
        }
    }

    public void eliminarTarea(int id) {
        if (tareaRepository.eliminarTarea(id)) {
            System.out.println("Tarea eliminada correctamente.");
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }
}
