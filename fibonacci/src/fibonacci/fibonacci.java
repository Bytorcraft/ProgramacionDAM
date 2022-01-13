package fibonacci;
import java.util.Scanner;
/**
 * Programa que lee una frase y te dice cuantas mayusculas, minusculas y numeros hay.
 */
/**
 * @author Minaya
 *
 */
public class fibonacci{
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int introducidos;
		int fibo1=0, fibo2=1,fibo3;
		System.out.println("Introduce cuantos numeros de fibonacci quieres ver, el primer 0 y 1, no cuentan: ");
		introducidos= teclado.nextInt();
		
		
		System.out.print(fibo1+ ", ");System.out.print(fibo2+ ", ");
		for (int x= introducidos; x>0; x--) {
				fibo3= fibo1+fibo2;
				System.out.print(fibo3+ ", ");
				fibo1=fibo2;
				fibo2= fibo3;
		}
	}
}