package UI;
import java.util.Scanner;

import Repository.ProyectoRepository;
import Repository.TareaRepository;
import Repository.UsuarioRepository;
import Service.LoginService;
import Service.ProyectoService;
import Service.TareaService;
import Service.UsuarioService;

public class MenuProyecto {
    public void menuProyecto(){
        Scanner sc =new Scanner(System.in);
       
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
            System.out.println("\n---Gestion de Proyectos---");
                    System.out.println("1. Agregar Proyecto");
                    System.out.println("2. Ver Proyectos");
                    System.out.println("3. Eliminar proyecto");
                    System.out.println("4. Salir");
                    opcion = sc.nextInt();
                            
                            switch (opcion) {
                                case 1:
                                   proyectoService.crearProyecto(); 
                                    break;
                                case 2:
                                    proyectoService.consultarProyecto();
                                break;
                                case 3:
                                    proyectoService.eliminarProyecto();
                                break;
                                case 4:
                                    System.out.println("saliendo");
                                break;
                            
                                default:
                                    break;   
                        }
                        
                    } catch (Exception e) {
                        System.out.println("Entrada no válida. Por favor, intente nuevamente.");
                        scanner.nextLine(); // Limpiar el buffer del Scanner
                        opcion = -1; // Mantener el ciclo activo
                    }
                    }while (opcion!=4);
            }
        }

