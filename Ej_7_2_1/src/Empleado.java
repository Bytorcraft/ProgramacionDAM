import java.util.*;
 class Empleado implements Persona  {
	 Scanner teclado=new Scanner(System.in);
	
	 public String nombre;
	 public int pago;
	 
	 
	public void pedirTodosDatos() {
	System.out.println("Introduce el nombre del empleado: ");
	nombre=teclado.next();
	System.out.println("Introduce el pago que recibe: ");
	pago=teclado.nextInt();
	}
	
	public void visualizarTodosDatos() {
		System.out.println("El empleado "+nombre+" cobra "+pago+"€");
	}

}
