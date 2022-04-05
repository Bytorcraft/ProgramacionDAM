import java.util.Arrays;

/**
 * Almacena los datos de unas elecciones y determina el numero de escaños, o diputados, de los partidos.
 * @author Minaya Herrero Latorre
 * @date 04/04/2022
 *
 */
public class Votacion {
	private final int MAXSIZE=100 ;
	ListaPartido l= new ListaPartido();// lista de partidos con sus votos
	Partido[] e= null; // escaños
	int partidos=0; // cantidad de partidos que hay en la lista 
	int diputados, contDiputados;
	
	public Votacion(int diputados) {
		this.diputados=diputados;}
	
	public void insertarVotos(String partido, int votos) {// llama al otro metodo para que lo solucione
		e=null;
		l.añadirVotos(partido,votos);
		}
	
	public void calcular() { // determina el numero de diputados de cada partido con los datos actuales
		int votosTotal=0;
		ListaPartido aux= new ListaPartido(diputados*partidos); 
		
		for (int i=0; i<partidos; i++) {
			votosTotal+=l.getVotos(i);
		}
		/**
		 for (int i=0; i< diputados*partidos;i++){
		 int auxPartidos =i % partidos;
		 int division = i/ partidos+ 1;
		 
		 aux.insertarVotos(l.getNombre(auxPartido,l.getVotos(auxPartido)<porcentaje ? 0 : l.getVotos(auxPartido)/divisor))
		 
		 }
		 */
		int porcentaje=(int) ((votosTotal/100.0)*5); // se divide primero para que no haya excepcion
		for (int i=0; i<partidos; i++) {
			if(l.getVotos(i)>=porcentaje) {
				aux.insertarVotos(l.getNombre(i),votosTotal); // cociente de votos
			}else
			aux.insertarVotos(l.getNombre(i), votosTotal);
		}
		
		for (int i=partidos; i<diputados*partidos; i++) {	
			int auxPartido= i% partidos;
			int divisor= i/ partidos +1;
			// creas un vector auxiliar para guardar los partidos, para calcular el numero de votos
			aux.insertarVotos(aux.getNombre(auxPartido), aux.getVotos(auxPartido)/divisor);
		}
		aux.ordenar();
		e= new ListaPartido(l.getCantidad());
		contDiputados=0;
		for (int i=0; i < diputados;i++) {
			e.añadirVotos(aux.getNombre(i), 1);
		}
	}
	public String toString () { // nos imprime una cadena con el nombre y los votos
		if (e== null)
			return "No ha sido calculado";
		String salida="Partido\tVotos";
		for (int i=0; i<contDiputados; i++) {
			salida+="\n"+ e[i].getNombre() + "\t "+ e[i].getVotos();	
		}
		return salida;
	}
}
