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
        this.Fecha_Inscripcion=new GregorianCalendar(pAnno,pMes-1,pDia);
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

    public String EliminarProblema(String pTitulo){
        boolean flag=true;
        for(int i=1;i<=Problemas.size();i++){
            if(Problemas.get(i-1).Titulo==pTitulo){
                Problemas.remove(i-1);
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
