package Proyecto1.Elemento;

import java.awt.print.Printable;
import java.time.LocalDate;

import Proyecto1.enums.Prioridad;

public class Reminder extends Proyecto1.Elemento.Elemento {
    @Override
    public void MostrarInfo () {
        System.out.println("Titulo de la tarea" + getTitulo());
        System.out.println("Titulo de la tarea" + getDescripcion());
        System.out.println("Titulo de la tarea" + getPrioridad());
    }
    LocalDate fecha;
    String icono;

    public Reminder(String titulo, String descripcion, LocalDate fecha, String icono, Prioridad prioridad) {
        super (titulo, descripcion, prioridad);
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.icono = icono;
        this.prioridad = prioridad;

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
        System.out.println("Titulo de la tarea"+ getTitulo());
        System.out.println("Titulo de la tarea"+ getDescripcion());
        System.out.println("Titulo de la tarea"+ getFecha());
        System.out.println("Titulo de la tarea"+ getIcono());
        System.out.println("Titulo de la tarea"+ getPrioridad());
    }
}
