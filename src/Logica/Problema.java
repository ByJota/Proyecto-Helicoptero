package Logica;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Problema {

    String Titulo="";
    String Lugar_Afectado="";
    String Descripcion="";
    Calendar fecha;
    ArrayList<Accion> Acciones_Realizadas= new ArrayList<>();

    public Problema(String pTitulo, String pLugar_Afectado,String pDescripcion, int pAnno, int pMes, int pDia){

        this.Titulo=pTitulo;
        this.Lugar_Afectado=pLugar_Afectado;
        this.Descripcion=pDescripcion;
        this.fecha= new GregorianCalendar(pAnno,pMes,pDia);
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getLugar_Afectado() {
        return Lugar_Afectado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void AgregarAccion(Accion tmp){

        Acciones_Realizadas.add(tmp);
    }

    public void ImprimirInformacion(){
        String tmp= String.valueOf(fecha.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(fecha.get(Calendar.MONTH))+"/"+String.valueOf(fecha.get(Calendar.YEAR));
        System.out.println("Titulo del problema: "+Titulo);
        System.out.println("Lugar del helicoptero afectada: "+Lugar_Afectado);
        System.out.println("Descripcion del problema: "+Descripcion);
        System.out.println("Fecha del problema registrado: "+tmp);

        System.out.println("Acciones Realizadas:");

        for(int i=1;i<=Acciones_Realizadas.size();i++){
            System.out.println("-Accion #"+i);
            Acciones_Realizadas.get(i-1).ImprimirInformacion();
        }
    }
    
}
