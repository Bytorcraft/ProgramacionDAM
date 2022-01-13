import java.util.Scanner;
/**Programa que te dice cuantas combinaciones de agrupaciones puedes tener
 *  
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Ej_5_8 {
	static Scanner teclado =new Scanner(System.in);
	
		public static void main (String [] Args) {
			int n, m;
			long combinaciones;
			
			System.out.println("Introduce el numero de elementos: ");
			m=teclado.nextInt();
			System.out.println("Indica en cuanto lo quieres agrupar: ");
			n=teclado.nextInt();
			
			long factorialM=factorialM(m), factorialN=factorialN(n), factorialM_N=factorialM_N(m,n);
			combinaciones= factorialM/( factorialN*factorialM_N);
			
			if(m>n) {	
			System.out.println("Las posibles agrupaciones son: "+ combinaciones);			
			} else {
				System.out.println("El conjunto de elementos es menor de como lo que quieres agrupar.");
			}		
	}
		static long factorialM(int m) {//factorial de m
			int factorial=1;
			
			if(m<=0) {// si es menor de 0 no se ejecuta
				System.out.println("No puede ser menor de 0 para hacer el factorial");
			}else {
				for(int x=m; x>0; x--) {
					factorial= factorial*x;
				}
			}
		return factorial;	
		}
		
		static long factorialN(int n) {//factorial de n
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
		
		static long factorialM_N(int m,int n) {//factorial de m-n
			int factorial=1;
			int m_n=m-n;
			
			if(m_n<=0) {// si es menor de 0 no se ejecuta
				System.out.println("No puede ser menor de 0 para hacer el factorial");
			}else {
				for(int x=m_n; x>0; x--) {
					factorial= factorial*x;
				}
			}
		return factorial;	
		}	
}
