package Logica;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Helicoptero {
    
    String Codigo="";
    String Modelo="";
    String Duenno="";
    Calendar Fecha_Inscripcion;
    ArrayList<Problema> Problemas=new ArrayList<>();

    public Helicoptero(String pCodigo, String pModelo, String pDuenno,int pAnno, int pMes, int pDia){
        this.Codigo=pCodigo;
        this.Modelo=pModelo;
        this.Duenno=pDuenno;
        this.Fecha_Inscripcion=new GregorianCalendar(pAnno,pMes,pDia);
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getDuenno() {
        return Duenno;
    }

    public void AgregarProblema(Problema tmp){
        Problemas.add(tmp);
    }

    public void ImprimirInformacion(){
        String tmp= String.valueOf(Fecha_Inscripcion.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(Fecha_Inscripcion.get(Calendar.MONTH))+"/"+String.valueOf(Fecha_Inscripcion.get(Calendar.YEAR));
        System.out.println("Codigo del Helicoptero : "+Codigo);
        System.out.println("Modelo del helicoptero: "+Modelo);
        System.out.println("Dueno del helicoptero: "+Duenno);
        System.out.println("Fecha de inscripcion del helicoptero: "+tmp);

        System.out.println("Problemas del Helicopetero:");
        for(int i=1;i<=Problemas.size();i++){
            System.out.println("-Problema #"+i);
            Problemas.get(i-1).ImprimirInformacion();

        }

    }
}
