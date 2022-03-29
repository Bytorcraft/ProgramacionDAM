import java.util.Random;

public class ejecutable extends lista {

	public static void main(String[]Args) {
		
		final int TAM=100_000;
		final int MAX=TAM*10;
		int[] vector=new int[TAM]; 
		Random r= new Random();
		
		for( int m=0; m<TAM;m++) {
			vector [m]=r.nextInt(MAX)+1;
			
		}
		
		burbuja b=new burbuja(vector);
		System.out.println("Tiempo de la burbuja: " +b.tiempo());
		
		shell s= new shell(vector);
		System.out.println("Tiempo de Shell: " +s.tiempo());
		
		qSort sort= new qSort(vector);
		System.out.println("Tiempo de Quick Sort: " +sort.tiempo());
		
		insercionBinaria inser= new insercionBinaria(vector);
		System.out.println("Tiempo de Insercion Binaria: " +inser.tiempo());
		
	}
}
