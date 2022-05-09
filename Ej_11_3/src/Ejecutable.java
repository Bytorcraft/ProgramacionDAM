/**Programa que te junta 2 archivos de texto en uno
 * 
 */

import java.util.*;
import java.io.*;
public class Ejecutable {

	public static void main(String[] args) throws IOException {
		Scanner teclado=new Scanner(System.in);
		
		String textoSalida="C:\\Users\\alu\\Documents\\Programacion\\eclipse\\Ej_11_3\\src\\salida.txt"; // texto de salida
		BufferedWriter bw=new BufferedWriter(new FileWriter(textoSalida));
		
		System.out.println("Introduzca el nombre del primer archivo (ha de estar en src): ");
		String texto1= teclado.next();
		String archivo1="C:\\Users\\alu\\Documents\\Programacion\\eclipse\\Ej_11_3\\src\\"+texto1; // primer fichero
		File fich1=new File(archivo1);

		System.out.println("Introduzca el nombre del segundo archivo (ha de estar en src): ");
		String texto2= teclado.next();
		String archivo2="C:\\Users\\alu\\Documents\\Programacion\\eclipse\\Ej_11_3\\src\\"+texto2; // segundo fichero
		File fich2=new File(archivo2);
		
		while (teclado.hasNext()) {
			
			if(fich1.exists() && fich2.exists()) {
				System.out.println(archivo1);
				BufferedReader br = new BufferedReader(new FileReader(fich1)); // lee el primer archivo
				String linea1;
				
				System.out.println(archivo2);
				BufferedReader br2 = new BufferedReader(new FileReader(fich2)); // lee el segundo archivo
				String linea2;
				
				while((linea1=br.readLine())!=null || (linea2=br2.readLine())!=null) {
					bw.write(linea1);
					bw.newLine();
					//bw.write(linea2);
					bw.newLine();
				}
			br.close();
			}
		}
		bw.close();
	}


}
