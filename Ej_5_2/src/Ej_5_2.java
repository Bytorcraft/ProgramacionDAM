import java.util.Scanner;
/**Programa que te dice cual de los 2 num introducidos tiene mas divisores.
 *  
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Ej_5_2 {
	static Scanner teclado =new Scanner(System.in);
	
		public static void main (String [] Args) {
			int p,q;

			System.out.println("Introduce el primer numero: ");
			p=teclado.nextInt();
			System.out.println("Introduce el segundo numero: ");
			q=teclado.nextInt();
			
			boolean masDivP;
			int contP=0, contQ=0;
			
			masDivP= numero(p,q,contP,contQ); //invocamos al metodo
		
			if (masDivP) {
				System.out.println("El numero "+ p+ " tiene mas divisores que el numero "+ q);
			}else {
				System.out.println("El numero "+ q+ " tiene mas divisores que el numero "+ p);
			}
		}
		static boolean numero(int p, int q,int contP, int contQ) {	
			boolean masP=true;
			
			if (p >=0 && q>=0) {// si ambos son positivos haga lo siguiente
				for(int x=2; p < x; x++ ) {// iremos aumentando en 1 el divisor, si da 0, el contadorP aumentara
					if (p%x ==0) {
						contP++;
					}
				}
				for(int x=2; q < x; x++ ) {// iremos aumentando en 1 el divisor, si da 0, el contadorQ aumentara
					if (q%x ==0) {
						contQ++;
					}
				}	
			}else {
				System.out.println("Alguno de los numero es negativo, no puede continuar");
			}
			if (contP<contQ) {
				masP=false;
			}
			return masP;
	}
}
