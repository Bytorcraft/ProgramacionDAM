import java.util.Scanner;
/** Programa que te convierte los euros a pesetas
 * 
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Repaso_1 { 
	
	public static void main (String []Args) {
		
	
	Scanner teclado= new Scanner(System.in);
	double euros;
	double pesetas;
	double fijo=166.386;
	
	System.out.println("Introduce los euros que quieras convertir a pesetas: ");
	euros= teclado.nextInt();
	
	pesetas= euros*fijo;
	 System.out.println("Los " + euros + " euros serian " + pesetas + " pesetas.");
	}
}
