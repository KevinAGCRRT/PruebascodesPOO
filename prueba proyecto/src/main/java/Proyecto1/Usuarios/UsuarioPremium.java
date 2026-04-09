package Proyecto1.Usuarios;

import Proyecto1.Elemento.Reminder;
import Proyecto1.Elemento.Tarea;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;

import java.time.LocalDate;
public class UsuarioPremium extends Usuario{
    public void MostrarInfo () {
        System.out.println("Titulo de la tarea" + getId());
        System.out.println("Titulo de la tarea" + getNombre());
        System.out.println("Titulo de la tarea" + getEmail());
    }
@Override
public Tarea crearTarea (String titulo, String descripcion, Prioridad prioridad, Progreso progreso){
        return new Tarea(titulo,descripcion,prioridad,progreso);
}
    public Reminder crearReminder (String titulo, String descripcion, LocalDate fecha, String icono, Prioridad prioridad){
        return new Reminder(titulo, descripcion, fecha, icono, prioridad);
    }

    public UsuarioPremium(int id, String nombre, String email, String clave) {
        super(id, nombre, email, clave);
    }
}


