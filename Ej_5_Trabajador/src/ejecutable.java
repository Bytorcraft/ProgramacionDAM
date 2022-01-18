import java.util.*;
public class ejecutable {
 Scanner teclado= new Scanner(System.in);
		public static void main (String []Args) {
			Trabajador nuevoTrabajador= new Trabajador();
			nuevoTrabajador.introducirDatos();
			nuevoTrabajador.mostrarDatos();
			nuevoTrabajador.calculoNomina();
		}
}
