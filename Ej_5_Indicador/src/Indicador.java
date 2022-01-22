import java.util.Scanner;
public class Indicador {
	 Scanner teclado= new Scanner(System.in);
	 
	 private float valorInicial;
	 private float nuevoValor;
	 
	public float getValorInical() {
		return valorInicial;
	}
	public void setValorInical(float valorInical) {
		this.valorInicial = valorInical;
	}
	
	public float getNuevoValor() {
		return nuevoValor;
	}
	public void setNuevoValor(float nuevoValor) {
		this.nuevoValor = nuevoValor;
	}

	public void meterDatos() {// mete el dato que deseas
		System.out.println("Introduce el valor inicial: ");
		valorInicial=teclado.nextFloat();
	}
	
	public void modificarDatos() {// se usará junto a los 2 metodos siguientes
		System.out.println("El valor introducido es: " + valorInicial);
		System.out.println("OPCIONES:");
	}
	
	public void restaDatos() {// le restará un valor, al valor inicial
		System.out.println("Introduce un valor y se le restara a "+valorInicial+ " : ");
		nuevoValor=teclado.nextFloat();
		valorInicial= valorInicial-nuevoValor;
		System.out.println("El nuevo valor es: " + valorInicial);
	}
	public void sumaDatos() {// suma al valor, al valor inicial
		System.out.println("Introduce un valor y se le sumara a "+valorInicial+" : ");
		nuevoValor=teclado.nextFloat();
		valorInicial= valorInicial+nuevoValor;
		System.out.println("El nuevo valor es: " + valorInicial);	
	}

}
