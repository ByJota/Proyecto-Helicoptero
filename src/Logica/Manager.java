package Logica;
import java.util.ArrayList;

public class Manager {
    ArrayList<Helicoptero> Garaje= new ArrayList<>();
    ArrayList<Problema> BD_Problemas= new ArrayList<>();
    ArrayList<Cronograma> Calendario= new ArrayList<>();
    ArrayList<Accion> BD_Acciones= new ArrayList<>();

    public void AgregarProblema(Problema tmp){
        BD_Problemas.add(tmp);
    }

    public void AgregarAccion(Accion tmp){
        BD_Acciones.add(tmp);
    }

    public void AgregarCronograma(Cronograma tmp){
        Calendario.add(tmp);
    }

    public void AgregarHelicoptero(Helicoptero tmp){
        Garaje.add(tmp);
    }

    public ArrayList<Helicoptero> getGaraje() {
        return Garaje;
    }

    public ArrayList<Problema> getBD_Problemas() {
        return BD_Problemas;
    }

    public ArrayList<Cronograma> getCalendario() {
        return Calendario;
    }

    public ArrayList<Accion> getBD_Acciones() {
        return BD_Acciones;
    }

}
