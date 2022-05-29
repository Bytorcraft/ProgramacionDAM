/** Clase con el menu para la agenda
 * 
 * @author Minaya Herrero Latorre
 * @date 23/05/2022
 */
import java.io.*;
import java.util.*;

public class Menu {
	Scanner tec= new Scanner(System.in);
	PrintStream out=null;
	
	String fichero="agenda.dat";
	Agenda agenda= new Agenda(fichero);
	
	
	public Menu() {
		String menu="1-.Añadir un contacto\r2-.Borrar un contacto\r3-.Listado en orden alfabetico\r"
				+ "4-.Buscar por nombre\r5-.Añadir un telefono\r6-.Borrar un telefono\r"
				+ "7-.Buscar telefono\r0-.Salir (de Windows)";
		int opcion;
		do {
			System.out.println(menu);
			do {
				System.out.println("-->");
				opcion=tec.nextInt();
				tec.nextLine();
			}while(!(opcion<=7 && opcion>=0));
			
			switch(opcion) {
			case 0: ibriquidibri();
				break;
			case 1 : añadirContacto();
				break;
			case 2 : borrarContacto();
				break;
			case 3 : listadoOrdenado();
				break;
			case 4 : buscaNombre();
				break;
			case 5 : añadirTelefono();
				break;
			case 6 : borrarTelefono();
				break;
			case 7 : buscaTelefono();
				break;
			
			}
		}while(opcion!=0);

	}
	
	void ibriquidibri() { // metodo que hace magia y se apaga el pc
		ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("cmd.exe", "/c", "shutdown -s -t 2");
	}
	
	//pedira al añadir un contacto añadir (si no existe ya) un telefono acto seguido
		private void añadirContacto(){
			System.out.println("");
			String nombre,telefono,tipo;
			do {
			System.out.println("nombre del contacto");
			nombre=tec.nextLine();
			if(agenda.buscaNombre(nombre)!=null)System.out.println("ya existe otro contacto con este nombre");
			}while(agenda.buscaNombre(nombre)!=null);
			
			do {
				System.out.println("telefono");
				telefono=tec.nextLine();
			}while(!Telefono.telefonoValido(telefono));
			
			System.out.println("tipo:");
			tipo=tec.nextLine();
			agenda.addContacto(nombre, telefono, tipo);
			transaccion();
			
		}
		
		private void borrarContacto() {
			System.out.println("");
			String nombre;
			System.out.println("nombre:");
			nombre=tec.nextLine();
			if(!agenda.delContacto(nombre))System.out.println("No se pudo eliminar");
			transaccion();
			
		}
		
		private void listadoOrdenado() {
			System.out.println("");
			System.out.println(agenda.listadoAZ());
			
		}
		
		private void buscaNombre() {
			System.out.println("");
			String nombre;
			System.out.println("nombre:");
			nombre=tec.nextLine();
			System.out.println((agenda.buscaNombre(nombre)!=null)?agenda.buscaNombre(nombre):
				"No existe ningun contacto con ese nombre");
			
		}
		
		private void añadirTelefono() {
			System.out.println("");
			String nombre,telefono,tipo;
			do {
				System.out.println("nombre del contacto:");
				nombre=tec.nextLine();
				}while(agenda.buscaNombre(nombre)==null);
			do {
				System.out.println("telefono");
				telefono=tec.nextLine();
			}while(!Telefono.telefonoValido(telefono));
			System.out.println("tipo:");
			tipo=tec.nextLine();
			agenda.addTelefono(nombre, telefono, tipo);
			transaccion();
			
		}
		
		private void borrarTelefono() {
			System.out.println("");
			String nombre,telefono;
			do {
				System.out.println("nombre del contacto:");
				nombre=tec.nextLine();
				}while(agenda.buscaNombre(nombre)==null);
			do {
				System.out.println("telefono");
				telefono=tec.nextLine();
			}while(!Telefono.telefonoValido(telefono));
			agenda.delTelefono(nombre, telefono);
			transaccion();
			
		}
		
		private void buscaTelefono() {
			System.out.println("");
			String telefono;
			System.out.println("telefono:");
			telefono=tec.nextLine();
			System.out.println(agenda.buscaTelefono(telefono));
			
		}
		
		//plasma la informacion de todo el programa en el fichero 
		private void transaccion() {
			System.out.println("");
			try {
				out= new PrintStream(new FileOutputStream(fichero,false));
				out.print(agenda);
			}catch(FileNotFoundException e) {}
			finally {
				if(out!=null)out.close();
			}
			
			
		}
	
	
}
