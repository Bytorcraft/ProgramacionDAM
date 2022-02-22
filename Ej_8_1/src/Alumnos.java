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
		boolean hacer=true;
		
		do {	
		try {
		
		System.out.println("Indica el nombre del primer alumno: ");
		nomb1=teclado.next();
		
		do {// validaremos que la altura este entre 0 y 2,5m
			System.out.println("Indica la altura del primer alumno (m): ");
			altu1=teclado.nextDouble();
		}while(altu1<=0 && altu1>=2.50);
		
		do {//validaremos que la edad este entre 0 y 130 años
			System.out.println("Indica la edad del primer alumno: ");
			edad1=teclado.nextInt();
		}while(edad1<=0 && edad1>=130);
		
		System.out.println("Indica el nombre del segundo alumno: ");
		nomb2=teclado.next();
		
		do {// validaremos que la altura este entre 0 y 2,5m
			System.out.println("Indica la altura del segundo alumno (m): ");
			altu2=teclado.nextDouble();
			}while(altu2<=0 && altu2>=2.50);
		
		do {//validaremos que la edad este entre 0 y 130 años
			System.out.println("Indica la edad del segundo alumno: ");
			edad2=teclado.nextInt();
		}while(edad2<=0 && edad2>=130);
		
		if(edad1>edad2) {
			System.out.println("El alumno "+nomb1+" es mas mayor que "+nomb2);
		}else if(edad2>edad1){
			System.out.println("El alumno "+nomb2+" es mas mayor que "+nomb1);
		}else if(edad1==edad2) {
			System.out.println("Ambos alumnos tienen la misma edad");
		}	
		hacer=true;	
		}catch(InputMismatchException o) {//error de int/double a letra
			hacer=false;
			System.out.println("Error al introducir un dato del alumno, en la altura/edad, pon solo datos numericos ");
			System.out.println(" ");
		}
		
		}while(hacer==false);
	}
	
}
