package ej_3_6;
import java.util.Scanner;
/**
 * Programa que lee varios num, solo para si es 0, da la suma de los introducidos de forma par e impar.
 */
/**
 * @author Minaya
 *
 */
public class ej_3_6 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int numeropar;
		int numeroimpar;
		int sumapar = 0;
		int sumaimpar=0;
		// lee los numeros y segun el orden, los clasifica en par o impar. 
		do {
			System.out.print("Introduce un numero para sumar, para finalizar pulse 0 dos veces: ");
			numeropar =teclado.nextInt();
			sumapar += numeropar;
			
			System.out.print("Introduce un numero para sumar, para finalizar pulse 0 una vez: ");
			numeroimpar =teclado.nextInt();
			sumaimpar += numeroimpar;
	
		} while (numeropar != 0);
		System.out.println("La suma de los  numeros introducidos (par) es: " + sumapar + 
				"\n La suma de los  numeros introducidos (impar) es: " +sumaimpar);
		
		
	
		}
	}