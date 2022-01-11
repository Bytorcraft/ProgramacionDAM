import java.util.Scanner;
/** Calcula la nota que tienes que sacar en el siguiente examen, para obtener la nota deseada.
 * 
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Repaso_5 { 
	
	public static void main (String []Args) {
		
	Scanner teclado= new Scanner(System.in);
	
	double primerEx, segunEx, segunEv;
	
	System.out.println("Introduce la nota del primer examen: ");
	primerEx= teclado.nextDouble();
	
	System.out.println("La nota que quiero sacar en la seguna evaluacion es:");
	segunEv= teclado.nextDouble();
	
	segunEx= (segunEv-(30*primerEx)/100)*100/70;
	
	System.out.println("En el segundo examen necesitas sacar un " +segunEx +" para tener un " +segunEv + " en la segunda evaluacion");
	}

}
