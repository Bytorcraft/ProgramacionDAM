import java.util.*;
public class Administrativos extends Empleado {
	Scanner teclado=new Scanner(System.in);
	
	String titulo;
	int ordenador;
	
	public void pedirDatos() {
		System.out.println("Introduce el nombre (admin): ");
		nombre=teclado.next();
		System.out.println("Introduce la edad (admin): ");
		edad=teclado.nextInt();	
		System.out.println("Introduce el titulo del administrativo: ");
		titulo=teclado.next();
		System.out.println("Introduce el ordenador que tiene asignado: ");
		ordenador=teclado.nextInt();
	}
	
	public void verEdad() {
		System.out.println(edad);	
	}

}
