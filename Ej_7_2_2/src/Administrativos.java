import java.util.*;
public class Administrativos extends Empleado {
	Scanner teclado=new Scanner(System.in);
	
	String titulo;
	int ordenador;
	
	
	public void pedirDatos() {
		System.out.println("Introduce el nombre (admin): ");
		nombre=teclado.next();
		System.out.println("Introduce la edad: ");
		edad=teclado.nextInt();	
		System.out.println("Introduce el titulo del administrativo: ");
		titulo=teclado.next();
		System.out.println("Introduce el ordenador que tiene asignado: ");
		ordenador=teclado.nextInt();	
	}
	
	@Override
	public void verTodosDatos() {
		super.verTodosDatos();
		System.out.println("Sus datos son: \n NOMBRE: "+nombre+"\n EDAD: "+edad+ "\n Cobra "+sueldoBase);
		System.out.println("Y tiene el titulo de: "+titulo+"\n Tiene asignado el pc n�: "+ordenador);
	}

}
