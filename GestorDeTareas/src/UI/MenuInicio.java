package UI;

import java.util.Scanner;

public class MenuInicio {
    public void menuInicio() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        MenuLogin ml = new MenuLogin();
        MenuUsuario mu = new MenuUsuario();
        MenuTarea mt = new MenuTarea();
        MenuProyecto mp = new MenuProyecto();
        MenuNotificaciones mn = new MenuNotificaciones();

        try {
            boolean sesionIniciada = ml.menuLogin();
            if (!sesionIniciada) {
                System.out.println("No se pudo iniciar sesión. Saliendo...");
                return; // Termina el programa si no inicia sesión
            }

            do {
                System.out.println("\n=== Menú Principal ===");
                System.out.println("1. Gestión de Usuarios");
                System.out.println("2. Gestión de Tareas");
                System.out.println("3. Gestión de Proyectos");
                System.out.println("4. Gestión de Notificaciones");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next();
                }
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        mu.menuUsuario();
                        break;
                    case 2:
                        mt.menuTarea();
                        break;
                    case 3:
                        mp.menuProyecto();
                        break;
                    case 4:
                    mn.menuNotificaciones();
                        
                        break;
                    case 5:
                    System.out.println("Adiós.");
                    break;
                    
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                        break;
                }
            } while (opcion != 5);
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
