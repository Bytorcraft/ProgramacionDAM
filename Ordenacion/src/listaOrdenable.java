import java.util.Random;

public abstract class listaOrdenable extends lista {
	public void ordenar() {
		
	};
	public long tiempo() {
		long iniT;
		iniT= System.currentTimeMillis();
		
		int pruebas=5;

		for( int i=0;i<pruebas;i++) {
			pruebas++;
		}
		long endT= System.currentTimeMillis();
		endT= endT-iniT;
		endT/= pruebas;
		System.out.println(endT);
		return endT;
	}
	int[] m;
	public listaOrdenable (int[]x) {
		l=x;
	}
}