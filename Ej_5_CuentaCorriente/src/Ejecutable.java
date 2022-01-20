import java.util.Scanner;
public class Ejecutable {
	public static void main (String[]Args) {
		CuentaCorriente nuevaCuenta= new CuentaCorriente();
		
		Scanner teclado = new Scanner(System.in);
		int eleccion;
		boolean furula=true;

			
		do {
			
			System.out.println("Indique 1 para consultar saldo, 2 para ingresar dinero, 3 para retirar y 4 para salir.");
				eleccion=teclado.nextInt();
			switch(eleccion) {
			case 1 :
				nuevaCuenta.meterDatos();
				break;
			case 2:
				nuevaCuenta.ingresarDinero();
				break;
			case 3:
				nuevaCuenta.retiraDinero();
				break;
			case 4:
				furula=false;
				break;
				default: System.out.println("Porfavor, no rompas los huevos e introduce un valor del 1 al 4 (INCLUIDOS).");
			}
		}while (furula==true);
	}

}
