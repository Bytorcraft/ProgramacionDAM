import java.util.Scanner;
/**Programa que te dice si con los numeros introducidos puedes hacer una raiz cuadrada.
 *  
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Ej_5_9 {
	static Scanner teclado =new Scanner(System.in);
	
		public static void main (String [] Args) {
		double a,b,c;
			
		System.out.println("Introduce de la ecuacion de segundo termino, el valor a: ");
		a=teclado.nextDouble();
		System.out.println("Introduce de la ecuacion de segundo termino, el valor b: ");
		b=teclado.nextDouble();
		System.out.println("Introduce de la ecuacion de segundo termino, el valor c: ");
		c=teclado.nextDouble();
			
		raiz(a,b,c);	
	}
		
		static void raiz(double a, double b, double c) {
			
			double raiz1, raiz2;
			
			if(b*b-4*a*c>0) {
				raiz1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
				raiz2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
				
				System.out.println("El resultado de la raiz (-b+√(b*b-4*a*c))/(2*a) es: " +raiz1);
				System.out.println("El resultado de la raiz (-b-√(b*b-4*a*c))/(2*a) es: " +raiz2);
			}else {
				System.out.println("b^2-4*a*c es un numero negativo, asique no se puede realizar la ecuacion");
			}
		}
}
