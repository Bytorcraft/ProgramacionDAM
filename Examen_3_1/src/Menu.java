/** Clase con el menu para la agenda
 * 
 * @author Minaya Herrero Latorre
 * @date 23/05/2022
 */
import java.io.*;
import java.util.*;

public class Menu {
	Scanner teclado= new Scanner(System.in);
	
	
	
	void menu() {
		
		try {
			BufferedReader entrada = new BufferedReader(new FileReader("agenda.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
		}
		
		int opcion;
		System.out.println("Elige una opcion: ");
		System.out.println("1 - Añadir contacto en la agenda."
				+ "2 - Borrar contacto en la agenda "
				+ "3 - Listado en orden alfabético de todos los contactos de la agenda."
				+ "4 - Buscar por nombre."
				+ "5.- Añadir un teléfono a un contacto."
				+ "6.- Borrar un teléfono de un contacto."
				+ "7 - Buscar por teléfono."
				+ "0 - Salir(de windows).");
		opcion = teclado.nextInt();
		
		switch (opcion){
			case 0:
				ibriquidibri();
				break;
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			default:
				System.out.println("Error, numero no valido, saliendo....");
				ibriquidibri();
			
		}
	}
	
	void ibriquidibri() { // metodo que hace magia y se apaga el pc
		
	}
}
