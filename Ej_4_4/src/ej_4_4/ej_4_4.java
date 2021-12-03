package ej_4_4;
import java.util.Scanner;
/**
 * Programa que lee una palabra y una frase y diga si la palabra esta en la frase.
 */
/**
 * @author Minaya
 *
 */
public class ej_4_4 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		String variable;
		
		System.out.println("Escribe la frase: ");
		frase= teclado.nextLine();
		
		System.out.println("Escribe si quieres el texto en  "+'"' + "mayusculas"+ '"'+ " o "+'"'+"minusculas:"+'"');
		variable= teclado.nextLine();
		
		
		if(variable.equalsIgnoreCase("mayusculas") ) {
		 System.out.println( frase.toUpperCase());
		}else {System.out.println(frase.toLowerCase());}	
		
		}
	}
