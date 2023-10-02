package Logica;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Cronograma {
    Random random = new Random();

    String ID="";
    Calendar Fecha_Registro;
    ArrayList<Accion> Acciones_Del_Dia= new ArrayList<>();
    
    public String GeneraID(){
        String ID="";

            for(int i=0;i<6;i++){
                int tmp = random.nextInt(10);
                ID+=String.valueOf(tmp);
            }
        return ID;
    }

    public Cronograma(int pAnno, int pMes, int pDia){
        this.ID= GeneraID();
        this.Fecha_Registro=new GregorianCalendar(pAnno,pMes-1,pDia);
    }

    public void AgregarAccion(Accion tmp){
        Acciones_Del_Dia.add(tmp);
    }

    public void MostrarInformacion(){
        String tmp= String.valueOf(Fecha_Registro.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(Fecha_Registro.get(Calendar.MONTH+1))+"/"+String.valueOf(Fecha_Registro.get(Calendar.YEAR));
        
        System.out.println("ID del Cronograma: "+ID);
        System.out.println("Fecha del registro: " +tmp);

        for(int i=1;i<=Acciones_Del_Dia.size();i++){
            System.out.println("-Accion #"+i);
            Acciones_Del_Dia.get(i-1).ImprimirInformacion();
        }
    }

    public void ImprimirAcciones(){
        for(int i=1;i<=Acciones_Del_Dia.size();i++){
            System.out.println("-Accion #"+i);
            Acciones_Del_Dia.get(i-1).ImprimirInformacion();
        }
    }

    public String EliminarProblema(String pTitulo){
        boolean flag=true;
        for(int i=1;i<=Acciones_Del_Dia.size();i++){
            if(Acciones_Del_Dia.get(i-1).Titulo==pTitulo){
                Acciones_Del_Dia.remove(i-1);
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
