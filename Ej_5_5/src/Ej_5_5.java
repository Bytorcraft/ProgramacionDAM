import java.util.Scanner;
/**Programa que te dice el M.C.D de 2 numeros
 *  
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Ej_5_5 {
	static Scanner teclado =new Scanner(System.in);
	
		public static void main (String [] Args) {
			
			int p,q;
			
			System.out.println("Introduce el numero mas pequeño: ");
			p=teclado.nextInt();
			System.out.println("Introduce el numero mas grande: ");
			q=teclado.nextInt();
			
			int mcd= mCD(p,q);
			System.out.println("El MCD de "+p +" y " +q + " es "+ mcd);
			
	}
		public static int mCD(int p, int q) {
			int temp; //debemos crear este temporal para no perder Q
			while (q !=0) {
				temp=q;
				q=p%q;
				p=temp;
			}

			return p;
		}
}
