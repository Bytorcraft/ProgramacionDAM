import java.util.*;
public class Jefe extends Empleado {

	public String titulo;
	public String departamento;
	
	public String getTitulo() {
		return titulo;}
	public void setTitulo(String titulo) {
		this.titulo=titulo;}
	
	public String getDepartamento() {
		return departamento;}
	public void setDepartamento(String departamento){
		this.departamento=departamento;}
	
	public void imprimeJefe() {
		System.out.println("Introduce el nombre del jefe: ");
		nombre=teclado.nextLine();
		System.out.println("Introduce el salario del jefe: ");
		salario=teclado.nextInt();
		System.out.println("Introduce el titulo del jefe: "); 
		titulo=teclado.next();
		System.out.println("Introduce el departamento del jefe: ");
		departamento=teclado.next();
		System.out.println("El jefe se llama "+nombre+", cobra "+salario+", tiene el titulo de "+titulo+" y es jefe del departamento de "+ departamento);
	}
}
