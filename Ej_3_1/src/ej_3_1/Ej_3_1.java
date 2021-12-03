package ej_3_1;
import java.util.Scanner;
/**
 * 
 */
/**
 * @author Minaya Herrero Latorre
 *
 */
public class Ej_3_1 {
public static void main (String []args) {
	Scanner teclado = new Scanner(System.in);
	int a, b;
	int suma=0;
	System.out.println ("Introduzca el numero menor: ");
	a = teclado.nextInt();
	System.out.println ("Introduzca el numero mayor: ");	
	b = teclado.nextInt();
	for (int contador= a+1; contador < b; contador++)
		suma += contador;
	System.out.println("La suma es: " + suma);
} }