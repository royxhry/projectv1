package Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ArchivosadjuntadosModel {
    private String nombreArchivo;
    private String tipoArchivo;
    private long tamanio;
    private Path rutaArchivo;
    private byte[] contenido;

    public ArchivosadjuntadosModel(String nombreArchivo, String tipoArchivo, Path rutaArchivo) throws IOException {
        this.nombreArchivo = nombreArchivo;
        this.tipoArchivo = tipoArchivo;
        this.rutaArchivo = rutaArchivo;
        this.tamanio = Files.size(rutaArchivo);
        this.contenido = Files.readAllBytes(rutaArchivo);
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public long getTamanio() {
        return tamanio;
    }

    public void setTamanio(long tamanio) {
        this.tamanio = tamanio;
    }

    public Path getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(Path rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    public void mostrarInfo() {
        System.out.println("Nombre del archivo: " + nombreArchivo);
        System.out.println("Tipo de archivo: " + tipoArchivo);
        System.out.println("Tamaño: " + tamanio + " bytes");
        System.out.println("Ruta: " + rutaArchivo);
    }

    public void adjuntarArchivo() {
        System.out.println("El archivo '" + nombreArchivo + "' ha sido adjuntado correctamente.");
    }

    @Override
    public String toString() {
        return "ArchivosadjuntadosModel [nombreArchivo=" + nombreArchivo + ", tipoArchivo=" + tipoArchivo + ", tamanio="
                + tamanio + ", rutaArchivo=" + rutaArchivo + ", contenido=" + Arrays.toString(contenido) + "]";
    }

    public static void main(String[] args) {
        try {
            Path ruta = Path.of("ruta/a/tu/archivo.pdf");  // Cambia esta ruta por la ruta real del archivo
            ArchivosadjuntadosModel archivo = new ArchivosadjuntadosModel("Archivo de Proyecto", "application/pdf", ruta);

            archivo.mostrarInfo();
            archivo.adjuntarArchivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
