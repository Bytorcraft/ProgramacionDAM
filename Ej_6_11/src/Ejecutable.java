/**Programa que crea 3 matrices, obtener el número de filas o de columnas, el valor de una celda, asignar valor a una celda, imprimirla, sumar matrices, restar y multiplicar.
 * 
 * @author Usuario
 *
 */
import java.util.*;
public class Ejecutable {

	public static void main (String[]Agrs) {
		Scanner teclado=new Scanner(System.in);
		
		int opcion;
		boolean furula=true;
		int n;
		
		
		System.out.println("Introduce de cuanto quires que sea tu matriz Ej: 10 si quieres que sea 10x10, 3 si quieres que sea 3x3.");
		n=teclado.nextInt();
		Matriz nuevaMatriz=new Matriz(n);
		
		
		nuevaMatriz.crearVectores();
		nuevaMatriz.getFilas();
		nuevaMatriz.getColumnas();
		
		do {
			System.out.println("");
			System.out.println("Indique 1 para ver el valor de una celda, 2 para asignarle un valor a una celda,");
			System.out.println("3 para imprimir la matriz, 4 para sumar 2 matrices, 5 para restarlas, 6 para multiplicarlas y 7 para salir"); 
			opcion=teclado.nextInt();
				
			switch(opcion) {
			case 1 :
				nuevaMatriz.valorCelda();
				break;
			case 2:
				nuevaMatriz.introDato();
				break;
			case 3:
				nuevaMatriz.imprimir();
				break;
			case 4:
				nuevaMatriz.suma();
				break;
			case 5:
				nuevaMatriz.resta();
				break;
			case 6:
				nuevaMatriz.mult();
				break;
			case 7:
				furula=false;
				break;
				
				default: System.out.println("Porfavor, no rompas los huevos e introduce un valor del 1 al 7 (INCLUIDOS).");
			}
		}while (furula==true);
		
	}

}
