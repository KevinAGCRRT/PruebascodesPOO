package Proyecto1.Elemento;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;

public class Tarea extends Elemento {
    @Override
    public void MostrarInfo () {
        System.out.println("Titulo de la tarea: " + getTitulo());
        System.out.println("Descripcion de la tarea:  " + getDescripcion());
        System.out.println("Prioridad de la tarea: " + getPrioridad());
        System.out.println("Estado de la tarea: " + getEstado());
    }
    private Prioridad priority;
    private Progreso estado;


    public Tarea(String titulo, String descripcion, Prioridad prioridad, Progreso estado) {
        super (titulo, descripcion, prioridad);
        this.priority = prioridad;
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

