import java.util.Scanner;
/** Realiza la suma, resta, mult, y division de unos operandos.
 * 
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Repaso_2 { 
	
	public static void main (String []Args) {
		
	
	Scanner teclado= new Scanner(System.in);
	
	int num1, num2;
	int suma, resta, mult, divi;
	
	System.out.println("Introduce el primer operando: ");
	num1= teclado.nextInt();
	System.out.println("Introduce el segundo operando: ");
	num2= teclado.nextInt();
		
	suma= num1+num2;
	resta= num1-num2;
	mult= num1*num2;
	divi= num1/num2;
	System.out.println("La suma de ambos da: "+ suma);
	System.out.println("La resta de ambos da: "+ resta);
	System.out.println("La multiplicacion de ambos da: "+ mult);
	System.out.println("La division de ambos da: "+ divi);
	
	}
}