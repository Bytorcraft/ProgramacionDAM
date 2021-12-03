package ej_3_12;
import java.util.Scanner;
/**
 * Programa que lee un numero y encuentra el primo mas cercano
 */
/**
 * @author Minaya
 *
 */
public class ej_3_12 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int forma;
		int alturatriangulo,basetriangulo, atriangulo;
		int ladocuadrado, acuadrado;
		int ladorectangulo,baserectangulo, arectangulo;
			//Hacemos que nos pida una de esas 3
		System.out.println("Ponga 1 para triangulo, 2 para cuadrado y 3 para rectangulo.");
		forma=teclado.nextInt();
		switch (forma) {
			case 1:
				System.out.println("Introduce la altura del triangulo: ");
				alturatriangulo= teclado.nextInt();
				System.out.println("Introduce la base del triangulo: ");
				basetriangulo= teclado.nextInt();
				atriangulo = (alturatriangulo*basetriangulo) /2;
				System.out.println("El area es: " + atriangulo);
				break;
			case 2:
				System.out.println("Introduce lado del cuadrado: ");
				ladocuadrado= teclado.nextInt();
				acuadrado = (ladocuadrado*ladocuadrado);
				System.out.println("El area es: " + acuadrado);
				break;
			case 3:
				System.out.println("Introduce el lado del rectangulo: ");
				ladorectangulo= teclado.nextInt();
				System.out.println("Introduce la base del rectangulo: ");
				baserectangulo= teclado.nextInt();
				arectangulo = (ladorectangulo*baserectangulo);
				System.out.println("El area es: " + arectangulo);
				break;
			default:
				System.out.println("Introduce un numero del 1 al 3: ");
		}
	}
}