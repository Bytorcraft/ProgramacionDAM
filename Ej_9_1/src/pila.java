import java.util.*;
public class pila {
	Scanner teclado= new Scanner(System.in);
	
	int tama�o;
	
	int[] vector = new int[tama�o];
	
	public void crearVector() {
		
		do { // tama�o del vector
		System.out.println("Introduce el tama�o deseado del vector: ");
		tama�o=teclado.nextInt();
		}while(tama�o>= 100);
		
		System.out.println("El vector es: ");
		for(int i=0; i<vector.length;i++) { // recorre el vector y va asignando un num aleatorio 
			int num= (int)(Math.random()*1000)+1;
			vector[i]= num;		
			System.out.println(vector[i]);
		}
	}
	
	public void push() { // metodo para insertar
		int ultimo= vector.length-1;
		if (vector.length-1<= ultimo) {
			
		}
		
		
	}
	public void pop() { // metodo para sacar
		System.out.println("Todo el vector sacado quedaria: ");
		for(int i =vector.length; i<=0; i--) {
			System.out.println(vector[i]);
		}
	}
	public void size() { // metodo que te devuelve la cantidad de numeros apilados
		System.out.println("El tama�o de la pila es de: "+ vector.length);	
	}
	
}
