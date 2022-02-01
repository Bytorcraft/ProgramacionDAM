import java.util.Scanner;
/**Crear una clase Disco para guardar información sobre los discos de música que
 * tenemos.
 * La información asociada a cada uno de los discos es:
 * Titulo, no de canciones, precio y fecha de compra.
 *  
 * @author Minaya Herrero
 * @date 27/01/2022
 */
public class Coleccion {	public static void main(String[]Args) {
		Scanner teclado=new Scanner(System.in);
	
		int opcion, numCanciones,indice=0, precio;
		boolean sigue=true;
		String titulo, fechaCompra;
		
		Disco nuevoDisco= new Disco();
		Disco[] vector= new Disco[100];
		for(int x=0;x<vector.length;x++) {
			vector[x]=new Disco();
		}
		
		do {
			System.out.println("Pulsa 1 si quiere meter un nuevo disco, sino, pulse cualquier otro numero.");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1 :
				nuevoDisco.entradaDatos();
				
				titulo=nuevoDisco.getTitulo();
				numCanciones=nuevoDisco.getNumCanciones();
				precio=nuevoDisco.getPrecio();
				fechaCompra=nuevoDisco.getFechCompra();
				System.out.println(titulo+" tiene " +numCanciones+" canciones, cuesta "+precio+"€ y fue comprado el "+fechaCompra);
				indice++;
				System.out.println("Disco numero: "+indice);
				break;
			default:sigue=false;
			}
			
		
		} while(sigue==true);

	}
}


