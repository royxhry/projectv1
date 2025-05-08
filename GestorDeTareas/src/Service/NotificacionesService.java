package Service;

import java.util.List;
import Model.NotificacionesModel;
import Repository.NotificacionesRepository;

public class NotificacionesService {
    private NotificacionesRepository repository;

    public NotificacionesService(NotificacionesRepository repository) {
        this.repository = repository;
    }

    public void crearNotificacion(int id, String titulo, String mensaje, String fechaHora) {
        NotificacionesModel nuevaNotificacion = new NotificacionesModel(id, titulo, mensaje, fechaHora, false);
        repository.agregar(nuevaNotificacion);
    }

    public List<NotificacionesModel> obtenerTodasLasNotificaciones() {
        return repository.obtenerTodas();
    }

    public NotificacionesModel obtenerNotificacionPorId(int id) {
        return repository.obtenerPorId(id);
    }

    public void eliminarNotificacion(int id) {
        if (!repository.eliminar(id)) {
            System.out.println("No se encontró la notificación con ID: " + id);
        }
    }

    public void marcarNotificacionComoLeida(int id) {
        NotificacionesModel notificacion = repository.obtenerPorId(id);
        if (notificacion != null) {
            notificacion.marcarComoLeida();
            repository.actualizar(notificacion);
        } else {
            System.out.println("No se encontró la notificación con ID: " + id);
        }
    }
}
