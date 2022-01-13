package ej_4_12;
import java.util.Scanner;
/**
 * Programa que lee una palabra y le da la vuelta.
 */
/**
 * @author Minaya
 *
 */
public class ej_4_12{
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		
		String palabra;
		char letra;
		int longitud;
		
		System.out.println("Introduce frase: ");
		palabra=teclado.nextLine();
		longitud=palabra.length();
		
		if(longitud<=19) {
			for(int x= longitud;x>0; x--) {
				for(int y= longitud;y>0; y--) {
					letra=palabra.charAt(y-1);
					System.out.print(letra);
			} System.out.print(" ");
			}
		}else {System.out.println("Te pasastes de 20 caracteres para la palabra.");}
		
		
	}
}