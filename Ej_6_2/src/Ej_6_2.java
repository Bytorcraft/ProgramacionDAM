/**
 * Programa que te suma 2 vectores de 10 num y te los almacena y muestra en un tercero.
 * @author Minaya Herrero Latorre
 * @date 
 */
import java.util.Random;
import java.util.Scanner;
public class Ej_6_2 {
	
	public static void main (String[]Args) {
		Scanner teclado= new Scanner(System.in);
	
			int[] vector1= new int [10];
			int[] vector2= new int [10];
			int[] vector3= new int [10];
			
			Random aleatorio= new Random();
			
			for (int x=0; x<vector1.length; x++) {// crea 10 numeros aleatorios entre 0 y 100 y lo almacena en vector1
				int num =aleatorio.nextInt(101);
				vector1[x]=num;
			}
			System.out.println("La suma de: ");
			
			for(int y=0;y<vector1.length;y++) {// devuelve el valor del vector1
				System.out.print(vector1[y]+ "\t");
			}
			for (int x=0; x<vector2.length; x++) {// crea 10 numeros aleatorios entre 0 y 100 y lo almacena en vector2
				int num =aleatorio.nextInt(101);
				vector2[x]=num;
			}
			System.out.println("");
			System.out.println("Y: ");
			for(int y=0;y<vector2.length;y++) {// devuelve el valor del vector2
				System.out.print(vector2[y]+ "\t");
			}
			
			for (int x=0; x<vector1.length; x++) {// suma de 2 vectores 	
			vector3[x]=vector1[x]+vector2[x];	
			}
			System.out.println("");
			System.out.println("Da: ");
			for(int y=0;y<vector3.length;y++) {// devuelve el valor del vector3
				System.out.print(vector3[y]+ "\t");
			}
	}
}
