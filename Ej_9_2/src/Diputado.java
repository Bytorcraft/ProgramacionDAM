
public class Diputado extends Partido implements Comparable {
	private int diputados;
	
	
	public Diputado (String nombre) {
		super(nombre);
		diputados=0;
	}
	
	public Diputado(String nombre, int votos, int diputados) {
		super(nombre, votos);
		this.diputados=diputados;
	}
	
	public Diputado (String nombre, int votos) {
		super(nombre, votos);
		this.diputados=1;
	}
	
	public int compareTo(Object o) {
		if (diputados !=((Diputado)o).diputados) {
			return -(diputados- ((Diputado)o).diputados);// se pone el - para  que lo saque de mayor a menor, sin el -, sacaria el menor
		} else return -(votos- ((Diputado)o).votos);
		
	}
	public String toString() {
		return nombre + "\t " + diputados + "\t" + votos;
	}

	
	public void addVotos(int x) { // le ponemos x por ponerle un nombre cualquiera
		if(x >0)
			this.diputados+=diputados;
		}
}
