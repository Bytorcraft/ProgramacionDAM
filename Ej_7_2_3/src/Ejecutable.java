/**Programa que organiza una empresa, con empleados, maquinistas y administrativos.
 * Solo se quiere saber la media de edada de cada grupo
 * @author Minaya Herrero
 * @date 21/02/2022
 */
import java.util.*;
public class Ejecutable {

	public static void main (String[]Args) {
		Scanner teclado=new Scanner(System.in);
		int numEmpleados, numMaquis, numAdmins;
		int sumaEmple=0,sumaMaqui=0,sumaAdmin=0;
		int mediaEmple,mediaMaqui,mediaAdmin;
		
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
		for (int i = 0; i<emple.length; i++){// haremos que los saque por pantalla las edades y te diga la media
			sumaEmple+=emple[i].edad;
		}
		mediaEmple=sumaEmple/numEmpleados;
		System.out.println("La media de edad es: "+mediaEmple);
		
		System.out.println(" ");
		
		for (int i = 0; i<maquis.length; i++) {
			maquis[i]=new Maquinistas();
			maquis[i].pedirDatos();
		}
		for (int i = 0; i<maquis.length; i++) {
			sumaMaqui+=maquis[i].edad;
			
		}
		mediaMaqui=sumaMaqui/numMaquis;
		System.out.println("La media de edad es: "+mediaMaqui);
		
		System.out.println(" ");
		
		for (int i = 0; i<admins.length; i++) {
			admins[i]=new Administrativos();
			admins[i].pedirDatos();	
		}
		for (int i = 0; i<admins.length; i++) {
			sumaAdmin+=admins[i].edad;
		
		}
		mediaAdmin=sumaAdmin/numAdmins;
		System.out.println("La media de edad es: "+mediaAdmin);
	}

}
