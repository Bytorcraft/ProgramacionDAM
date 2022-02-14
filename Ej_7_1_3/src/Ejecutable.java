/** Programa que regula los sueldos en una empresa
 * @author Minaya Herrero 
 * @date 14/02/2022
 */
import java.util.*;
public class Ejecutable {

	public static void main(String[] Args) {
		Scanner teclado=new Scanner(System.in);
		
		Empleado emple=new Empleado();
		Jefe jefe=new Jefe();
		
		boolean furula=true;
		int eleccion;
		
		do {
			System.out.println("DADO EL SIGUIENTE MENÚ:\r\n"
					+ "1. Modificar el sueldo base de todos los empleados.\r\n"
					+ "2. Modificar el plus de todos los jefes.\r\n"
					+ "3. Visualizar los datos de todos los empleados.\r\n"
					+ "4. Salir.\r\n"
					+ "ELIJA UNA OPCIÓN:");
			eleccion=teclado.nextInt();
			switch(eleccion) {
			case 1:
				System.out.println("El nuevo saldo base sera de: ");
				emple.setsBase(teclado.nextInt());
				break;
			case 2:
				System.out.println("El nuevo plus para los jefes sera: ");
				jefe.setPlus(teclado.nextInt());
				break;
			case 3:
				emple.verEmple();
				jefe.verJefe();
				break;
			case 4:
				furula=false;
				break;
			default:
				System.out.println("Algo ha pasado");
			}
			
		}while(furula==true);
	}

}
