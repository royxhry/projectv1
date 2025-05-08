package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.NotificacionesModel;

public class NotificacionesRepository {
    private List<NotificacionesModel> notificaciones;

    public NotificacionesRepository() {
        this.notificaciones = new ArrayList<>();
    }

    public void agregar(NotificacionesModel notificacion) {
        notificaciones.add(notificacion);
    }

    public List<NotificacionesModel> obtenerTodas() {
        return new ArrayList<>(notificaciones);
    }

    public NotificacionesModel obtenerPorId(int id) {
        return notificaciones.stream()
                .filter(n -> n.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean eliminar(int id) {
        return notificaciones.removeIf(n -> n.getId() == id);
    }

    public void actualizar(NotificacionesModel notificacionActualizada) {
        for (int i = 0; i < notificaciones.size(); i++) {
            if (notificaciones.get(i).getId() == notificacionActualizada.getId()) {
                notificaciones.set(i, notificacionActualizada);
                return;
            }
        }
    }
}
