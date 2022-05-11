import java.io.*;
import java.util.*;
/**Valida si la contraseña de un usuario es correcta.
 * 
 * @author Minaya Herrero Latorre
 * @date 11/05/2022
 */
public class Validar {
	   void validar(File fAntiguo,String aCadena, String nombre)
	    {
	        // Declaro un nuevo buffer de lectura
	        BufferedReader br;
	        try
	        {
	            /*Valido si el fichero antiguo que pasamos como parametro existe, si es asi procedo a leer el
	            contenido que hay dentro de el
	             */
	            if(fAntiguo.exists())
	            {
	                br = new BufferedReader(new FileReader(fAntiguo));

	                String linea;

	                /* Mientras el contenido del archivo sea diferente de null procedo a comprar  la linea a modificar con
	                lo que hay dentro del archivo, si linea es igual a aCadena escribo el contenido de aCadena en mi nuevo
	                fichero(Auxiliar) de lo contrario escribo el mismo contenido que ya tenia el antiguo fichero en mi fichero auxiliar
	                 */
	                boolean esta=false;
	                while((linea=br.readLine()) != null)
	                {
	                	String todo= nombre +" "+aCadena;
	                	
	                	
	                    if(linea.equals(todo)){ // si lo intoducido, es igual, esta
	                        System.out.println("Los datos son correctos");
	                        esta=true;
	                    }
	                  
	                }
	                if (esta==false) { // sino, no están
	                	   System.out.println("Los datos introducidos, no se han encontrado.");
	                   }
	              // Cierro el buffer de lectura
	                br.close();
	            }
	            else
	            {
	                System.out.println("Fichero no Existe");
	            }

	        }catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
}
