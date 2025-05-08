package UI;
import java.util.Scanner;

import Repository.ProyectoRepository;
import Repository.TareaRepository;
import Repository.UsuarioRepository;
import Service.LoginService;
import Service.ProyectoService;
import Service.TareaService;
import Service.UsuarioService;

public class MenuTarea {
    public void menuTarea(){

        Scanner scanner = new Scanner(System.in);
        TareaRepository tareaRepository = new TareaRepository();
        TareaService tareaService = new TareaService(tareaRepository);
        
        int opcion;

        do {
            try {
                System.out.println("\n--- Gestión de Tareas ---");
                System.out.println("1. Crear Tarea");
                System.out.println("2. Listar Tareas");
                System.out.println("3. Eliminar Tarea");
                System.out.println("4. Volver");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();
    
                switch (opcion) {
                case 1:
                    tareaService.agregarTarea(null);
                    break;
                case 2:
                    tareaService.agregarTarea(null);
                    break;
                case 3:
                    tareaService.eliminarTarea(opcion);
                    break;
                case 4:
                    System.out.println("volviendo");
                break;
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, intente nuevamente.");
                scanner.nextLine(); // Limpiar el buffer del Scanner
                opcion = -1; // Mantener el ciclo activo
            }
            }while(opcion != 4);
                
    }
}

