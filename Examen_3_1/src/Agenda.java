/**Clase con la que hacer los metodos correspondientes para la agenda de contactos.
 * 
 * @author Minaya Herreo Latorre
 * @date 29/05/2022
 */
import java.util.*;
import java.io.*;

public class Agenda {
	
	ArrayList<Contacto> contacto = new ArrayList<Contacto>();
	Scanner in=null; // para declararlo solo donde lo necesitemos
	
	
	//este constructor intentara abrir el fichero y si lo consigue volcara todos los datos en el arraylist
		public Agenda(String fichero) {

			try {
				in = new Scanner(new BufferedReader(new FileReader(fichero)));
				while(in.hasNext()) {
					contacto.add(new Contacto(in.nextLine()));
				}
			} catch (FileNotFoundException e) {}
			finally {
				if(in != null)
				in.close();
			}

		}
		//devolvera true si no existe otro contacto con ese nombre y false si existe y no lo añadira
		public boolean addContacto(String nombre,String telefono, String tipo) {

			for(Contacto x : contacto) {

				if(x.nombre.equals(nombre))return false;

			}
			contacto.add(new Contacto(nombre,telefono,tipo));
			return true;

		}

		//devolvera true si existe el contacto eliminandolo y false si no 
		public boolean delContacto(String nombre) {

			for(Contacto x : contacto) {

				if(x.nombre.equals(nombre)) {
					contacto.remove(x);
					return true;
				}

			}
			return false;

		}

		public String listadoAZ() { // ordena los contactos por el nombre

			String salida="";
			ArrayList<Contacto> ordenados = new ArrayList<Contacto>();
			for(Contacto x : contacto) {

				ordenados.add(x);

			}
			Collections.sort(ordenados);
			for(Contacto x : ordenados) {
				salida+=x+"\r";
			}
			return salida;

		}

		//devolvera el objeto con el nombre buscado o null si no lo encuentra
		public Contacto buscaNombre(String nombre) {

			for(Contacto x : contacto) {

				if(x.nombre.equals(nombre))return x;

			}
			return null;

		}

		public void addTelefono(String nombre, String telefono, String tipo) {

			for(Contacto x : contacto) {

				if(x.nombre.equals(nombre))x.addTelefono(telefono,tipo);

			}

		}

		public void delTelefono(String nombre, String telefono) {
			
			int index = 0;
			boolean encontrado=false;
			for(Contacto x : contacto) {

				if(encontrado=x.nombre.equals(nombre))index=contacto.indexOf(x);

			}
			if(encontrado)contacto.get(index).delTelefono(telefono);

		}

		public String buscaTelefono(String telefono) {

			String salida="";
			for(Contacto x : contacto) {

				for(Telefono y : x.numeros) {

					if(y.numero.equals(telefono))salida+=x.nombre+"\r";

				}

			}
			return ((salida.equals(""))?"Nadie tiene este numero":"Personas con este telefono: \r"+salida);

		}	
		
		public String toString() {
			
			String salida="";
			for(Contacto x : contacto) {
				
				salida+=x+"\r";
				
			}
			return salida;
			
		}
		
	
}
