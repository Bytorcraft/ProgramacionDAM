package blackjack;
import java.util.Scanner;
/**
 * Programa que juega al blackjack, si te pasas pierdes.
 */
/**
 * @author Minaya
 *
 */
public class blackjack{
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		
		int saldo;
		int banca=0, totalbanca=0;
		int usuario=0, totalusuario=0;
		int retirada;
		
		System.out.println("Introduce el saldo: ");
		saldo= teclado.nextInt();
		
		if(saldo>0) {
			if (totalusuario<=21 || totalbanca<=21) {
				//usuario1
				usuario=  (int) (Math.random()*11+1);
				totalusuario=usuario;
				//Haremos que se realize una jugada el usuario, y otra la banca.
				//banca1
				banca=(int) (Math.random()*11+1);
				totalbanca=banca;
				//usuario2
				usuario=  (int) (Math.random()*11+1);
				totalusuario=usuario+totalusuario;
				System.out.println("Has obtenido un: "+ totalusuario);
				//banca2
				banca=  (int) (Math.random()*11+1);
				totalbanca=banca+totalbanca;
				System.out.println("La banca ha obtenido un: "+ totalbanca);
				
				//Veamos si el usuario se quiere retirar ya
				System.out.println("¿Quieres retirarte ya? si= 1, no=0");
				retirada= teclado.nextInt();
				if(retirada == 1) {
					System.out.println("Te has retirado con "+ totalusuario+ " puntos.");
					//banca3
					banca=  (int) (Math.random()*11+1);
					totalbanca=banca+totalbanca;
					System.out.println("La banca ha obtenido un: "+ totalbanca);
					if(totalusuario<totalbanca) {
						System.out.println("La banca ha ganado.");
					}else
						System.out.println("Has ganado");
				}else {
					System.out.println("Seguimos jugando.");
					//usuario3
					usuario=  (int) (Math.random()*11+1);
					totalusuario=usuario+totalusuario;
					System.out.println("Has obtenido un: "+ totalusuario);
					//banca4
					banca=  (int) (Math.random()*11+1);
					totalbanca=banca+totalbanca;
					System.out.println("La banca ha obtenido un: "+ totalbanca);
					if(totalusuario<totalbanca) {
						System.out.println("La banca ha ganado.");
					}else if(totalusuario>totalbanca){
						System.out.println("Has ganado");}
					else if (totalusuario==totalbanca) {
						System.out.println("Empate, no pagas saldo.");
						saldo++;
					}
					saldo--;
				}
			}
			System.out.println("Tienes "+ saldo+ " de saldo.");
		}
		
		
	}
}