import java.util.*;
 class Cliente implements Persona {
Scanner teclado=new Scanner(System.in);
	 
	public String nombre;
	public int paga;
	 
	public void pedirTodosDatos() {
			System.out.println("Indica el nombre del cliente: ");
			nombre=teclado.next();
			System.out.println("Indica cuando ha pagado el cliente: ");
			paga=teclado.nextInt();
	}
		
	public void visualizarTodosDatos() {
			System.out.println("El cliente "+nombre+" ha gastado "+paga+"€ en la tienda");
		}

}
