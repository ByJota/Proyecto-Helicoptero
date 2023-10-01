import Logica.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class App {

    public static void main(String[] args) {
      Accion Accion1= new Accion("Revision general del helicoptero",
      "9:35",
      "Se ha revisado el helicoptero al completo con el fin de encontrar alguna anomalia");

      Accion Accion2=new Accion("Cambio de elice", 
      "19:45",
      "Hemos contactado a nuestro proveedor con el fin de comprale una nueva elice");

      Problema Problema1= new Problema("Elice rota", 
      "Elice Trasera", 
      "Hemos encontrado la elice trasera totalmente inserbible", 
      2022, 1, 16);

      Problema1.AgregarAccion(Accion1);
      Problema1.AgregarAccion(Accion2);

      Helicoptero Helicoptero1=new Helicoptero("A101", 
      "Helicoptero Guerra", 
      "Alex Sanchez", 2021, 11, 5);

      Helicoptero1.AgregarProblema(Problema1);
      Helicoptero1.ImprimirInformacion();


    }  
}
