package UI;

import java.util.Scanner;
import Service.LoginService;

public class MenuLogin {
    public boolean menuLogin() {
        Scanner scanner = new Scanner(System.in);
        LoginService loginService = new LoginService();

        int opcion;
        boolean sesionIniciada = false;

        do {
            try {
                System.out.println("\n=== Menú de Inicio ===");
                System.out.println("1. Iniciar Sesión");
                System.out.println("2. Registrarse");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la línea restante

                switch (opcion) {
                    case 1:
                        sesionIniciada = loginService.inicioSecion();
                        if (sesionIniciada) {
                            return true; // Salir del menú de login y continuar
                        } else {
                            System.out.println("Inicio de sesión fallido. Intente nuevamente.");
                        }
                        break;
                    case 2:
                        loginService.registroUser();
                        break;
                    case 0:
                        System.out.println("Saliendo del menú de inicio.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, intente nuevamente.");
                scanner.nextLine(); // Limpiar el buffer del Scanner
                opcion = -1; // Mantener el ciclo activo
            }
        } while (opcion != 0);

        return false; // Si no inició sesión, retorna falso
    }
}
