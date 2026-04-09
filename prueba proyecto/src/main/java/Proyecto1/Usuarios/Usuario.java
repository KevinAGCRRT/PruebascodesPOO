package Proyecto1.Usuarios;


import Proyecto1.Elemento.Reminder;
import Proyecto1.Elemento.Tarea;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;

import java.time.LocalDate;

public abstract class Usuario {
 private int id;
 private String nombre;
 private String email;
 private String clave;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String email, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Tarea CrearTarea(String titulo, String descripcion, Prioridad prioridad, Progreso progreso){
    return new Tarea(titulo, descripcion, prioridad, progreso);
}
    public abstract Tarea crearTarea(String titulo, String descripcion, Prioridad prioridad, Progreso progreso);

    private Reminder CrearReminder(String titulo, String descripcion, LocalDate fecha, String icono, Prioridad prioridad){
    return new Reminder(titulo, descripcion, fecha, icono, prioridad);
}
    public abstract  Reminder crearReminder(String titulo, String descripcion, LocalDate fecha, String icono, Prioridad prioridad);

    public abstract void MostrarInfo();


}


