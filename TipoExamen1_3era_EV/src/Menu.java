import java.io.FileNotFoundException;
import java.util.*;

/** Menu principal del programa
 * 
 * @author Minaya Herrero Latorre
 * @date 09/05/2022
 *
 */
public class Menu {
	Scanner teclado = new Scanner(System.in);
	
	String fichero; //nombre del archivo de trabajo
	
	
	public Menu(String archivo) {
	fichero=archivo;	
	
	boolean fin;
	
	do {
		fin=trabajo();
	}while(!fin);
	
	}
	
	private void imprimir() { // te imprime el menu de seleccion
		System.out.println("Elija una opcion: ");
		System.out.println("1.- Insertar usuario y clave\n"
				+ "2.- Borrar usuarios\n"
				+ "3.- Modificar claves de un usuario\n"
				+ "4.- Validar si la clave de un usuario es correcta\n"
				+ "5.- Salir");
	}
	
	private boolean trabajo() { // metodo para hacer todo
		int opcion;
		do{
			imprimir();
			try {
				opcion=teclado.nextInt();
			}catch (Exception e) {
				System.out.println("Debe introducir un numero entre 1 y 5");
				opcion=0;
				teclado.next(); // si no ponemos esto, se crea un bucle infinito
			}
			
		}while(opcion <1 || opcion >5);
		if (opcion==5) return true;
		
		switch(opcion) {
		case 1: 
			insertar();
			
			break;
		case 2:
			System.out.println("Borrar");
			break;
		case 3:
			System.out.println("Modificar");
			break;
		case 4:
			System.out.println("Validar");
			break;		
		}
		return false;		
	}
	
	void insertar() {
		Insertar i = new Insertar(fichero);
		String nombre;
		
		System.out.println("Introduzca un nombre de usuario: ");
		
		try {
			nombre=teclado.next();
		}catch (Exception e) {
			System.out.println("Debe introducir un nombre válido");
			teclado.next();
			return;
		}
		
		String passwd;
		
		if (i.comprobarUsuario(nombre))
			System.out.println("Ese nombre ya existe. ");
		else {
			System.out.println("Introduzca contraseña: ");
			passwd=teclado.next();
			i.añadirUsuario(nombre, passwd);
			try {
				nombre=teclado.next();
			}catch (Exception e) {
				System.out.println("Debe introducir una contraseña válida");
				teclado.next();
				return;
			}
			
		}
		
	}
	
}
