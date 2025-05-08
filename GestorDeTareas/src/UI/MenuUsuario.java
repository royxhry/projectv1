package UI;
import java.util.Scanner;

import Repository.ProyectoRepository;
import Repository.TareaRepository;
import Repository.UsuarioRepository;
import Service.LoginService;
import Service.ProyectoService;
import Service.TareaService;
import Service.UsuarioService;

public class MenuUsuario {
    public void menuUsuario(){
       
        LoginService ls =new LoginService();
        
        
      
            
        int q;
        Scanner scanner = new Scanner(System.in);

        
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        UsuarioService usuarioService = new UsuarioService(usuarioRepository);

        TareaRepository tareaRepository = new TareaRepository();
        TareaService tareaService = new TareaService(tareaRepository);
        ProyectoRepository proyectoRepository = new ProyectoRepository();
        ProyectoService proyectoService = new ProyectoService(proyectoRepository);

        int opcion;

        do {
            try {
                
                System.out.println("\n--- Gestión de Usuarios ---");
                System.out.println("1. Crear Usuario");
                System.out.println("2. Listar Usuarios");
                System.out.println("3. Eliminar Usuario");
                System.out.println("4. Volver");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();
    
                switch (opcion) {
                    case 1:
                        usuarioService.agregarUsuario(null);;
                        break;
                    case 2:
                        usuarioService.obtenerTodosLosUsuarios();
                        break;
                    case 3:
                        usuarioService.eliminarUsuario();                                    
                        break;
                    case 4:
                        System.out.println("volviendo al menu");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, intente nuevamente.");
                scanner.nextLine(); // Limpiar el buffer del Scanner
                opcion = -1; // Mantener el ciclo activo
            }
                 } while (opcion != 4);
             }
           }

