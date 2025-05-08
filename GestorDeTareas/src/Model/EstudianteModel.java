package Model;
public class EstudianteModel {
     int id;
     String nombre;
     int edad;
     String curso;

    public EstudianteModel() {}

    public EstudianteModel(int id, String nombre, int edad, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "EstudianteModel [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + "]";
    }

   
    }

