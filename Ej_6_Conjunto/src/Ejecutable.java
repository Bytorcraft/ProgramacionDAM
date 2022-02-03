/**
 * Te crea una cadena de 100 posiciones, te las rellena de numeros no repetidos y te deja realizar diferentes cosas.
 * @author alu
 *@date 01/02/2022
 */
import java.util.*;
public class Ejecutable {

	public static void main(String[]Args) {
		Scanner teclado=new Scanner(System.in);
		Conjunto nuevoConjunto=new Conjunto();
		
		boolean salir=true;
		int eleccion;
		nuevoConjunto.crear();
		nuevoConjunto.crear2();
do {
			System.out.println("");
			System.out.println("Indique 1 para imprimir, 2 para vaciar, 3 para añadir un numero, 4 para eliminar un numero,");
			System.out.println("5 para copiar el primer vector en otro, 6 te dice si el numero esta, 7 para salir");
				eleccion=teclado.nextInt();
				
			switch(eleccion) {
			case 1 :
				nuevoConjunto.decirVector();
				break;
			case 2:
				nuevoConjunto.vaciar();
				break;
			case 3:
				nuevoConjunto.añadir();
				break;
			case 4:
				nuevoConjunto.eliminar();
				break;
			case 5:
				nuevoConjunto.copia();
				break;
			case 6:
				nuevoConjunto.esMiembro();
				break;
			case 7:
				salir=false;
				break;
				
				default: System.out.println("Porfavor, no rompas los huevos e introduce un valor del 1 al 7 (INCLUIDOS).");
			}
		}while (salir==true);
		
		
	}
}
