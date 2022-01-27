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
	
		int opcion, indice=0;
		boolean sigue=true;
		
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
				
				vector[indice].getTitulo();
				vector[indice].getNumCanciones();
				vector[indice].getPrecio();
				vector[indice].getFechCompra();
				indice++;
				System.out.println(vector[indice]);
				break;
			default:sigue=false;
			}
			
		
		} while(sigue==true);

	}
}


