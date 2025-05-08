package Repository;
import java.util.List;
import java.util.ArrayList;
import Model.Proyecto;
public class ProyectoRepository {
    
    
        public List<Proyecto>listProyectos = new ArrayList<>();
    
        public ProyectoRepository(){
            addProyecto(new Proyecto(1, "Proyecto inicial", "Descripción", "2024-12-01", "2025-01-01"));
        }
    
        public void addProyecto(Proyecto proyecto){
        listProyectos.add(proyecto);

        }
        public Proyecto buscarProyectoPorId(int id) {
        for (Proyecto proyecto : listProyectos) {
            if (proyecto.getId() == id) {
                return proyecto;
            }
        }
        return null;
    }
        public boolean eliminarProyectoPorId(int id) {
            return listProyectos.removeIf(proyecto -> proyecto.getId() == id);
        }

        
        
        }
    
    
        

    
    
