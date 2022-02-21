/**Programa que te pide el nombre, edad y altura de dos alumnos, dice cual es el mas viejo y si teien la misma edad habra que mostrarlo.
 * Si se produce el error IOException, se visualizará el mensaje correspondiente y se cerrará.
 * Tanto en la edad como en la altura, si se ha metido una letra, te hara repetirlo hasta que lo hagas bien.
 * @author Minaya Herrero
 * @date 21/02/2022 
 */
import java.io.IOException;
import java.util.*;
public class Alumnos {
	public static void main(String[]Args) {
		Scanner teclado=new Scanner(System.in);
		
		String nomb1, nomb2;
		int edad1, edad2;
		double altu1, altu2;
		
		System.out.println("Indica el nombre del primer alumno: ");
		nomb1=teclado.next();
		System.out.println("Indica la altura del primer alumno: ");
		altu1=teclado.nextDouble();
		System.out.println("Indica la edad del primer alumno: ");
		edad1=teclado.nextInt();
		
		System.out.println("Indica el nombre del segundo alumno: ");
		nomb2=teclado.next();
		System.out.println("Indica la altura del segundo alumno: ");
		altu2=teclado.nextDouble();
		System.out.println("Indica la edad del segundo alumno: ");
		edad2=teclado.nextInt();
		
		
		if(edad1>edad2) {
			System.out.println("El alumno "+nomb1+" es mas mayor que "+nomb2);
		}else if(edad2>edad1){
			System.out.println("El alumno "+nomb2+" es mas mayor que "+nomb1);
		}else if(edad1==edad2) {
			System.out.println("Ambos alumnos tienen la misma edad");
		}
		try {
			// Sentencias
			} catch ( IOException esError ) {
			// Sentencias para gestionar errores de E/S
		
	}
	}

}
