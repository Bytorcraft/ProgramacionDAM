/**Progrmama que te da la suma de 6 numero o si introduces algun no valido, para y te da la suma
 * @author Minaya Herrero
 * @date 22/02/2022
 */
import java.util.*;
public class Numeros {

	public static void main(String[]Args) {
		Scanner teclado=new Scanner(System.in);
		
		//int suma=0;
		char num;String suma="";int total=0;
		
		for(int x=0;x<6;x++) {
			try {
			System.out.println("Introduce un numero para sumar: ");
			//suma+=teclado.nextInt();
			suma+= teclado.next();
			num=suma.charAt(x);
			total+=(int) num;
			}catch(InputMismatchException o) {// error al introducir una letra
				System.out.println("Has metido algo que no era un numero.");
				System.out.println("El programa ha terminado pero la suma es:"+ total);
				//System.out.println("El programa ha terminado pero la suma es:"+ suma);
			}
		}
		System.out.println("El programa ha finalizado correctamente, la suma es: "+total);
		//System.out.println("El programa ha finalizado correctamente, la suma es: "+suma);
		
	}
}
