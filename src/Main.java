import Logica.*;
public class Main {

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
			      "Alex Sanchez", 
			      2021, 12, 5);

		Helicoptero1.AgregarProblema(Problema1); 
		Controller controller = new Controller();
		String reporte=controller.Reporte_Helicoptero(Helicoptero1);

		System.out.println(reporte);
		
		Cronograma cronograma1= new Cronograma(2020,10,16);
		cronograma1.AgregarAccion(Accion1);
		cronograma1.AgregarAccion(Accion2);
		
		System.out.println("---------------------------------------------\n");
		
		reporte=controller.Reporte_Cronograma(cronograma1);

		System.out.println(reporte);
		
	}
}
;