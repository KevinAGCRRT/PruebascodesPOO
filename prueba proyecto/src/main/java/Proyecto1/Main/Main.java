package Proyecto1.Main;
import Proyecto1.Elemento.*;
import Proyecto1.Usuarios.*;
import Proyecto1.enums.*;
public class Main {
public  static void main  (String [] arg){
UsuarioClasico ejemplo = new UsuarioClasico(90, "kevin", "Kevingatogamil", "gatoslindos777", 5,3);
Tarea tarea1 = new Tarea("compar pollolandia", "pagar el pollo con efectivo", Prioridad.Alta, Progreso.En_proceso);
tarea1.MostrarInfo();
ejemplo.MostrarInfo();

}






}