import java.util.Arrays;

/**
 * Almacena los datos de unas elecciones y determina el numero de escaños, o diputados, de los partidos.
 * @author Minaya Herrero Latorre
 * @date 04/04/2022
 *
 */
public class Votacion {
	private final int MAXSIZE=100 ;
	Partido[] l= new Partido[MAXSIZE];// lista de partidos con sus votos
	Partido[] e= null; // escaños
	int partidos=0; // cantidad de partidos que hay en la lista 
	int diputados, contDiputados;
	
	public Votacion(int diputados) {
		this.diputados=diputados;}
	
	private int insertarVotos(Partido[] l,String partido, int votos, int limite) {
		for(int i =0; i <limite;i++) {
			if (l[i].getNombre().equals(partido)) {
				l[i].addVotos(votos);
				return limite;
			}
		}
			l[limite]= new Partido(partido, votos);
			return ++limite;
		}
	
	public void insertarVotos(String partido, int votos) {// llama al otro metodo para que lo solucione
		e=null;
		partidos =insertarVotos(l, partido, votos, partidos);
		}
	
	public void calcular() { // determina el numero de diputados de cada partido con los datos actuales
		int votosTotal=0;
		Partido[] aux= new Partido[diputados*partidos]; 
		
		for (int i=0; i<partidos; i++) {
			votosTotal+=l[i].getVotos();
		}
		int porcentaje=(int) ((votosTotal/100.0)*5); // se divide primero para que no haya excepcion
		for (int i=0; i<partidos; i++) {
			if(l[i].getVotos()>=porcentaje) {
				aux[i]=l[i]; // cociente de votos
			}else
			aux[i]= new Partido(l[i].getNombre(),0);
			
		}
		for (int i=partidos; i<diputados*partidos; i++) {
			
			int auxPartido= i% partidos;
			int divisor= i/ partidos +1;
			// creas un vector auxiliar para guardar los partidos, para calcular el numero de votos
			aux[i]= new Partido(aux[auxPartido].getNombre(),aux[auxPartido].getVotos()/divisor);
		}
		Arrays.sort(aux);
		e= new Partido[MAXSIZE];
		contDiputados=0;
		for (int i=0; i < diputados;i++) {
			contDiputados=insertarVotos(e, aux[i].getNombre(),1, contDiputados);
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
