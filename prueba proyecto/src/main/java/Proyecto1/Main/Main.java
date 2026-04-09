package Proyecto1.Main;
import Proyecto1.Elemento.*;
import Proyecto1.Usuarios.*;
import Proyecto1.enums.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] arg) {
        UsuarioClasico ejemplo = new UsuarioClasico(69, "Kevin", "gatopolla777@gamail.com", "67");


        for (int i = 1; i <= 7; i++) {

            Tarea t = ejemplo.crearTarea(
                    "compar pollolandia" + i, "pagar el pollo con efectivo" + i, Prioridad.Alta, Progreso.En_proceso
            );
            if (t != null) {
                System.out.println("Se creó la tarea " + i);
                ejemplo.mostrarTareas();
            } else {
                System.out.println("No se pudo crear la tarea " + i);
            }

            System.out.println("Tareas activas actuales: " + ejemplo.getTareasActivas());
            System.out.println("-----------------------------");
        }
    }
}