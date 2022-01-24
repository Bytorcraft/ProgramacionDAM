import java.util.Scanner;
public class Ejecutable {

	public static void main(String[]Args) {

		Scanner teclado=new Scanner(System.in);
		Hora nuevaHora= new Hora();
		
		int eleccion, elecOpe;
		
		System.out.println("Si pulsa 1 la hora, sera la que tu pongas, sino, sera tomada como 00:00:00: ");
		eleccion=teclado.nextInt();
		
		if(eleccion==1) {
			nuevaHora.valorDeterminado();
			System.out.println("Si quiere sumar las horas, pulse 1, sino, pulse 2 para restar:");
			elecOpe=teclado.nextInt();
			
			switch(elecOpe) {
			case 1:
				nuevaHora.sumaHoras();
				break;
			case 2:
				nuevaHora.restaHoras();
				break;
			default: System.out.println("Introduce un numero, 1 o 2, ningun otro.");
			}
			
		}else {
			nuevaHora.valorCero();
			System.out.println("Si quiere sumar las horas, pulse 1, sino, pulse 2 para restar:");
			elecOpe=teclado.nextInt();
			
			switch(elecOpe) {
			case 1:
				nuevaHora.sumaHoras();
				break;
			case 2:
				nuevaHora.restaHoras();
				break;
			default: System.out.println("Introduce un numero, 1 o 2, ningun otro.");
			}
		}
		
		
		
		
		
		
	}

}
