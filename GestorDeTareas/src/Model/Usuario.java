package Model;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario(int id, String nombre, String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    public void agregarUsuario(Usuario usuario) {
        System.out.println("Usuario agregado: " + usuario.getNombre());
    }

    public Usuario obtenerUsuarioPorId(int id) {
        if (this.id == id) {
            return this;
        }
        return null;
    }

    public boolean autenticarUsuario(String correo, String contrasena) {
        return this.correo.equals(correo) && this.contrasena.equals(contrasena);
    }

    public void eliminarUsuario() {
        System.out.println("Usuario eliminado: " + this.nombre);
    }

    public void actualizarUsuario(String nuevoNombre, String nuevoCorreo, String nuevaContrasena) {
        this.nombre = nuevoNombre;
        this.correo = nuevoCorreo;
        this.contrasena = nuevaContrasena;
        System.out.println("Usuario actualizado: " + this.nombre);
    }
}
