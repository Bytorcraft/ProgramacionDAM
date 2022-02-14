import java.util.*;
public class Empleado {
	
	Scanner teclado=new Scanner(System.in);
	
	public String nombre;
	public int salario;
	
	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre = nombre;}
	
	public int getSalario() {
		return salario;}
	public void setSalario(int salario) {
		this.salario = salario;}
	
	public void imprimeEmp() {
		System.out.println("Introduce el nombre del empleado: ");
		nombre=teclado.nextLine();
		System.out.println("Introduce el salario del empleado: ");
		salario=teclado.nextInt();
		System.out.println("El empleado se llama "+nombre+" y cobra "+salario);
	}
}
