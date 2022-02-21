import java.util.*;
public class Maquinistas extends Empleado{
	Scanner teclado=new Scanner(System.in);
	
	int maquinaAsig;
	int numAños;

	
	public void pedirDatos(){	
		System.out.println("Introduce el nombre (maqui): ");
		nombre=teclado.next();
		System.out.println("Introduce la edad (maqui): ");
		edad=teclado.nextInt();	
		System.out.println("Introduce el numero de la maquina asignada: ");
		maquinaAsig=teclado.nextInt();
		System.out.println("Introduce los años que lleva en la empresa: ");
		numAños=teclado.nextInt();

	}

	public void verEdad() {
		System.out.println(edad);	

	}
	
	
	
}
