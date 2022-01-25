/**
 * Programa que te genera 2 vectores, de 10 digitos entre el 1 y el 5 y te dice cuantos se repiten del 1º en el 2º.
 * @author Minaya Herrero Latorre
 * @date 
 */
import java.util.Random;
import java.util.Scanner;
public class Ej_6_4 {
	
	public static void main (String[]Args) {
		Scanner teclado= new Scanner(System.in);
		
		int[] vector1= new int [10];
		int[] vector2= new int [10];
		int cont1_1=0, cont2_1=0, cont3_1=0, cont4_1=0, cont5_1=0;//contador de numeros del 1º vector
		int cont1_2=0, cont2_2=0, cont3_2=0, cont4_2=0, cont5_2=0;//contador de numeros del 2º vector
		
		Random aleatorio= new Random();
		
		for (int x=0; x<vector1.length; x++) {// crea 10 numeros aleatorios entre 1 y 5 y lo almacena en vector1
			int num =aleatorio.nextInt(5)+1;
			vector1[x]=num;
			switch (vector1[x] ){// mira que haya mas de 1 de cada numero
				case 1: cont1_1++;break;
				case 2: cont2_1++;break;
				case 3: cont3_1++;break;
				case 4: cont4_1++;break;
				case 5: cont5_1++;break;
			}
		}
		
		System.out.println("El primer vector: ");
		for(int y=0;y<vector1.length;y++) {// devuelve el valor del vector1
			System.out.print(vector1[y]+ "\t");
		}
		System.out.println("");
		
		for (int x=0; x<vector2.length; x++) {// crea 10 numeros aleatorios entre 1 y 5 y lo almacena en vector2
			int num =aleatorio.nextInt(5)+1;
			vector2[x]=num;
			switch (vector2[x] ){// 
				case 1: cont1_2++;break;
				case 2: cont2_2++;break;
				case 3: cont3_2++;break;
				case 4: cont4_2++;break;
				case 5: cont5_2++;break;
		}
		}
		System.out.println("El segundo: ");
		
		for(int y=0;y<vector2.length;y++) {// devuelve el valor del vector2
			System.out.print(vector2[y]+ "\t");
		}
		System.out.println("");
		
		if(cont1_1>=1) {System.out.println("Hay "+cont1_2+" unos."); }// si hay mas de X en el 1º vector, te da la cuenta de los que hay
		if(cont2_1>=1) {System.out.println("Hay "+cont2_2+" doses."); }
		if(cont3_1>=1) {System.out.println("Hay "+cont3_2+" treses."); }
		if(cont4_1>=1) {System.out.println("Hay "+cont4_2+" cuatros."); }
		if(cont5_1>=1) {System.out.println("Hay "+cont5_2+" cincos."); }
		
	}

}
