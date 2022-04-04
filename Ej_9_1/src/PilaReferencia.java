
public class PilaReferencia extends Pila {

	class ElementoPila{
		int elto; //num elementos
		ElementoPila sig;
		
		ElementoPila(int x){
			elto=x;
			sig=null;
		}
	}

	
	ElementoPila cima=null; // vector que almacena la pila
	int tam=0; // elementos almacenados en la pila
	
	@Override
	public void push(int x) {
		if (tam == MAXSIZE ) {throw new IndexOutOfBoundsException("Pila lleva :C");}
		ElementoPila aux= new ElementoPila(x);
		aux.sig=cima;
		cima=aux;
		tam++;
	}

	@Override
	public int pop() {
		if (cima!= null) {
			ElementoPila aux= cima; // guardas el elemento
			cima= cima.sig; // apuntas al siguiente elemento
			tam--;
			return aux.elto; // devuelves el anterior valor
			
		}throw new IndexOutOfBoundsException("Pila vacia :C"); // devuelve el error si esta vacia
		
	}

	@Override
	public int size() {
		/**
		 ElementoPila aux= cima;
		int size=0;
		while (aux != null) {
			size++;
			aux= aux.sig;
		}
		return size;		 
		 */
		return tam;
		
	}

}
