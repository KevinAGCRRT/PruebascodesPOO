package Proyecto1.Usuarios;

import Proyecto1.Elemento.Reminder;
import Proyecto1.Elemento.Tarea;
import Proyecto1.enums.Prioridad;
import Proyecto1.enums.Progreso;
import java.time.LocalDate;

public class UsuarioPremium extends Usuario {
    private Tarea[] tareas;
    private Reminder[] reminder;
    private int ContadorTareas = 0;
    private int ContadorReminder = 0;
    private int tareasActivas;
    private int reminderActivos;

    public UsuarioPremium(int id, String nombre, String email, String clave) {
        super(id, nombre, email, clave);
        ContadorReminder = 0;
        ContadorTareas = 0;
        this.reminder = new Reminder[100];
        this.tareas = new Tarea[100];
        this.tareasActivas = 0;
        this.reminderActivos = 0;
    }



    public int getTareasActivas() {
        return tareasActivas;
    }

    public void setTareasActivas(int tareasActivas) {
        this.tareasActivas = tareasActivas;
    }

    @Override
    public void MostrarInfo() {
        System.out.println("\nId del usuario: " + getId());
        System.out.println("Nombre del usuario: " + getNombre());
        System.out.println("Gmail del usuario: " + getEmail());
        System.out.println("Tareas activas del Usuario: " + getTareasActivas());
    }

    @Override
    public Tarea crearTarea(String titulo, String descripcion, Prioridad prioridad, Progreso progreso) {
        Tarea nueva = new Tarea(titulo, descripcion, prioridad, progreso);
        tareas[ContadorTareas] = nueva;
        tareasActivas++;
        ContadorTareas++;

        return nueva;
    }

    @Override
    public Reminder crearReminder(String titulo, String descripcion, LocalDate fecha, String icono, Prioridad prioridad) {

        Reminder nuevo = new Reminder(titulo, descripcion, fecha, icono, prioridad);

        reminder[ContadorReminder] = nuevo;
        ContadorReminder++;
        reminderActivos++;

        return nuevo;
    }


    private void actualizarTareasActivas(Tarea tarea) {
        if (tarea.getEstado() == Progreso.Finalizando) {
            tareasActivas--;
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


    public void mostrarTareas() {
        System.out.println("\n----- LISTA DE TAREAS -----");

        for (int i = 0; i < ContadorTareas; i++) {
            if (tareas[i] != null){
            System.out.println("\nTarea " + (i + 1));
            tareas[i].MostrarInfo();
            System.out.println("-------------------------");}
        }
    }

    @Override
    public  boolean autenticar(String usuario, String clave){
        if (getEmail().equals(usuario) && getClave().equals(clave)) {
            System.out.println("Inicio de sesión correcto");
            return true;
        } else {
            System.out.println("Usuario o clave incorrectos");
            return false;
        }
    }
}


