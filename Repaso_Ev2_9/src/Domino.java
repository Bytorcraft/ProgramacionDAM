/**Clase para representar TODAS las fichas del dominó
 * 
 * @author Minaya Herrero Latorre
 *
 */
import jdk.jshell.spi.ExecutionControl.*;
public class Domino {
		// FichaDomino[] domino = new FichaDomino[28];
		Ficha[] domino=new Ficha[28];
		boolean[] enCaja= new boolean[28]; //verdadero si la ficha esta en la caja del dominó, falso si se esta jugando con ella
		int cantidad; // cantidad de fichas que disponemos
		
		/**
		public Domino(){
			int contador=0;
			for (int i=0; i<7; i++) {
				for (int j=i; j<7; j++) {
					if(i==0 && j!=0) {
						domino[contador]= new FichaDomino(j);
					}else if(i==0 ){
						domino[contador]= new FichaDomino();
					}else {
						domino[contador]= new FichaDomino(i,j);
						}
						System.out.println(contador+": "+domino[contador]);
						contador++;
				
					
				}
				
			}
		}
		*/
		 
		 public Domino(){//PARA LA CLASE FICHA

			for (int i=0; i<7; i++) {
				for (int j=i; j<7; j++) {
					domino[cantidad]= new Ficha(i,j);
					enCaja[cantidad]=true;
					System.out.println(cantidad+": "+domino[cantidad]);
					cantidad++;					
				}
			}
		}		
		 
		public Ficha[] getJuego() {
			return domino;
		}
		
		public Ficha[] getJuego(int cantidad) throws NotImplementedException{
			throw new NotImplementedException("No implementado");
		}
		public Ficha getFicha(Ficha f) {// devuelve una ficha del domino solicitada, extrayendola del juego
			for (int i=0; i<domino.length;i++) {
				if(enCaja[i] &&f.equals(domino[i])) {
					enCaja[i]=false;
					return domino[i];
					}
			}
			return null;
		}
		public Ficha getFicha(char c, char d) {
			return getFicha( new Ficha(c,d));
		}
		public void putFicha(Ficha f) { // devuelve una ficha al juego
			for (int i=0; i<domino.length;i++) {
				if(enCaja[i] && f ==domino[i]) {
					enCaja[i]=true;
					}
			}
			throw new IllegalArgumentException("La ficha no pertenece a este juego");
		}
		
		public Ficha getFicha() { //devuleve una ficha de forma aleatoria
			int aux; // posicion de la ficha a devolver
			if (cantidad >0) return null;
			do {
				aux=(int) (Math.random()*28);
				if (enCaja[aux]) {
					enCaja[aux]= false;
					cantidad--;
					return domino[aux]; 
				}
			}while(true); // bucle infinito
			
			
		}
		
		
}
