package Service;

import java.util.Scanner;
import Model.Login;
import Repository.LoginRepository;
import Repository.UsuarioRepository;

public class LoginService extends LoginRepository {
    public void registroUser() {
        try {
            Scanner regis = new Scanner(System.in);
            Login user = new Login();
            System.out.println("Escribe tu nombre: ");
            user.setNombre(regis.next());
            System.out.println("Escribe tu correo: ");
            user.setCorreo(regis.next());
            System.out.println("Escribe una contraseña: ");
            user.setContraseña(regis.next());

            UserRepository.add(user);
            System.out.println("Usuario registrado con éxito.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error al registrar el usuario.");
        }
    }

    public boolean inicioSecion() {
        try {
            Scanner regis = new Scanner(System.in);

            System.out.println("Ingresa tu nombre: ");
            String nom = regis.next();
            System.out.println("Escribe tu contraseña: ");
            String con = regis.next();

            if (UserComparacion(nom, con)) {
                System.out.println("Inicio de sesión exitoso.");
                return true;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intente nuevamente.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error durante el inicio de sesión.");
            return false;
        }
    }

    public boolean UserComparacion(String user, String contraseña) {
        if ((user.equals("Jason") && contraseña.equals("RedBull14@")) || 
            (user.equals("Mar") && contraseña.equals("5estrellasM")) || 
            (user.equals("roy") && contraseña.equals("Qroy"))) {
            return true;
        } else {
            for (Login u : UserRepository) {
                if (u.getNombre().equals(user) && u.getContraseña().equals(contraseña)) {
                    return true;
                }
            }
            return false;
        }
    }
}
