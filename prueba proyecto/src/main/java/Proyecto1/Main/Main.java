package Proyecto1.Main;
import Proyecto1.Elemento.*;
import Proyecto1.Usuarios.*;
import Proyecto1.enums.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        UsuarioPremium usuarioPremium1 = new UsuarioPremium( 67,  "Orlando","Orlando@gmail.com", "31416");
        usuarioPremium1.MostrarInfo();
        usuarioPremium1.crearReminder("Ir al super", "Comprar tomates", (LocalDate.now()), "Carrito", Prioridad.Alta );

        UsuarioClasico usuarioClasico1 = new UsuarioClasico(69, "Kevin", "kevin@gmail.com", "1234");
        usuarioClasico1.crearTarea("Guia Calculo 2", "Estudiar para el Parcial", Prioridad.Alta, Progreso.En_proceso );

        usuarioClasico1.MostrarInfo();
        usuarioClasico1.crearReminder("Lavar utencilios", "Lavar platos de la cena", LocalDate.now(), "Jabon", Prioridad.Media );
        usuarioClasico1.crearTarea("Instalar entorno", "Instalar Postgres SQL", Prioridad.Alta, Progreso.Inicializando );



        usuarioClasico1.mostrarTareas();
        usuarioPremium1.mostrarTareas();

        usuarioPremium1.mostrarRemainder();
        usuarioClasico1.mostrarRemainder();
    }


}
