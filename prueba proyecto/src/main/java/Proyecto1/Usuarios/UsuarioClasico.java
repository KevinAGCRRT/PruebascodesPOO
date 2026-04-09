package Proyecto1.Usuarios;
import Proyecto1.Elemento.Reminder;
import Proyecto1.Elemento.Tarea;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;

import java.security.PrivateKey;
import java.time.LocalDate;

public class UsuarioClasico extends Usuario{
    @Override
    public void MostrarInfo () {
        System.out.println("Id del usuario: " + getId());
        System.out.println("Nombre del usuario: " + getNombre());
        System.out.println("Gmail del usuario: " + getEmail());
        System.out.println("Tareas activas del Usuario: " + getTareasActivas());
        System.out.println("Limite de Tareas: " + getLimiteTareas());
    }
    public Tarea crear_tareas (){
        return new Tarea("Hacer proyecto","tarabja",Prioridad.Alta, Progreso.En_proceso);
    }
    public Reminder crear_reminder(){
        return new Reminder("Almorzar", "Comida saludable por favor", LocalDate.MAX,"pollos", Prioridad.Alta);
    }


    private int limiteTareas;
    private int tareasActivas;
    private Tarea [] tareas;
    private int Contador = 0;



    public UsuarioClasico (int id, String nombre, String email, String clave, int limiteTareas, int tareasActivas){
        super (id,nombre,email,clave);
     this.id = id;
     this.nombre = nombre;
     this.email = email;
     this.clave = clave;
     this.limiteTareas = limiteTareas;
     this.tareasActivas = tareasActivas;
     this.Contador = 0;
        this.tareas = new Tarea[limiteTareas];

    }

    public int getLimiteTareas() {
        return limiteTareas;
    }

    public void setLimiteTareas(int limiteTareas) {
        this.limiteTareas = limiteTareas;
    }

    public int getTareasActivas() {
        return tareasActivas;
    }

    public void setTareasActivas(int tareasActivas) {
        this.tareasActivas = tareasActivas;
        }




        private boolean verificarTareas(){
        if (Contador >= getLimiteTareas()){
            System.out.println("Llegaste al limite de tareas activas, Tareas activas al momento: "+ tareasActivas);
             for (int i = 5; i > 0; i++){
                 Contador ++;
                 System.out.println("El numero de tareas activas hasta el momento es: "+ Contador);
             }
        }
        else  {
            System.out.println("Aun puedes crear tareas, tus tareas activas son: "+ tareasActivas + " Recuerda que tu limite de tareas es: " + limiteTareas);
        }
        return tareasActivas < limiteTareas;
        }

    private Tarea crearTarea (String titulo, String descripcion, Prioridad prioridad, Progreso progreso){
        if (!verificarTareas()){
            System.out.println("Ya no puedes crear mas tareas ");

            return null;
        }

        tareasActivas ++;
        return new Tarea(titulo,descripcion,prioridad, progreso);
    }
   private void actualizarTareasActivas(Tarea tarea){
        if (tarea.getEstado() == Progreso.Finalizando) {
            tareasActivas--;
        }
    }

    private void Info (){
        System.out.println("Titulo de la tarea"+ getId());
        System.out.println("Titulo de la tarea"+ getNombre());
        System.out.println("Titulo de la tarea"+ getTareasActivas());
        System.out.println("Titulo de la tarea"+ getLimiteTareas());

    }

}
