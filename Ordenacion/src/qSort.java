import java.util.*;

class qSort extends listaOrdenable{
	
	public void ordenar () {
		int k=0;
	      int ini=0;
	      int fin= cant-1;	

		for ( int i= ini; i<=fin; i++){ 
			if ( l[k] > l[i]){
	                 int j=i-1; int aux= l[i];
	                  while ( j>=ini && l[j]>aux){
	                         l[j+1]=l[j];
	                         j--;	
	                  }
	            l[k]=aux;
	            k=i;
	            }
		}

	}
	public qSort (int[] x) {
		super(x);
	}
}