package ej_3_7;
import java.util.Scanner;
/**
 * Programa que lee num infinitos, solo para si es 0, da la media, el mayor y menor.
 */
/**
 * @author Minaya
 *
 */
public class ej_3_7 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int suma=0;
		int introducidos=0;
		int mayor=0;
		int menor=100000000;
		//haremos que lea los numeros, los sume, haya un contador y que diga el mayor y menor
		do {
			System.out.println("Introduce numeros (se finaliza con el 0): ");
			n= teclado.nextInt();
			suma += n;
			introducidos++;
			if (mayor<n && n != 0) mayor=n;	
			if (menor>n  && n != 0) menor=n;
			
		} while (n !=0);
		--introducidos;
		float media= suma /= introducidos;
		System.out.println("La media es: " + media );
		System.out.println(	"El numero mayor es: " + mayor );
		System.out.println(	"El menor es: " + menor );
	}
}

	