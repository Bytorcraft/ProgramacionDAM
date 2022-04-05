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
	
	public void insertarVotos(String partido, int votos ) {
		l[limite++]= new Partido(partido, votos);
	}
	public int getVotos( int posicion) {
		return l[posicion].getVotos();
	}
	public String getNombre (int posicion) {
		return l[posicion].getNombre();
	}
	
	public void ordenar() {
		Arrays.sort(l);
	}
	public int getCantidad() {
		return limite;
	}
	
}
