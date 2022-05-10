import java.io.*;
import java.util.*;

/** Inserta un usuario y una contraseña si no esta.
 * 
 * @author Minaya Herrero Latorre
 *
 */
public class Insertar {
		Scanner s;
		String fichero;
		boolean add=true; //para añadir
		
		public Insertar(String archivo) {
			fichero= archivo;
			
			try {
				s= new Scanner(new BufferedReader(new FileReader(fichero)));
			} catch (FileNotFoundException e1) { 
				add=false;
			}
		}
		
	public void finalizar() { // cierra los scanners abiertos
			if(s != null) s.close();
			s=null;
	}
		
	public boolean comprobarUsuario(String nombre) {
		if (s== null) return false;
		boolean encontrado=false;
		
		while(! encontrado && s.hasNext()) {
			String usuario= s.next();
			if(nombre.equals(usuario)) 
			return true;
			
			s.nextLine();		
		}
		return false;
	}
	
	public void añadirUsuario(String nombre, String passwd) {
		if (s != null)
		s.close();
		s=null;
		PrintStream ps = null;
		
		try {
			ps =new PrintStream(new FileOutputStream(fichero, add));
			ps.println(nombre + " "+ passwd);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			ps.close();
		}
		
		
		
	}

	
	
}
