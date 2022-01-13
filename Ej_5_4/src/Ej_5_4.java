import java.util.Scanner;
/**Programa que te dice cual son todos los primos hasta ese numero.
 *  
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Ej_5_4 {
	static Scanner teclado =new Scanner(System.in);
	
		public static void main (String [] Args) {
			int n;
			
			System.out.println("Introduzca el numero, y te dire los primos hasta ese numero: ");
			n= teclado.nextInt();
	
			if (n>0) {
				System.out.println("Los numeros primos hasta el " +n + " son:" );
				hacer(n);
			}else {
				System.out.println("Introduce un numero positivo.");
			}	
				}
		static boolean primo(int n) {
		int contador=0;
		boolean primo=true;
		
			for (int x=2; x<n; x++) {
				if(n%x ==0) {
					primo=false;
				} 
				}return primo;
	}
		static void hacer(int n) { // lo que quiero que haga, es que recorra todos los numeros a partir del 3
			for(int x=3; x<=n; x++) {
				boolean primo= primo(x);// aqui pondremos que evalue X ya que es el numero que queremos que compruebe
				if(primo==true) {// haremos que si algun numero es primo, lo muestre por pantalla
					System.out.println(x+ " ");
				}
			}
		}
}
