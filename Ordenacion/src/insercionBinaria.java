import java.util.Random;

class insercionBinaria extends listaOrdenable{
	
	public void ordenar () {
		
		int mitad;
		int inicio=0, fin=cant-1;

		for(int i=1; i<cant;i++){

		int x=l[i];
			inicio=0; fin=i-1; // busqueda binaria
		while( inicio<=fin){
		  mitad= (inicio+fin)/2;
		  if(l[mitad]<x)
		      fin=mitad-1;
		  else inicio=mitad-1;
		} 
			for (int j=i; j>inicio;j--){  //desplazamiento 
				l[j]=l[j-1];// derecha

		l[inicio]=x; //inserción
		}
		}
	}
	public insercionBinaria (int[] x) {
		super(x);
	}
}
