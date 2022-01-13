import java.util.Scanner;
/**Programa que te dice el M.C.M de 2 numeros
 *  
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Ej_5_6 {
	static Scanner teclado =new Scanner(System.in);
	
		public static void main (String [] Args) {
			
			int p,q;
			
			System.out.println("Introduce el numero mas pequeño: ");
			p=teclado.nextInt();
			System.out.println("Introduce el numero mas grande: ");
			q=teclado.nextInt();
			
			int mcd= mCD(p,q);
			int mcm= (p/mcd)*q; // reutilizaremos todo el ejercicio anterior, unicamente hara falta añadir esta expresion matematica
			System.out.println("El MCM de "+p +" y " +q + " es "+ mcm);
			
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