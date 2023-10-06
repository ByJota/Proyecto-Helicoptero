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
        this.fecha= new GregorianCalendar(pAnno,pMes-1,pDia);
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

    public String EliminarProblema(String pTitulo){
        boolean flag=true;
        for(int i=1;i<=Acciones_Realizadas.size();i++){
            if(Acciones_Realizadas.get(i-1).Titulo==pTitulo){
                Acciones_Realizadas.remove(i-1);
                flag=false;
                break;
            }
        }

        if(flag){
            return "No se ha borrado ningun elemento de la lista de problemas porque no se ha encontrado una coincidencia";
        }
        return "";
    }
}
