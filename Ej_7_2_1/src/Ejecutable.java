/**Diseña una interface llamada persona, dos clases que la implementen y pide los datos de un cliente/empleado y visualizalos.
 * @author Minaya Herrero
 * @date 14/02/2022
 */
import java.util.*;
public class Ejecutable {

	public static void main(String[]Args) {
		Scanner teclado=new Scanner(System.in);
		
		Persona empleado =new Empleado();	//has de crear una instancia de la subclase que quieras, no puedes
		Persona cliente =new Cliente();		// hacerlo de la superclase "Persona"
		
		empleado.pedirTodosDatos();
		cliente.pedirTodosDatos();
		
		empleado.visualizarTodosDatos();
		cliente.visualizarTodosDatos();
		
		
	}

}
