
import java.util.*;
import java.io.*;
/** Menu principal del programa
 * 
 * @author Minaya Herrero Latorre
 * @date 09/05/2022
 *
 */
public class Menu {
	Scanner teclado = new Scanner(System.in);
	
	String fichero; //nombre del archivo de trabajo
	File fich = new File("passwd.txt");
	
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
			borrar();
			break;
		case 3:
			modificar();
			break;
		case 4:
			validar();
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
	void borrar() {
		Borrar b = new Borrar();
		
		System.out.println("Indica el nombre del usuario: ");
		String nombre= teclado.next();
		
		System.out.println("Indica la clave para poder proceder a borrar: ");
		String aClave= teclado.next();
		
		b.borrar(fich, aClave, nombre);
	}
	
	void modificar() {
		
		Modificar m= new Modificar();
		
		System.out.println("Indica el nombre del usuario: ");
		String nombre= teclado.next();
		System.out.println("El usuario existe, se procede a cambiar la contraseña");
		
		System.out.println("Indica la clave a cambiar: ");
		String aClave= teclado.next();
		System.out.println("Indica la nueva clave: ");
		String nClave= teclado.next();
		
		m.modificar(fich, aClave, nClave, nombre);	
	}
	
	void validar() {
		Validar v= new Validar();
		
		System.out.println("Indica el nombre del usuario: ");
		String nombre= teclado.next();
		
		System.out.println("Indica la clave para poder validar los datos: ");
		String aClave= teclado.next();
		
		v.validar(fich, aClave, nombre);
	}
	
}
