import java.util.*;
public class Conjunto {
	 
	Scanner teclado=new Scanner(System.in);
	int[] vector=new int [100];
	int[] vector2=new int[100];
	
	public void crear(){// crea un vector de 100 digitos sin repetir entre el 1 y el 1000
        for(int i=0;i<vector.length;i++){
            boolean repetido = false;
            int ale=(int)(Math.random()*1000)+1;
            for (int j=0;j<i ;j++){
                if(vector[j]==ale){
                    repetido=true;
                }
            }
            if(!repetido){
                vector[i]=ale;
            }else{
                i--;
            }
        } 
    }
	public void crear2(){// crea un SEGUNDO vector de 100 digitos sin repetir entre el 1 y el 1000
        for(int i=0;i<vector2.length;i++){
            boolean repetido = false;
            int ale=(int)(Math.random()*1000)+1;
            for (int j=0;j<i ;j++){
                if(vector2[j]==ale){
                    repetido=true;
                }
            }
            if(!repetido){
                vector2[i]=ale;
            }else{
                i--;
            }
        } 
    }
	public void decirVector() {// te dice cual es el vector
		System.out.println("El vector es: ");
		for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
	}
	public void vaciar() {
		for (int x=0; x<vector.length; x++) {// al vector se le da el valor 0
			vector[x]=0;
			
			}
		System.out.println("Vaciado: ");
		for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
	}
	public void añadir() {// te deja añadir en la posicion que sea un nuevo numero
		int posicion, numero;
		System.out.println("Di en que posicion quieres cambiar el valor: ");
		posicion=teclado.nextInt();
		System.out.println("Di a que numero lo quieres cambiar: ");
		numero=teclado.nextInt();
		vector[posicion]=numero;	
	}
	public void eliminar() {
		int posicion;
		System.out.println("Di en que posicion quieres cambiar el valor: ");
		posicion=teclado.nextInt();
		vector[posicion]=0;		
	}
	
	public void copia() {
		System.out.println("El primer vector: ");
		for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
		System.out.println("");
		System.out.println("El segundo vector: ");
		for(int i=0;i<vector2.length;i++){
            System.out.print(vector2[i]+" ");
        }
		System.out.println("");
		System.out.println("Resultado del vector 2:");
		System.arraycopy(vector, 0, vector2, 0, vector.length);
		for ( int i = 0; i < vector2.length; i++ )
		System.out.print(vector2[i] + " ");
		
	}
	public void esMiembro() {
		int introducido;

		System.out.println("Pon el numero que quieras buscar en este conjunto: ");
		introducido=teclado.nextInt();
		Arrays.sort(vector);
		if(Arrays.binarySearch(vector, introducido)!=0 ) {
			System.out.println("El numero esta");
		}
	}
	
}


