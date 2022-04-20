/**Una ficha de dominó, representada oon un numero del 1 al 6 o el blanco.
 * Vamos a representar dichos valores con los caracteres ' ' (blanco) y '1' al '6'.
 * @author Minaya Herrero Latorre
 * @date 20/04/2022
 */
public class Ficha {
	 protected char c1, c2;
	 private final String VALIDOS= " 123456";
	 
	 
	 private boolean valido (char x) { //comprueba que el caractaer es valido para la ficha
		 if (x>='1' && x<='6') {
			 return true;
		 }else {
			 return x== ' ';
		 }
	 }
	 
	 public Ficha(char c, char d) {// crea una ficha del 1 al 6 y el blanco
		 if (! (valido(c)&& valido(d))) {
			 throw new  IllegalArgumentException("Caracter no válido");
		 }
		 c1=c; c2=d;
	 }
	 
	 public Ficha (int x, int y) {// crea una ficha del 0 al 6; el 0 es el blanco
		 this (x== 0 ? ' ': (char)(x+'0'),
			   y== 0 ? ' ': (char)(y+'0') );
	 }
	 
	 public boolean equals(Ficha f) { // te devuelve true si 2 fichas son iguales
		 return (c1== f.c1 && c2==f.c2 || c2==f.c1 && c1==f.c2);
	 }
 
	 public String toString() {

			 return "["+ c1+ "|"+c2+ "]";
		 }

}
