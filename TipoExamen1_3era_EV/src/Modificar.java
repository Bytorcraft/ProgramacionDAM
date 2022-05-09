import java.io.*;
import java.util.*;

/** Inserta un usuario y una contraseña si no esta.
 * 
 * @author Minaya Herrero Latorre
 *
 */
public class Modificar {
		Scanner s=null;
		String fichero;
		boolean add=true; //para añadir
		
		public Modificar(String archivo) {
			fichero= archivo;
			
			
			try {
				s= new Scanner(new BufferedReader(new FileReader(fichero)));
			} catch (FileNotFoundException e) {
				add=false;
				e.printStackTrace();
			}
			
			
			
		}
		
	public void finalizar() { // cierra los scanners abiertos
			s.close();
	}
		
	public boolean comprobarUsuario(String nombre) {
		boolean encontrado=false;
		System.out.println("Compruebo nombre usuario en fichero");
		
		while(! encontrado && s.hasNextLine()) {
			String usuario= s.next();
			if(nombre.equals(usuario)) return true;
			
			s.nextLine();
			
					
		}
		return false;
	}
	
	public void añadirUsuario(String nombre, String passwd) {
		
		s.close();
		PrintStream ps = null;
		
		try {
			ps =new PrintStream(new FileOutputStream(fichero, true));
			ps.print(nombre + " "+ passwd);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			ps.close();
		}
		
		
		
	}

	
	
}
