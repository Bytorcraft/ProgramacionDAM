import java.util.*;
public class Maquinistas extends Empleado{
	Scanner teclado=new Scanner(System.in);
	
	int maquinaAsig;
	int numA?os;
	
	public void pedirDatos(){	
		System.out.println("Introduce el nombre (maqui): ");
		nombre=teclado.next();
		System.out.println("Introduce la edad: ");
		edad=teclado.nextInt();	
		System.out.println("Introduce el numero de la maquina asignada: ");
		maquinaAsig=teclado.nextInt();
		System.out.println("Introduce los a?os que lleva en la empresa: ");
		numA?os=teclado.nextInt();	
	}

	@Override
	public void verTodosDatos() {
		super.verTodosDatos();
		System.out.println("Sus datos son: \n NOMBRE: "+nombre+"\n EDAD: "+edad+ "\n Cobra "+sueldoBase);
		System.out.println("Y tiene la maquina numero: "+maquinaAsig+"\n Y lleva "+numA?os+" a?os en la empresa");
	}
	
	
}
