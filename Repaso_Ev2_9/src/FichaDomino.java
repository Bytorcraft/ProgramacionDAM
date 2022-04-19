/**
 * Clase pa representar cada ficha del dominó
 * @author Minaya Herrero Latorre
 *
 */
public class FichaDomino {
	int[] ficha= new int[2];
	
	
	public FichaDomino( int lado1, int lado2) { // Contructor para dos numeros
			
		if (lado1 <1 || lado1 >6 || lado2 <1 || lado2 >6 ) {
			throw  new IllegalArgumentException();
		}
		ficha[0]=lado1;
		ficha[1]=lado2;	
	}
	 public FichaDomino(int lado1) {// Constructor para un numero y un lado en blanco
		 if (lado1 <1 || lado1 >6 ) {
				throw  new IllegalArgumentException();
			}
			ficha[0]=lado1;
			ficha[1]=0; // LADO EN BLANCO
	 }
	 public FichaDomino() { // Doble lado en blanco
		 ficha[0]=0;
		 ficha[1]=0;
	 }
	 
	 public String toString() {
		String v0 = ficha[0]==0?" ": (" "+ficha[0]); // Si alguno es 0, te devuelve blanco
		String v1 = ficha[1]==0?" ": (" "+ficha[1]);
		
		 return "["+ ficha[0]+ " |"+v1+ "]";
	 }

}
