import java.util.Scanner;
public class Ejecutable {
	
	public static void main(String[]Args) {
		Scanner teclado= new Scanner(System.in);
		
		Indicador nuevoIndicador= new Indicador();
		
		int eleccion;
		boolean furula=true;
		
		nuevoIndicador.meterDatos();
		nuevoIndicador.modificarDatos();
		
do {
			
			System.out.println("Indique 1 para restar, 2 para sumar y 3 para salir.");
				eleccion=teclado.nextInt();
			switch(eleccion) {
			case 1 :
				nuevoIndicador.restaDatos();
				break;
			case 2:
				nuevoIndicador.sumaDatos();
				break;
			case 3:
				furula=false;
				break;
				
				default: System.out.println("Porfavor, no rompas los huevos e introduce un valor del 1 al 3 (INCLUIDOS).");
			}
		}while (furula==true);
		
	}

}
