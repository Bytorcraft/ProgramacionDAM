/** Programa que pide datos de empleados y jefes(que son empleados) y muestra el nombre, el salario y el titulo, el departamento del jefe 
 * @author Minaya Herrero
 * @date 14/02/2022
 */
import java.util.*;
public class Ejecutable {
	
	
	public static void main(String[]Args) {
	Scanner teclado=new Scanner(System.in);
	
	Empleado emple=new Empleado();
	Jefe jefe=new Jefe();
	
	boolean furula=true;
	int eleccion;
	
	do {
		System.out.println("Si quiere introducir un empleado, pulse 1, si quiere introducir un jefe pulse 2, sino, pulse 3 para salir.");
		eleccion=teclado.nextInt();
		switch(eleccion) {
		case 1:
			emple.imprimeEmp();
			break;
		case 2:
			jefe.imprimeJefe();
			break;	
		case 3:
			furula=false;
			break;
		default:
			System.out.println("Algo ha pasado");
		}
		
	}while(furula==true);
	
	
	}
}
