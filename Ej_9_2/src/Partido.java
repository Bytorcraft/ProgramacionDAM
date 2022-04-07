
public class Partido implements Comparable {

	final protected String nombre; // nombre del partido
	protected int votos; // con protected no lo ven otras clases que no sean de su herencia
	
	
	public String getNombre() {
		return nombre;}
	
	public int getVotos() {
		return votos;}
	
	public void addVotos(int votos) {
		if(votos >0)
			this.votos+=votos;}
	
	
	public Partido (String nombre) { // se creara un partido solo con nombre
		this.nombre=nombre;
		votos=0;
	}
	public Partido(String nombre, int votos) { // se creara un partido con nombre y votos
		this.nombre=nombre;
		this.votos=votos;
	}

	
	public int compareTo(Object o) {
		return -(votos- ((Partido)o).votos);// se pone el - para  que lo saque de mayor a menor, sin el -, sacaria el menor
	}
	
	public String toString() {
		return nombre + "\t " + votos;
	}
}
