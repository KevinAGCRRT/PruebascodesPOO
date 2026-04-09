package Proyecto1.Usuarios;
import Proyecto1.Elemento.Tarea;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;

import java.security.PrivateKey;

public class UsuarioClasico extends Usuario{
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


        public boolean verificarTareas(){
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

    public Tarea crearTarea (String titulo, String descripcion, Prioridad prioridad, Progreso progreso){
        if (!verificarTareas()){
            System.out.println("Ya no puedes crear mas tareas ");

            return null;
        }

        tareasActivas ++;
        return new Tarea(titulo,descripcion,prioridad, progreso);
    }
    public void actualizarTareasActivas(Tarea tarea){
        if (tarea.getEstado() == Progreso.Finalizando) {
            tareasActivas--;
        }
    }
}
