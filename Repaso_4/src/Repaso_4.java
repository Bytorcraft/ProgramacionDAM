import java.util.Scanner;
/** Calcula el salario semanal de un trabajador (a 12 euros la hora).
 * 
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Repaso_4 { 
	
	public static void main (String []Args) {
	Scanner teclado= new Scanner(System.in);
	
	int horas, pago;
	
	System.out.println("Indique las horas trabajadas esta semana: ");
	horas= teclado.nextInt();
	
	if (horas <=40) {
		pago=horas*12;
		System.out.println("Tu salario es de " + pago);
	}else {
		System.out.println("No puedes trabajar mas de 40 horas semanales.");
	}
	}

}
