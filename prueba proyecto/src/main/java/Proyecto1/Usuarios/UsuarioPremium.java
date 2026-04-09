package Proyecto1.Usuarios;

import Proyecto1.Elemento.Reminder;
import Proyecto1.Elemento.Tarea;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;

import java.time.LocalDate;
public class UsuarioPremium extends Usuario{
@Override
public Tarea crear_tareas (){
    return new Tarea("Hacer proyecto","tarabja", Prioridad.Alta, Progreso.En_proceso);
}
public Reminder crear_reminder(){
    return new Reminder("Almorzar", "Comida saludable por favor", LocalDate.MAX,"pollos", Prioridad.Alta);
}
    public UsuarioPremium (int id, String nombre, String email, String clave){
        super (id,nombre,email,clave);
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;


    }
}
