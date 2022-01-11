import java.util.Scanner;
/** Calcula el area de un rectangulo.
 * 
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Repaso_3 { 
	
	public static void main (String []Args) {
		
	
	Scanner teclado= new Scanner(System.in);
	int base, altura;
	int area;
	
	System.out.println("Introduce la base del rectangulo: ");
	base= teclado.nextInt();
	System.out.println("Introduce la altura del rectangulo");
	altura= teclado.nextInt();
	
	area= base*altura;
	System.out.println("El area del rectangulo es: " + area);
	}
}
