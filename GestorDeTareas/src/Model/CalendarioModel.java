package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class CalendarioModel {
    private LocalDate fecha;

    public CalendarioModel(String fechaStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fecha = LocalDate.parse(fechaStr, formatter);
    }

    public CalendarioModel(int year, int month, int dayOfMonth) {
        this.fecha = LocalDate.of(year, month, dayOfMonth);
    }

    public String obtenerDiaDeLaSemana() {
        DayOfWeek dia = fecha.getDayOfWeek();
        return dia.name(); 
    }

    public String obtenerFechaFormateada(String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        return fecha.format(formatter);
    }

    public void agregarDias(int dias) {
        this.fecha = this.fecha.plusDays(dias);
    }

    public void restarDias(int dias) {
        this.fecha = this.fecha.minusDays(dias);
    }

    public String mostrarFecha() {
        return fecha.toString();
    }

    public boolean esAntesDe(CalendarioModel otraFecha) {
        return this.fecha.isBefore(otraFecha.fecha);
    }

    public boolean esDespuesDe(CalendarioModel otraFecha) {
        return this.fecha.isAfter(otraFecha.fecha);
    }

    public int obtenerDiaDelMes() {
        return this.fecha.getDayOfMonth();
    }

    public int obtenerMes() {
        return this.fecha.getMonthValue();
    }

    public int obtenerAnio() {
        return this.fecha.getYear();
    }

    @Override
    public String toString() {
        return "CalendarioModel{" +
                "fecha=" + fecha +
                '}';
    }

    public static void main(String[] args) {
        CalendarioModel calendario = new CalendarioModel(2024, 11, 24);

        System.out.println("Fecha actual: " + calendario.obtenerFechaFormateada("dd/MM/yyyy"));

        System.out.println("Día de la semana: " + calendario.obtenerDiaDeLaSemana());

        calendario.agregarDias(5);
        System.out.println("Fecha después de agregar 5 días: " + calendario.mostrarFecha());

       
        calendario.restarDias(10);
        System.out.println("Fecha después de restar 10 días: " + calendario.mostrarFecha());

        CalendarioModel otraFecha = new CalendarioModel("2024-11-20");

        System.out.println("¿La fecha actual es antes que la otra fecha? " + calendario.esAntesDe(otraFecha));
    }
}
