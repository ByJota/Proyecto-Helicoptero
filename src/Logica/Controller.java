package Logica;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.*;

public class Controller {
    
    public String Reporte_Accion(Accion tmp){
        Calendar fecha= new GregorianCalendar();
        String Reporte="Fecha del reporte: "+ String.valueOf(fecha.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(fecha.get(Calendar.MONTH)+1)+"/"+String.valueOf(fecha.get(Calendar.YEAR))+"\n";
        Reporte+="Accion Realizada: "+tmp.Titulo+"\n";
        Reporte+="Hora de la accion realizada: "+tmp.Hora+"\n";
        Reporte+="Descripcion de lo realizada: "+tmp.Descripcion+"\n";
        return Reporte;
    }

    public Accion Enviar_Accion(Accion tmp){
        return tmp;
    }

    public String Reporte_Problema(Problema tmp){
        Calendar fecha= new GregorianCalendar();
        String Reporte="Fecha del reporte: "+ String.valueOf(fecha.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(fecha.get(Calendar.MONTH)+1)+"/"+String.valueOf(fecha.get(Calendar.YEAR))+"\n";
        Reporte+="Titulo del problema: "+tmp.Titulo+"\n";
        Reporte+="Lugar afectado: "+tmp.Lugar_Afectado+"\n";
        Reporte+="Descripcion del problema: "+tmp.Descripcion+"\n";
        Reporte+="-Fecha del problema registrado: "+String.valueOf(tmp.fecha.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(tmp.fecha.get(Calendar.MONTH)+1)+"/"+String.valueOf(tmp.fecha.get(Calendar.YEAR))+"\n";
        
        Reporte+="\n-Acciones Realizadas:\n";
        for(int i=1;i<=tmp.Acciones_Realizadas.size();i++){
            Reporte+="\n" +"-Accion #"+String.valueOf(i)+"\n";
            Reporte+=Reporte_Accion(tmp.Acciones_Realizadas.get(i-1));
        }
        return Reporte;
    }

    public Problema Enviar_Problema(Problema tmp){
        return tmp;
    }

    public String Reporte_Helicoptero(Helicoptero tmp){
        Calendar fecha= new GregorianCalendar();
        String Reporte="Fecha del reporte: "+ String.valueOf(fecha.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(fecha.get(Calendar.MONTH)+1)+"/"+String.valueOf(fecha.get(Calendar.YEAR))+"\n";

        Reporte+="Helicoptero: "+tmp.Codigo+"\n";
        Reporte+="Dueno: "+tmp.Duenno+"\n";
        Reporte+="Modelo: "+tmp.Modelo+"\n";
        Reporte+="Fecha en que fue inscrito: "+String.valueOf(tmp.Fecha_Inscripcion.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(tmp.Fecha_Inscripcion.get(Calendar.MONTH)+1)+"/"+String.valueOf(tmp.Fecha_Inscripcion.get(Calendar.YEAR))+"\n";

        Reporte+="Problemas del helicoptero:\n";
        for(int i=1;i<=tmp.Problemas.size();i++){
            Reporte+="\n" +"-Problema #"+String.valueOf(i)+"\n";
            Reporte+=Reporte_Problema(tmp.Problemas.get(i-1));
        }
        return Reporte;
    }

    public Helicoptero Enviar_Helicoptero(Helicoptero tmp){
        return tmp;
    }

    public String Reporte_Cronograma(Cronograma tmp){
        Calendar fecha= new GregorianCalendar();
        String Reporte="Fecha del reporte: "+ String.valueOf(fecha.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(fecha.get(Calendar.MONTH)+1)+"/"+String.valueOf(fecha.get(Calendar.YEAR))+"\n";
        Reporte+="ID del cronograma: "+tmp.ID;
        Reporte+="Fecha del registro: "+tmp.Fecha_Registro;
        for(int i=1;i<=tmp.Acciones_Del_Dia.size();i++){
            Reporte+="\n" +"-Accion #"+String.valueOf(i)+"\n";
            Reporte+=Reporte_Accion(tmp.Acciones_Del_Dia.get(i-1));
        }
        return Reporte;
    }

    public Cronograma Enviar_Cronograma(Cronograma tmp){
        return tmp;
    }

    public Boolean ValidarHora(String pHora){
        String Patron_Regex = "^([0-2][0-9]|3[0-1])(/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
        Pattern pattern = Pattern.compile(Patron_Regex);
        Matcher matcher = pattern.matcher(pHora);

        if(matcher.find()){
            return true;
        }
        return false;
    }
 
}
 