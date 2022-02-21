import java.util.*;
public class Empleado {
	Scanner teclado=new Scanner(System.in);
	
	public String nombre;
	public int sueldoBase=1000;
	public int edad;

	
	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre=nombre;}
	
	public int getEdad() {
		return edad;}
	public void setEdad(int edad) {
		this.edad=edad;}

	
	public void pedirDatos() {	
			System.out.println("Introduce el nombre (emple normal): ");
			nombre=teclado.next();
			System.out.println("Introduce la edad (emple normal): ");
			edad=teclado.nextInt();	

	}
	
	public void verEdad() {
		System.out.println(edad);
	}
	
	
}
