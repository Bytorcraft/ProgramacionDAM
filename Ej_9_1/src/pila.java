import java.util.*;
public abstract class Pila {
	Scanner teclado= new Scanner(System.in);
	
	public final int MAXSIZE= 100; // maximo de elementos que se pueden insertar en la pila
	
	public abstract void push(int x); // metodo para insertar

	public abstract int pop(); // metodo para sacar
		
	public abstract int size();// metodo que te devuelve la cantidad de numeros apilados
	
}
