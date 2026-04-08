package Proyecto1.Elemento;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;

public class Tarea extends Elemento {
    private Prioridad priority;
    private Progreso estado;


    public Tarea(String titulo, String descripcion, Prioridad priority, Progreso estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.priority = priority;
        this.estado = estado;
    }

    public Prioridad getPriority() {
        return priority;
    }

    public void setPriority(Prioridad priority) {
        this.priority = priority;
    }

    public Progreso getEstado() {
        return estado;
    }

    public void setEstado(Progreso estado) {
        this.estado = estado;
    }
    public void cambiarEstadoq(Progreso nuevoEstado){
        this.estado = nuevoEstado;
    }
}

