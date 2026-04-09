package Proyecto1.Elemento;
import Proyecto1.enums.Prioridad;

import java.awt.print.Printable;

public abstract class Elemento {

   private String titulo;
    private String descripcion;
    private Prioridad prioridad;


    public Elemento(String titulo, String descripcion, Prioridad prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public abstract void MostrarInfo();

}
