import java.util.Scanner;
public class Ej_5_Empleado {
	Scanner teclado=new Scanner(System.in);
	
	private String nombre;
	private int numEmpleado;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nueNombre) {
		this.nombre=nueNombre;
	}
	
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(int nueNumEmpleado) {
		this.numEmpleado=nueNumEmpleado;
	}
	
	public void leerDatos() {
	System.out.println("Introduzca el nombre del empleado: ");
	setNombre(teclado.nextLine());
	
	System.out.println("Introduzca el numero del empleado");
	setNumEmpleado(teclado.nextInt());
	}
	
	public void verDatos() {
		leerDatos();
		System.out.println("El nombre del empleado es: " + getNombre());
		System.out.println("El numero del empleado es: " + getNumEmpleado());
	}
}
