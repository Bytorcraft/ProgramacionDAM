package ej_3_11;
import java.util.Scanner;
/**
 * Programa que lee un numero y te dice los primos hasta ese num.
 */
/**
 * @author Minaya
 *
 */
public class ej_3_11 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor= 1;
		int contador;
		//hacemos que pida el numero
		System.out.println("Introduce el numero hasta el que se quiera contar los primos: ");
		numero= teclado.nextInt();

		// creamos el proceso para decir los primos
		contador=numero;
		while(contador<numero) {
			boolean primo;
			primo= numero%2 !=0 || numero==2;
			divisor=3;
			contador--;
			while (primo && divisor < numero && numero !=2){
				if (numero% divisor ==0)
					primo = false;
				divisor+=2;
				}
			System.out.println ("El numero siguiente es: " + numero );	
			}
			}
		}	
	
