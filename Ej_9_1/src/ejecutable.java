import java.util.Random;

/** @date 04/04/2022
 * @author Minaya Herrero Latorre
 *
 */
public class Ejecutable {

	public static void main(String[] args) {
		final int MAXOPERACIONES=100; // numero de elementos a usar
		Random r= new Random(123456);
		
		Pila p= new PilaReferencia(); //Podremos poner tanto Extendido() como PilaReferencia() // habra que ejecutar el que tenga el codigo
		
		
		for(int i=0; i<MAXOPERACIONES;i++) {
			int x=r.nextInt();
			boolean meter= r.nextBoolean();
			System.out.println("Operacion "+ i+ ": "+ (meter ? "meter": "sacar"));
			if (meter || i<20)
				p.push(x);
			else
				p.pop();
		}
		
		Pila aux= new Extendido();
		while(p.size()>0) { // cada elemento que saco de la pila p, se introduce en esta.
			aux.push(p.pop());
		}
		
		//for(; p.size()>0;) { // se podria haber hecho así pero queda "feo"
		while(p.size()>0){
			int x=aux.pop();
			p.push(x);
			System.out.println(x);
		}
		System.out.println(" ");
		
		
		
	}

}
