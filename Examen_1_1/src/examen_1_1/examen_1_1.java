package examen_1_1;
import java.util.Scanner;
/**
 * Programa que segun el valor obtenido, obtenga una piramide
 */
/**
 * @author Minaya
 *
 */
public class examen_1_1 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int introducido;
		
		System.out.println("Introduce de cuanta altura lo quieres: ");
		introducido=teclado.nextInt();
		
		System.out.println("N= " + introducido);
		if(introducido>0) {
			for(int x=0; x<introducido;x++) {
				System.out.println(" ");
				for (int i=0; i<introducido-x; i++) {
					System.out.print(" ");
				}	
				for (int z=0; z<=x;z++) {
					System.out.print("*");
				}
			}				
		}
	}
}