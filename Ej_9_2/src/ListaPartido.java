import java.util.Arrays;

public class ListaPartido {

	private final int MAXSIZE=100 ;
	Partido[] l;
	int limite=0;
	
	public ListaPartido() {
		l= new Partido[MAXSIZE];// lista de partidos con sus votos
	}
	
	
	public ListaPartido(int size) {
		l= new Partido[size];// lista de partidos con sus votos
	}
	/**
	public void añadirVotos(String partido, int votos ) {
		for(int i =0; i <limite;i++) {
			if (l[i].getNombre().equals(partido)) {
				l[i].addVotos(votos);
				return;
			}
		}
			l[limite++]= new Partido(partido, votos);
			return;
		}
	 Otra forma de hacer lo de arriba:
	public void añadirVotos(Partido p ) {
		for(int i =0; i <limite;i++) {
			if (l[i].getNombre().equals(p.getNombre())) {
				l[i].addVotos(p.getVotos());
				return;
			}
		}
			l[limite++]= p;
			return;
		}
	 */
	public Partido buscar (String nombre) {
		for(int i =0; i <limite;i++) {
			if (l[i].getNombre().equals(nombre)) {
				
			}return l[i];
			
	}return null;
	}
	public Partido buscar (Partido p) {
		for(int i =0; i <limite;i++) {
			if (l[i].compareTo(p)==0) {
				
			}return l[i];
			
	}return null;
	}
	public void insertar(Partido p) {
		l[limite++]=p;
	}
	
	public void insertarVotos(String partido, int votos ) {
		l[limite++]= new Partido(partido, votos);
	}
	/**
	public int getVotos( int posicion) {
		return l[posicion].getVotos();
	}
	public String getNombre (int posicion) {
		return l[posicion].getNombre();
	}
*/
	public Partido getPartido (int i) {
		return l[i];
	}
	
	public void ordenar() {
		Arrays.sort(l);
	}
	public int getCantidad() {
		return limite;
	}
	
	
}
