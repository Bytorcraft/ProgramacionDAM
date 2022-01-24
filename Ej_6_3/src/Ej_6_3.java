import java.util.Random;
import java.util.Scanner;
public class Ej_6_3 {
	
	public static void main (String[]Args) {
		Scanner teclado= new Scanner(System.in);
	
			int[] vector1= new int [10];			
			Random aleatorio= new Random();
			int mayor=vector1[0], menor=vector1[0];
			
			for (int x=0; x<vector1.length; x++) {// crea 10 numeros aleatorios entre 0 y 100 y lo almacena en vector1
				int num =aleatorio.nextInt(101);
				vector1[x]=num;
			}
			System.out.println("El vector con los numeros: ");
			for(int y=0;y<vector1.length;y++) {// devuelve el valor del vector1
				System.out.print(vector1[y]+ "\t");
			}
			System.out.println("");
			
			for(int y=0;y<vector1.length;y++) {// devuelve el mayor de los numeros
				vector1[y]= mayor;
				if(vector1[y]>mayor) {
					mayor=vector1[y];
				}
			}
			System.out.println("El mayor es: "+mayor);
			
			System.out.println("");
			for(int y=0;y<vector1.length;y++) {// devuelve el menor de los numeros
				vector1[y]= menor;
				
				if(vector1[y]<menor) {
					menor=vector1[y];
				}
			}
			System.out.println("El menor es: "+menor);
	}

}
