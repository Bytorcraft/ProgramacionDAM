import java.util.*;
public class Jefe extends Empleado {

	Scanner teclado=new Scanner(System.in);
	
	public int plus=250;
	public String departamento;
	Empleado emple=new Empleado();
	
	public int getPlus() {
		return plus;}
	public void setPlus(int plus) {
		this.plus = plus;}
	
	public String getDepartamento() {
		return departamento;}
	public void setDepatamento(String departamento) {
		this.departamento = departamento;}
	
	public void verJefe() {
		System.out.println("Introduce el nombre: ");
		nombre= teclado.next();
		System.out.println("Introduce la edad: ");
		edad=teclado.nextInt();
		sBase=emple.getsBase()+getPlus();
		sIncremento=0;
		System.out.println("Introduce el departamento del que es responsable: ");
		departamento=teclado.next();
		System.out.println(nombre+" tiene "+edad+" años, cobra "+sBase+"€ (teniendo un plus de "+plus+"€ ), siendo jefe de "+ departamento);
	}

}
