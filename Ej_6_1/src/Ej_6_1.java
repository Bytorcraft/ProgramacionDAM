/**
 * Programa que te genera 20 num, te calcula la media y te dice si el numero es mayor, menor o igual.
 * @author Minaya Herrero Latorre
 * @date 
 */
import java.util.*;
public class Ej_6_1 {
	
	public static void main (String[]Args) {
		Scanner teclado= new Scanner(System.in);
		
		int[] random= new int[20];
		int suma=0, media;
		int mayores, menores, iguales;
		
		
		Random aleatorio= new Random();
		
		for (int x=0; x<random.length; x++) {// crea 20 numeros aleatorios entre 0 y 100 y lo almacena
			int num =aleatorio.nextInt(101);
			suma+=num;
			random[x]=num;
		}
		
		for(int y=0;y<random.length;y++) {// devuelve el valor del numero aleatorio
			System.out.print(random[y]+ "\t");
		}
		media=suma/20;
		System.out.println("");
		System.out.println("La media es: "+ media);
		
		for (int x=0; x<random.length; x++) {// te dice si es mayor, menor o igual a la media
			if(random[x]>=media) {
				System.out.println(random[x]+" es mayor que la media");
			}else if(random[x]==(int) media) {
				System.out.println(random[x]+ " es estrictamente igual a la media");
			}else if(random[x]<=media) {
				System.out.println(random[x]+ " es menor a la media");
			}
		}
	}
}
