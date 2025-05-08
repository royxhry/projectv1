package Repository;
import java.util.ArrayList;
import java.util.List;

import Model.Usuario;


public class UsuarioRepository {
    
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioRepository(){
        agregarUsuario(new Usuario(1, "roy", "hola", "Qroy"));
       
    }
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarios;
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public boolean eliminarUsuario(int id) {
        return usuarios.removeIf(usuario -> usuario.getId() == id);
    }
}



    



