/**Programa que representa una pila, con las operaciones de push (añadir ultimo ), pop (quitar ultimo) y size (conocer tamaño),
 * @author Minaya Herrero
 * @date 31/03/2022
 * 
 */
import java.util.*;
public class Extendido extends Pila{

	private int[] pila= new int[MAXSIZE]; // vector que almacena la pila
	private int cima=0; // ultima posicion usada en la pila: elemantos en la pila
	
	
	@Override
	public void push(int x) { // si la pila no esta llena
		if (cima< MAXSIZE) {
			pila[cima++]= x;
		}else throw new IndexOutOfBoundsException("Pila lleva :C"); // devuelve el error si esta llena
	}

	@Override
	public int pop() { // si la pila no esta vacia
		if (cima>0) {
			return pila[--cima];
		}throw new IndexOutOfBoundsException("Pila vacia :C"); // devuelve el error si esta vacia
	}

	@Override
	public int size() {
	return cima; // devuelve la cima 
	}

}
