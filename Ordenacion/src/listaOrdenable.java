
public abstract class listaOrdenable extends lista{
	public abstract void ordenar();
	public long tiempo() {
		long t;
		t= System.currentTimeMillis();
		t= System.currentTimeMillis()-t;
		
		int pruebas=0;
		long tiempo=0;
		for( int i=0;i<pruebas;i++) {
			
			t= System.currentTimeMillis();
			m=l.clone();
			tiempo+= System.currentTimeMillis()-t;
			pruebas++;
		}
		tiempo/= pruebas;
		return tiempo;
	}
	int[] m;
	public listaOrdenable (int[]x) {
		l=x;
	}
}