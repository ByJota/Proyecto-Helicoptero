package Logica;

public class Accion {
    
    String Titulo="";
    String Hora="";
    String Descripcion="";

    public Accion(String pTitulo,String pHora,String pDescripcion){
        this.Titulo=pTitulo;
        this.Hora=pHora;
        this.Descripcion=pDescripcion;
    }
    
    public String getTitulo() {
        return Titulo;
    }

    public String getHora() {
        return Hora;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void ImprimirInformacion(){
        System.out.println("Accion Realizada:"+Titulo);
        System.out.println("Hora en que se realiza :"+Hora);
        System.out.println("Descripcion de lo realizado:"+Descripcion+"\n");
    }

}
