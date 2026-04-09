package Proyecto1.Usuarios;
import Proyecto1.Elemento.Reminder;
import Proyecto1.Elemento.Tarea;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;

import java.security.PrivateKey;
import java.time.LocalDate;

public class UsuarioClasico extends Usuario {

    @Override

    public void MostrarInfo () {
        System.out.println("Id del usuario: " + getId());
        System.out.println("Nombre del usuario: " + getNombre());
        System.out.println("Gmail del usuario: " + getEmail());
        System.out.println("Tareas activas del Usuario: " + getTareasActivas());
        System.out.println("Limite de Tareas: " + getLimiteTareas());
    }
    public Tarea crearTarea (String titulo, String descripcion, Prioridad prioridad, Progreso progreso){
        if (!verificarTareas()){
            System.out.println("Ya no puedes crear mas tareas ");

            return null;
    }
        Tarea nueva = new Tarea(titulo,descripcion,prioridad, progreso);
        tareas [ContadorTareas] = nueva;
        tareasActivas ++;
        ContadorTareas++;

        return nueva;
    }
    public Reminder crearReminder (String titulo, String descripcion, LocalDate fecha, String icono, Prioridad prioridad){
        if (!verificarReminders()){
            System.out.println("Ya no puedes crear mas reminders ");

            return null;
        }
        reminderActivos ++;
        return new Reminder(titulo, descripcion, fecha, icono, prioridad);
    }


    private int limiteTareas;
    private int tareasActivas;
    private int limiteReminder;
    private int reminderActivos;
    private Tarea [] tareas;
    private Reminder [] reminder;
    private int ContadorTareas = 0;
    private int ContadorReminder = 0;


    public UsuarioClasico(int id, String nombre, String email, String clave) {
        super(id, nombre, email, clave);
        this.limiteTareas = 5;
        this.tareasActivas = 0;
        this.limiteReminder = 5;
        this.reminderActivos = 0;
        this.tareas = new Tarea[limiteTareas];
        this.reminder = new Reminder[limiteReminder];
        this.ContadorTareas = 0;
        this.ContadorReminder = 0;
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
        if (ContadorTareas >= getLimiteTareas()){
            System.out.println("Llegaste al limite de tareas activas, Tareas activas al momento: "+ tareasActivas);
             for (int i = 5; i > 0; i++){
                 ContadorTareas ++;
                 System.out.println("El numero de tareas activas hasta el momento es: "+ ContadorTareas);
                 return false;
             }
        }
        else  {
            System.out.println("Aun puedes crear tareas, tus tareas activas son: "+ tareasActivas + " Recuerda que tu limite de tareas es: " + limiteTareas);
        }
        return tareasActivas < limiteTareas;
        }

   private void actualizarTareasActivas(Tarea tarea){
        if (tarea.getEstado() == Progreso.Finalizando) {
            tareasActivas--;
        }
    }

    private boolean verificarReminders(){
        if (ContadorReminder >= getLimiteTareas()){
            System.out.println("Llegaste al limite de Reminders activos, Reminders activos al momento: "+ reminderActivos);
            for (int i = 5; i > 0; i++){
                ContadorReminder ++;
                System.out.println("El numero de Reminders activos hasta el momento son: "+ reminderActivos);
                return false;
            }
        }
        else  {
            System.out.println("Aun puedes crear Reminders, tus Reminders activos son: "+ reminderActivos + " Recuerda que tu limite de tareas es: " + limiteTareas);
        }
        return reminderActivos < limiteReminder;
    }

    private void Info (){
        System.out.println("Id de usuario"+ getId());
        System.out.println("Nombre de usuario"+ getNombre());
        System.out.println("Tareas activas del usuario"+ getTareasActivas());
        System.out.println("Titulo de la tarea"+ getLimiteTareas());

    }
    public void mostrarTareas() {
        System.out.println("----- LISTA DE TAREAS -----");

        for (int i = 0; i < ContadorTareas; i++) {
            System.out.println("Tarea " + (i + 1));
            tareas[i].MostrarInfo();
            System.out.println("-------------------------");
        }
    }
    public void mostrarRemainder() {
        System.out.println("\n----- LISTA DE REMAINDERS -----");

        for (int i = 0; i < ContadorReminder; i++) {
            if (reminder[i] != null){
                System.out.println("\nRemainder " + (i + 1));
                reminder[i].MostrarInfo();
                System.out.println("-------------------------");}
        }
    }


    @Override
    public boolean autenticar(String usuario, String clave) {
        if (getEmail().equals(usuario) && getClave().equals(clave)) {
            System.out.println("Inicio de sesión correcto");
            return true;
        } else {
            System.out.println("Usuario o clave incorrectos");
            return false;
        }

    }
}
