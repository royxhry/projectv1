package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.Subtarea;

public class SubtareaRepository {

    // Lista que almacena las subtareas
    private List<Subtarea> listaSubtareas = new ArrayList<>();

    // Agregar una nueva subtarea
    public void agregarSubtarea(Subtarea subtarea) {
        listaSubtareas.add(subtarea);
    }

    // Buscar una subtarea por su ID
    public Subtarea buscarSubtareaPorId(int id) {
        for (Subtarea subtarea : listaSubtareas) {
            if (subtarea.getId() == id) {
                return subtarea;
            }
        }
        return null; // Retorna null si no encuentra la subtarea
    }

    // Eliminar una subtarea por su ID
    public boolean eliminarSubtarea(int id) {
        return listaSubtareas.removeIf(subtarea -> subtarea.getId() == id);
    }

    // Obtener todas las subtareas
    public List<Subtarea> obtenerTodasLasSubtareas() {
        return listaSubtareas;
    }
}
