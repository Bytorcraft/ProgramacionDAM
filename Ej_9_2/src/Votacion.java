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
	ListaPartido e= null; // escaños
	//int partidos=0; // cantidad de partidos que hay en la lista 
	int diputados;// contDiputados;
	
	public Votacion(int diputados) {
		this.diputados=diputados;}
	
	public void insertarVotos(String partido, int votos) {// llama al otro metodo para que lo solucione
		e=null;
		Partido p= l.buscar(partido);
		if (p != null) {
			p.addVotos(votos);
		}else l.insertar(new Partido(partido, votos));
		
		}
	
	public void calcular() { // determina el numero de diputados de cada partido con los datos actuales
		int votosTotal=0;
		int partidos= l.getCantidad();
		ListaPartido aux= new ListaPartido(diputados*partidos); 
		
		for (int i=0; i<partidos; i++) {
			votosTotal+=l.getPartido(i).getVotos();
		}
		
		int porcentaje=(int) ((votosTotal/100.0)*5);
		 for (int i=0; i< diputados*partidos; i++){
		 int auxPartidos= i% partidos;
		 int divisor= i/ partidos +1;
		 Partido p= l.getPartido(auxPartidos);
		 
		 aux.insertar(new p.getNombre(),p.getVotos() <porcentaje ? 0 : p.getVotos()/divisor);
		 }
		
		aux.ordenar();
		e= new ListaPartido(l.getCantidad());
	
		for (int i=0; i < diputados;i++) {
			Partido p= e.buscar(aux.getPartido(i));
			Partido miAux= aux.getPartido(i);
			if( p == null) {
				e.insertar(new Diputado(miAux.getNombre(),miAux.getVotos()));
			}else {
				p.addVotos(1);
			}
			
		}
	}
	public String toString () { // nos imprime una cadena con el nombre y los votos
		if (e== null)
			return "No ha sido calculado";
		String salida="Partido:\tEscaños:";
		for (int i=0; i<e.getCantidad(); i++) {
			Partido p = e.getPartido(i);
			salida+="\n"+ p;	
		}
		return salida;
	}
}
