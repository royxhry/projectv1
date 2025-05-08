package UI;

import java.util.Scanner;

import Model.NotificacionesModel;
import Service.NotificacionesService;
import Repository.NotificacionesRepository;
class MenuNotificaciones {

    NotificacionesRepository repository = new NotificacionesRepository();
    NotificacionesService service = new NotificacionesService(repository);

    int opcion;
public void menuNotificaciones(){
    Scanner scanner = new Scanner(System.in);
    do {
        try{
        System.out.println("\nMenú de Notificaciones:");
        System.out.println("1. Crear notificación");
        System.out.println("2. Ver todas las notificaciones");
        System.out.println("3. Ver notificación por ID");
        System.out.println("4. Marcar notificación como leída");
        System.out.println("5. Eliminar notificación");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        
            switch (opcion) {
                case 1:
                System.out.print("Ingrese ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese título: ");
                String titulo = scanner.nextLine();
                System.out.print("Ingrese mensaje: ");
                String mensaje = scanner.nextLine();
                    System.out.print("Ingrese fecha y hora (YYYY-MM-DD HH:MM): ");
                    String fechaHora = scanner.nextLine();
                    service.crearNotificacion(id, titulo, mensaje, fechaHora);
                    System.out.println("Notificación creada exitosamente.");
                    break;
                    
                    case 2:
                    System.out.println("Notificaciones:");
                    for (NotificacionesModel n : service.obtenerTodasLasNotificaciones()) {
                        System.out.println(n);
                    }
                    break;
                    
                    case 3:
                    System.out.print("Ingrese ID de la notificación: ");
                    id = scanner.nextInt();
                    NotificacionesModel notificacion = service.obtenerNotificacionPorId(id);
                    if (notificacion != null) {
                        System.out.println(notificacion);
                    } else {
                        System.out.println("No se encontró la notificación con ese ID.");
                    }
                    break;
                    
                    case 4:
                    System.out.print("Ingrese ID de la notificación a marcar como leída: ");
                    id = scanner.nextInt();
                    service.marcarNotificacionComoLeida(id);
                    break;
                    
                    case 5:
                    System.out.print("Ingrese ID de la notificación a eliminar: ");
                    id = scanner.nextInt();
                    service.eliminarNotificacion(id);
                    break;
                    
                    case 6:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                    
                    default:
                    System.out.println("Opción no válida, intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, intente nuevamente.");
                scanner.nextLine(); // Limpiar el buffer del Scanner
                opcion = -1; // Mantener el ciclo activo
            }
            } while (opcion !=6);
        }
    }
