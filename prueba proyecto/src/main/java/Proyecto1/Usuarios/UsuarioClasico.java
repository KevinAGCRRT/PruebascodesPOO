package Proyecto1.Usuarios;
import Proyecto1.Elemento.Tarea;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;

public class UsuarioClasico extends Usuario{
   private int limiteTareas;
    private int tareasActivas;

    public UsuarioClasico() {
    }

    public UsuarioClasico (int id, String nombre, String email, String clave, int limiteTareas, int tareasActivas){
     this.id = id;
     this.nombre = nombre;
     this.email = email;
     this.clave = clave;
     this.limiteTareas = limiteTareas;
     this.tareasActivas = tareasActivas;
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
        if (getTareasActivas() >= getLimiteTareas()){
            System.out.println("Llegaste al limite de tareas activas, Tareas activas al momento: "+ tareasActivas);
        }
        else  {
            System.out.println("Aun puedes crear tareas, tus tareas activas son: "+ tareasActivas + " Recuerda que tu limite de tareas es: " + limiteTareas);
        }
        return tareasActivas < limiteTareas;
        }
        @Override
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
