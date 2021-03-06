/**Programa que organiza una empresa, con empleados, maquinistas y administrativos.
 * Pide unos datos y los organiza por grupos.
 * @author Minaya Herrero
 * @date 21/02/2022
 */
import java.util.*;
public class Ejecutable {

	public static void main (String[]Args) {
		Scanner teclado=new Scanner(System.in);
		int numEmpleados, numMaquis, numAdmins;
		
		System.out.println("¿Cuantos empleados normales desea introducir?");
		numEmpleados=teclado.nextInt();
		System.out.println("¿Cuantos maquinistas desea introducir?");
		numMaquis=teclado.nextInt();
		System.out.println("¿Cuantos administrativos desea introducir?");
		numAdmins=teclado.nextInt();
		 
		Empleado[] emple= new Empleado[numEmpleados];
		Empleado[] maquis= new Empleado[numMaquis];
		Empleado[] admins= new Empleado[numAdmins];
		 	
		for (int i = 0; i<emple.length; i++){
			emple[i]=new Empleado();
			emple[i].pedirDatos();	
		}
		for (int i = 0; i<emple.length; i++){
			emple[i].verTodosDatos();
		}
		
		System.out.println(" ");
		
		for (int i = 0; i<maquis.length; i++) {
			maquis[i]=new Maquinistas();
			maquis[i].pedirDatos();
			
		}
		for (int i = 0; i<maquis.length; i++) {
			maquis[i].verTodosDatos();
		}
		
		System.out.println(" ");
		
		for (int i = 0; i<admins.length; i++) {
			admins[i]=new Administrativos();
			admins[i].pedirDatos();	
		}
		for (int i = 0; i<admins.length; i++) {
		admins[i].verTodosDatos();	
		}
	}

}
