/**Clase para administrar los contactos, tendran un nombre (no repetible), un tipo de movil y el numero de este.
 * @author Minaya Herrero Latorre
 * @date 27/05/2002
 */

import java.util.*;

public class Contacto implements Comparable<Contacto>{

	String nombre;
	ArrayList<Telefono> numeros= new ArrayList<Telefono>();
	
	public Contacto(String nombre, String telefono, String tipo) {
		this.nombre=nombre;
		addTelefono(telefono,tipo);
		
	}
	
	public void addTelefono(String entrada) { // constructores para un nuevo movil
		numeros.add(new Telefono(entrada));
	}
	public void addTelefono(String telefono,String tipo) {
		numeros.add(new Telefono(telefono,tipo));
	}
	
	//este metodo cogera como parametro un string en el formato fichero y lo dividira en los atributos de la clase Contacto, basicamente recoje los contactos de un fichero
		private void fromString(String entrada) { // ejemplo: Juan movil_12312; Pepe trabajo_43123123;

			nombre=entrada.substring(0,entrada.indexOf(";"));
			entrada=entrada.substring(entrada.indexOf(";")+1,entrada.length()-1);
			
			while(entrada.indexOf(";")<=entrada.lastIndexOf(";") && entrada.indexOf(";")>=0) {
				addTelefono(entrada.substring(0,entrada.indexOf(";")+1));
				entrada=entrada.substring(entrada.indexOf("; ")+1,entrada.length()-1);
			}

		}
		//constructor para cuando se obtiene del fichero
		public Contacto(String entrada) {

			fromString(entrada);

		}
	
		public void delTelefono(String telefono) {

			/*aqui capturo una excepcion que se genera al modificar un elemento de una lista ,
				durante la iteracion ya que no nos interesa seguir iterando 
				una vez se halla encontrado el telefono buscado por lo que no importa el manejarla o no*/
			try {
				for(Telefono x : numeros) {

					if(x.numero.equals(telefono))numeros.remove(x);

				}

			}catch(ConcurrentModificationException e) {}
		}

		//el formato sera: nombre; num1; num2; ...; numN;
		public String toString() {

			String salida=nombre+"; ";
			for(Telefono x : numeros) {
				salida+=x+"; ";
			}
			if(numeros.isEmpty())salida+="sin telefonos";
			return salida;

		}
	
	
	
	public int compareTo(Contacto o) {
		
		return 0;
	}
	
}
