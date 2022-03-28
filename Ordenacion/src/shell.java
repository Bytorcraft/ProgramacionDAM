import java.util.Random;

class shell extends listaOrdenable{
	
	public void ordenar () {
		int[] h= {9,5,3,1};

		for (int k=0; k<h.length; k++){
			int m= h[k];
			for (int i=0; i<cant-m;i++){
			     int j=i;
			     int aux= l[j+m];
		           while (j>=0 && l[j]>aux){
				      l[j+m]=l[j];
		                  j-=m;		
		           }
		           l[j+m]=aux;
		           m++;
		     }
		}

		
	}
	public shell (int[] x) {
		super(x);
	}
}
