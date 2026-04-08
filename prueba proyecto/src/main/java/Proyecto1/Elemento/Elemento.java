package Proyecto1.Elemento;
import Proyecto1.enums.Prioridad;

import java.awt.print.Printable;

public abstract class Elemento {
    String titulo;
    String descripcion;
    Prioridad prioridad;

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

    public void Mostrarinfo (){
        System.out.println("Titulo: "+titulo);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("Prioridad: "+prioridad);

    }
}
