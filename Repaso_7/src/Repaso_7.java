import java.util.Scanner;
/** Calcula el salario semanal de un trabajador (a 12 euros la hora) y sus horas extra, si realiza (a 16€/h)
 * 
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Repaso_7 { 
	
	public static void main (String []Args) {
	Scanner teclado= new Scanner(System.in);
	
	int horas, pago, horasExtra, pagoExtra;
	
	System.out.println("Indique las horas trabajadas esta semana: ");
	horas= teclado.nextInt();
	
	if (horas <=40) {
		pago=horas*12;
		System.out.println("Tu salario es de " + pago);
	}if(horas>=41){
		pago=horas*12;
		horasExtra=horas-40;
		pagoExtra= 40*12+horasExtra*16;
		System.out.println("Tu salario es de "+ pagoExtra);
	}
	}

}