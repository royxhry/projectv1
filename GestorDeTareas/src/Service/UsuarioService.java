package Service;

import Model.Usuario;
import Repository.UsuarioRepository;
import java.util.Scanner;

public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void agregarUsuario(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID del usuario: ");
        int id = scanner.nextInt();
        System.out.println("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el correo del usuario: ");
        String correo = scanner.nextLine();
        System.out.println("Ingrese la contraseña del usuario: ");
        String contrasena = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(id, nombre, correo, contrasena);
        usuarioRepository.agregarUsuario(nuevoUsuario);
        System.out.println("Usuario agreagado correctamente.");
        
    }

    public void obtenerTodosLosUsuarios() {
        System.out.println("Listado de usuarios:");
        for (Usuario usuario : usuarioRepository.obtenerTodosLosUsuarios()) {
            System.out.println("ID: " + usuario.getId() + ", Nombre: " + usuario.getNombre() + 
                               ", Correo: " + usuario.getCorreo());
        }
    }

    public void eliminarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID del usuario a eliminar: ");
        int id = scanner.nextInt();
        if (usuarioRepository.eliminarUsuario(id)) {
            System.out.println("Usuario eliminado correctamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
        
    }
}
