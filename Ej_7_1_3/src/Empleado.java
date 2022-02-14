import java.util.*;
public class Empleado {

	Scanner teclado=new Scanner(System.in);
	
	public String nomEmpresa="Electrica, S.A";
	public String nombre;
	public int edad;
	public int sBase=1000;
	public int sIncremento=0;
	

	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre = nombre;}
	
	public int getEdad() {
		return edad;}
	public void setEdad(int edad) {
		this.edad = edad;}
	
	public int getsBase() {
		return sBase;}
	public void setsBase(int sBase) {
		this.sBase = sBase;}
	
	public int getsIncremento() {
		return sIncremento;}
	public void setsIncremento(int sIncremento) {
		sIncremento= this.sIncremento+this.sBase;}
	
	public void verEmple() {
		System.out.println("Introduce el nombre: ");
		nombre= teclado.next();
		System.out.println("Introduce la edad: ");
		edad=teclado.nextInt();
		sIncremento=getsIncremento();
		System.out.println(nombre+" tiene "+edad+" años, cobra "+sBase+"€");
	}
	
}
