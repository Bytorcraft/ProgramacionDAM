/**Con este programa te premite jugar a piedra, papel, tijera, lagarto, Spock.
 * 
 * @author Minaya Herrero Latorre
 * @date 28/04/2022
 */
import java.util.*;
public class Ejecutable {
	
	public static void main (String[]Args) {
		Scanner teclado=new Scanner(System.in);
		int ale1; // numero aleatorio para sacar uno de los rpssl (maquina)
		int persona; // convierte el numero introducido a la cadena
		String jugador; // elemento introducido por el jugador
		String maquina; // lo que ha sacado la maquina
		boolean salir; // se preguntara en cada ronda si se quiere seguir jugando
		String comprobar1, comprobar3; // mira quien ha ganado

		//Almaceraremos lo siguiente: piedra-lagarto-Spock-tijera-papel en un arrayList
		ArrayList<String> rpssl = new ArrayList<String>();
		rpssl.add("Piedra"); rpssl.add("Lagarto"); rpssl.add("Spock"); rpssl.add("Tijeras"); rpssl.add("Papel");
		rpssl.add("Piedra"); rpssl.add("Lagarto"); rpssl.add("Spock");
		// Se repite para que si es el ultimo, que no de error 
		
		do {
			System.out.println("Introduce uno de los 5 rpssl(numero del 0 al 4: Piedra-Lagarto-Spock-Tijeras-Papel): ");
			persona= teclado.nextInt();
			jugador= rpssl.get(persona);
			
			comprobar1= rpssl.get(persona+1); // si es el siguiente, gana la persona
			comprobar3= rpssl.get(persona+3); // si es el 3, gana la persona
			
			ale1=(int)(Math.random()*4+0);
			maquina = rpssl.get(ale1);
			
			if(jugador == maquina) { // empatan
				System.out.println("Tanto el jugador ha elegido "+jugador+" y la maquina "+maquina);
				System.out.println("Por lo tanto nadie ha ganado. ");
			}else if(comprobar1==maquina || comprobar3==maquina) { // el jugador gana
				System.out.println("El jugador ha elegido " +jugador+ " y la maquina "+ maquina);
				System.out.println("Asique el jugador ha ganado");
			}else{ // el jugador pierde
				System.out.println("El jugador ha elegido " +jugador+ " y la maquina "+ maquina);
				System.out.println("Por tanto la maquina ha ganado.");
			};
			
			System.out.println("¿Desea seguir jugando? (true/false): ");
			salir=teclado.nextBoolean();
		}while(salir==true);
		
	}
	

}
