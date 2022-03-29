import java.util.Random;

class burbuja extends listaOrdenable{
	
	public void ordenar () {

		final int TAM=1_000_000;
		final int MAX=TAM*10;
		int[] vector=new int[TAM]; 
		Random r= new Random();
		
		for( int m=0; m<TAM;m++) {
			vector [m]=r.nextInt(MAX)+1;
			
		}
		
		int mayor;
		int menor;
		int p=0; //primero
		int u=cant-1; //último

		do{

		      for ( int j=u; j>=p; j--) {// menor a izquierda
				if (l[j]>l[j+1]){
					menor=l[j+1];
					l[j+1]= l[j];
					l[j]=menor;
		                  //swap(j,j+1); //sería lo mismo que lo comentado arriba
		            }
		      }
		      p++;
			for ( int j=p; j<=u; j++ ) { //mayor a derecha
				if (l[j]>l[j+1]){
					mayor=l[j];
					l[j]= l[j+1];
					l[j+1]=mayor;
		               // swap(j,j+1); //sería lo mismo que lo comentado arriba
		            }
		      }
			u--;
		}while (p<u);

	}
	public burbuja (int[] x) {
		super(x);
	}
}