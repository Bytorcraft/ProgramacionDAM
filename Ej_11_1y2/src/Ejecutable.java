/**Crear un programa que guarde en un fichero la criba de Eratostenes del 1 al 500.
 * Y luego lo imprima
 */
import java.util.*;
import java.io.*;
public class Ejecutable {

	public static void main(String[] args) {

		String[] lineas = {"2", "3", "5", "7", "11", "13", "17", "19", "23", "29", "31", "37", "41", "43", "47", "53", "59", "61", "67", "71", "73", "79", "83", "89", "97", "101", "103", "107", "109", "113", "127", "131", "137", "139", "149", "151", "157", "163", "167", "173", "179", "181", "191", "193", "197", "199", "211", "223", "227", "229", "233", "239", "241", "251", "257", "263", "269", "271", "277", "281", "283", "293", "307", "311", "313", "317", "331", "337", "347", "349", "353", "359", "367", "373", "379", "383", "389", "397", "401", "409", "419", "421", "431", "433", "439", "443", "449", "457", "461", "463", "467", "479", "487", "491", "499" };

		FileWriter fichero = null;
		try {

			fichero = new FileWriter("C:\\Users\\alu\\Documents\\Programacion\\eclipse\\Ej_11_1\\src\\primos.txt");

			for (String linea : lineas) { // Escribe linea a linea en el fichero
				fichero.write(linea + "\n");
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
		
		// Fichero del que queremos leer
				File documento = new File("C:\\Users\\alu\\Documents\\Programacion\\eclipse\\Ej_11_1\\src\\primos.txt");
				Scanner s = null;

				try {
					// Leemos el contenido del fichero
					System.out.println("... Leemos el contenido del fichero ...");
					s = new Scanner(documento);
					
					int indice =1;
					// Leemos linea a linea el fichero
					while (s.hasNextLine()) {
						
						String linea = s.nextLine(); 	// Guardamos la linea en un String
						System.out.println(indice+ ".- "+linea); 
						indice++;// Imprimimos la linea
					}

				} catch (Exception ex) {
					System.out.println("Mensaje: " + ex.getMessage());
				} finally {
					// Cerramos el fichero tanto si la lectura ha sido correcta o no
					try {
						if (s != null)
							s.close();
					} catch (Exception ex2) {
						System.out.println("Mensaje 2: " + ex2.getMessage());
					}
				}
		
	}

}
