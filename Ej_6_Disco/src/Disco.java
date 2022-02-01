/**
 * Programa que almacena datos de discos.
 * @author alu
 * @date
 */
import java.util.Scanner;
public class Disco {
	 Scanner teclado= new Scanner(System.in);
	 
	private String titulo;
	private int numCanciones;
	private int precio;
	private String fechCompra;
	
	public String getTitulo() {
		return titulo;}
	public void setTitulo(String titulo) {
		this.titulo = titulo;}
	
	public int getNumCanciones() {
		return numCanciones;}
	public void setNumCanciones(int numCanciones) {
		this.numCanciones = numCanciones;}
	
	public int getPrecio() {
		return precio;}
	public void setPrecio(int precio) {
		this.precio = precio;}
	
	public String getFechCompra() {
		fechCompra=teclado.nextLine();
		return fechCompra;}
	public void setFechCompra(String fechCompra) {
		this.fechCompra = fechCompra;}
	
	public void entradaDatos() {
		int indice=0;
		
		System.out.println("Introduce el Titulo del album: ");
		titulo=teclado.nextLine();
		
		System.out.println("Di cuantas canciones tiene: ");
		numCanciones=teclado.nextInt();
		
		System.out.println("Introduce el precio: ");
		precio=teclado.nextInt();
		
		System.out.println("Introduce la fecha de compra: ");
		fechCompra=teclado.nextLine();
		
	}
	
}
