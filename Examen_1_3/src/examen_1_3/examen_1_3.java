package examen_1_3;
import java.util.Scanner;
/**
 * Programa que te diga los dias que han pasado desde que nacistes hasta hoy.
 */
/**
 * @author Minaya
 *
 */
public class examen_1_3 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		
		int diaHoy, mesHoy, a�oHoy;
		int diaNac, mesNac, a�oNac;
		int contador=0, bisiesto=0;
		int diasHastaHoy;
		
		//Pediremos los datos
		System.out.println("Introduce el dia de hoy: ");
		diaHoy=teclado.nextInt();
		System.out.println("Introduce el mes en el que estamos: ");
		mesHoy=teclado.nextInt();
		System.out.println("Introduce el a�o en el que estamos: ");
		a�oHoy=teclado.nextInt();
		System.out.println("Introduce tu dia de nacimiento: ");
		diaNac=teclado.nextInt();
		System.out.println("Introduce tu mes de nacimiento: ");
		mesNac=teclado.nextInt();
		System.out.println("Introduce tu a�o de nacimiento: ");
		a�oNac=teclado.nextInt();
		
		if(a�oNac%4 ==0) {
			bisiesto++;
		}
		
		for(int x=a�oNac; x<a�oHoy; x++) {
			if(x%4==0) {
				contador++;//te dara cuantos a�os bisiestos hay entre ambas fechas
			}
		}
		
		if (a�oHoy>a�oNac){
		//Tomare como si cada mes tuviera 30 dias (menos febrero)
		
		diasHastaHoy=(a�oHoy*365+mesHoy*30+diaHoy+contador)-(a�oNac*365+mesNac*30+diaNac+bisiesto); 
		
		System.out.println("Han pasado "+ diasHastaHoy + " dias desde que nacistes.");
		}else {
			System.out.println("El a�o en el que nacistes es mayor que en el que estamos");
		}
		
	}
}