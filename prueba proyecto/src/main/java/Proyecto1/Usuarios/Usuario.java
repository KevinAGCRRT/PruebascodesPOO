package Proyecto1.Usuarios;


import Proyecto1.Elemento.Reminder;
import Proyecto1.Elemento.Tarea;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;

import java.time.LocalDate;

public abstract class Usuario {
 int id;
 String nombre;
 String email;
 String clave;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String email, String clave) {

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

    private Tarea CrearTarea(String titulo, String descripcion, Prioridad priority, Progreso progreso){
    return new Tarea(titulo, descripcion, priority,progreso);
}
    public abstract Tarea crear_tareas();

    private Reminder crearReminder(String titulo, String descripcion, LocalDate fecha, String icono, Prioridad prioridad){
    return new Reminder(titulo, descripcion, fecha, icono, prioridad);
}
    public abstract Reminder crear_reminder();

    public abstract void MostrarInfo();


}


