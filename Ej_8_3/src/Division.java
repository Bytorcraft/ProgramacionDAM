/**Programa al que le introduces un dividendo y un divisor y te muestra el cociente, no para hasta que se introduce un 0
 * o un dato no valido.
 * 
 */
import java.util.*;
public class Division {

	public static void main(String[]Args) {
	Scanner teclado=new Scanner(System.in);
		
		int dividendo, divisor, cociente;
		
			try {
				
			do {	
			
			System.out.println("Introduce el dividendo: ");
			dividendo=teclado.nextInt();
			System.out.println("Introduce el divisor: ");
			divisor=teclado.nextInt();
			
			cociente= dividendo/divisor;
			System.out.println("El cociente de dividir "+dividendo+"/"+divisor+" es: "+ cociente);
			
			}while(dividendo>=0 && divisor>=0 );
			
			}catch(InputMismatchException o ) { //error por si se mete una letra
				System.out.println("Has metido algo que no era un numero, el programa ha finalizado.");
			}catch(ArithmeticException q) { //si metes 0, se para y te lo indica
				System.out.println("Has introducido un 0, se para el programa.");
			}
			
			
		
		
		
		
	}

}
