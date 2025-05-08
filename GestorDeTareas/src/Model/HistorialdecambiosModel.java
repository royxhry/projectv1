package Model;

import java.time.LocalDateTime;

public class HistorialdecambiosModel {
    private int id; 
    private String entidad; 
    private int entidadId; 
    private String campoModificado;
    private String valorAnterior; 
    private String valorNuevo; 
    private LocalDateTime fechaCambio; 
    private String usuarioResponsable; 

    public HistorialdecambiosModel() {}

    public HistorialdecambiosModel(int id, String entidad, int entidadId, String campoModificado, String valorAnterior, String valorNuevo, LocalDateTime fechaCambio, String usuarioResponsable) {
        this.id = id;
        this.entidad = entidad;
        this.entidadId = entidadId;
        this.campoModificado = campoModificado;
        this.valorAnterior = valorAnterior;
        this.valorNuevo = valorNuevo;
        this.fechaCambio = fechaCambio;
        this.usuarioResponsable = usuarioResponsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public int getEntidadId() {
        return entidadId;
    }

    public void setEntidadId(int entidadId) {
        this.entidadId = entidadId;
    }

    public String getCampoModificado() {
        return campoModificado;
    }

    public void setCampoModificado(String campoModificado) {
        this.campoModificado = campoModificado;
    }

    public String getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public String getValorNuevo() {
        return valorNuevo;
    }

    public void setValorNuevo(String valorNuevo) {
        this.valorNuevo = valorNuevo;
    }

    public LocalDateTime getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(LocalDateTime fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public String getUsuarioResponsable() {
        return usuarioResponsable;
    }

    public void setUsuarioResponsable(String usuarioResponsable) {
        this.usuarioResponsable = usuarioResponsable;
    }

    @Override
    public String toString() {
        return "HistorialDeCambios [id=" + id + ", entidad=" + entidad + ", entidadId=" + entidadId
                + ", campoModificado=" + campoModificado + ", valorAnterior=" + valorAnterior + ", valorNuevo="
                + valorNuevo + ", fechaCambio=" + fechaCambio + ", usuarioResponsable=" + usuarioResponsable + "]";
    }

   
    }
    
