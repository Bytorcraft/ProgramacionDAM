import java.util.Scanner;
import java.math.*;
/** Calcula el tiempo de caida de un objeto.
 * 
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Repaso_8 { 
	
	public static void main (String []Args) {
	Scanner teclado= new Scanner(System.in);
	
	double tiempo, altura, gravedad=9.81;
	
	System.out.println("Indica la altura del objeto: ");
	altura=teclado.nextDouble();
	
	tiempo= Math.sqrt((2*altura)/gravedad);
	System.out.println("El tiempo de caida del objeto es de "+ tiempo +" s");
	
	}

}
