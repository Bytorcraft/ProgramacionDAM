import java.util.Scanner;
/** Te da los buenos dias, buenas tardes o buenas noches, segun la hora
 * 
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Repaso_6{ 
	
	public static void main (String []Args) {
		
	Scanner teclado= new Scanner(System.in);
	int hora;
	
	System.out.println("Introduce la hora: ");
	hora=teclado.nextInt();
	
	if(hora>=6 && hora<=12) {
		System.out.println("Buenos dias.");
	}if(hora>=13 && hora<=20) {
		System.out.println("Buenas tardes.");
	}if (hora>=21 && hora<=5) {
		System.out.println("Buenas noches, a la cama ya.");
	}
	}

}
