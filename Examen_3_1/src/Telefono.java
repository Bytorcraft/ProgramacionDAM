/**
 * Clase con la que efectuar las operaciones relacionadas con el Telefono
 * @author Minaya Herrero
 * @date 26/05/2022
 */

public class Telefono {
	String numero, tipo;
	
	
	public Telefono( String numero, String tipo) {
		this.numero=numero;
		this.tipo=tipo;		
		
	}
	
	// este metodo cogera como parametro un string en formato fichero y lo dividira
	// en los atributos de la clase Telefono
	public void fromString(String entrada) {

		tipo = entrada.substring(1, entrada.indexOf("_")); // ira leyendo hasta encontrar un "_", eso sera el "tipo"
		numero = entrada.substring(entrada.indexOf("_") + 1, entrada.length() - 1); // lo de despues de "_", sera el numero

	}	
		
	public Telefono(String entrada) {
		fromString(entrada);
	}
	
	public String toString() { // asi es como queremos que se nos guarde
		return tipo+"_"+numero;
	}

	//determina si un numero de telefono cumple con las normas expuestas en el examen true si es valido
		public static boolean telefonoValido(String numero) {
			
			for(int i = 0 ; i < numero.length() ; ++i) {
				
				if((numero.charAt(i)<'0' || numero.charAt(i)>'9') && 
						numero.charAt(i)!='+' && numero.charAt(i)!=' ')return false;
				
			}
			return true;
			
		}
}
