package Proyecto1.Elemento;

import java.awt.print.Printable;
import java.time.LocalDate;

import Proyecto1.enums.Prioridad;

public class Reminder extends Elemento {
    @Override
    public void MostrarInfo () {
        System.out.println("Titulo del Reminder: " + getTitulo());
        System.out.println("Descripcion del Reminder: " + getDescripcion());
        System.out.println(("Hora estipulada: "+ getFecha()));
        System.out.println("Prioridad del Reminder: " + getPrioridad());
    }
    LocalDate fecha;
    String icono;

    public Reminder(String titulo, String descripcion, LocalDate fecha, String icono, Prioridad prioridad) {
        super (titulo, descripcion, prioridad);
        this.fecha = fecha;
        this.icono = icono;

    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    private void Info (){
        System.out.println("Titulo del reminder: "+ getTitulo());
        System.out.println("Descripcion del reminder; "+ getDescripcion());
        System.out.println("Fecha del reminder: "+ getFecha());
        System.out.println("Icono del reminder: "+ getIcono());
        System.out.println("Prioridad del reminder: "+ getPrioridad());
    }
}
