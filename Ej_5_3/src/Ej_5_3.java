import java.util.Scanner;
/**Programa que te dice cual es el factorial del numero.
 *  
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Ej_5_3 {
	static Scanner teclado =new Scanner(System.in);
	
		public static void main (String [] Args) {
		int n;
		
		System.out.println("Introduce un numero y te dire el factorial: ");
		n=teclado.nextInt();
		
		long factorial;
		
		factorial= factorial(n);//invocacion del modulo
		System.out.println("El factorial del numero "+n + " es "+ factorial);
	}

		static long factorial(int n) {
			int factorial=1;
			
			if(n<=0) {// si es menor de 0 no se ejecuta
				System.out.println("No puede ser menor de 0 para hacer el factorial");
			}else {
				for(int x=n; x>0; x--) {
					factorial= factorial*x;
				}
			}
		return factorial;	
		}
}
