/**
 * Programa que te genera 10 numeros y te dice cual es el mayor y el menor.
 * @author Minaya Herrero Latorre
 * @date 
 */
import java.util.Random;
import java.util.Scanner;
public class Ej_6_3 {
	
	public static void main (String[]Args) {
		Scanner teclado= new Scanner(System.in);
	
			int[] vector1= new int [10];			
			Random aleatorio= new Random();
			int mayor=0, menor=100;
			int posiMayor=0, posiMenor=0;
			
			for (int x=0; x<vector1.length; x++) {// crea 10 numeros aleatorios entre 0 y 100 y lo almacena en vector1
				int num =aleatorio.nextInt(101);
				vector1[x]=num;
			}
			System.out.println("Los numeros del vector: ");
			for(int y=0;y<vector1.length;y++) {// devuelve el valor del vector1
				System.out.print(vector1[y]+ "\t");
			}
			System.out.println("");
			
			for(int y=0;y<vector1.length;y++) {// devuelve el mayor de los numeros
				if(vector1[y]>mayor) {
					mayor=vector1[y];
					posiMayor=y+1;
				}
			}System.out.println("El mayor es: "+mayor+" y su posicion es: "+ posiMayor);
			System.out.println("");
		
			for(int y=0;y<vector1.length;y++) {// devuelve el menor de los numeros
				if(vector1[y]<menor) {
					menor=vector1[y];
					posiMenor=y+1;
				}
			}System.out.println("El menor es: "+menor+" y su posicion es: "+ posiMenor);
			
	}

}
