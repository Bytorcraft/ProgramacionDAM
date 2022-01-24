import java.util.Scanner;
public class Hora {
	Scanner teclado= new Scanner(System.in);
	
	private int valorCero;
	private int valorDeterminado;
	private int sumaHoras;
	private int restaHoras;
	private int hora, minuto, segundo;
	
	public int getValorCero() {
		return valorCero;
	}
	public void setValorCero(int valorCero) {
		this.valorCero = valorCero;
	}
	
	public int getValorDeterminado() {
		return valorDeterminado;
	}
	public void setValorDeterminado(int valorDeterminado) {
		this.valorDeterminado = valorDeterminado;
	}
	public int getSumaHoras() {
		return sumaHoras;
	}
	public void setSumaHoras(int sumaHoras) {
		this.sumaHoras = sumaHoras;
	}
	public int getRestaHoras() {
		return restaHoras;
	}
	public void setRestaHoras(int restaHoras) {
		this.restaHoras = restaHoras;
	}
	
	public void valorCero() {// la hora es 0:0:0
		hora=0;
		minuto=0;
		segundo=0;
		System.out.println("Has puesto la hora a "+hora+":"+minuto+":"+segundo);
	}
	public void valorDeterminado() {//hora que no es 0:0:0
		System.out.println("Introduce la hora inicial (modo 24h): ");
		hora=teclado.nextInt();
		System.out.println("Introduce los minutos: ");
		minuto=teclado.nextInt();
		System.out.println("Introduce los segundos: ");
		segundo=teclado.nextInt();
		System.out.println("La hora introducida es: " +hora+":"+minuto+":"+segundo);
	}
	public void sumaHoras() {// suma de la hora dada anteriormente y otra nueva
		int horaOp, minOp, segOp;
		int segInicial,segOperar, resultado;
		
		System.out.println("Introduce la hora a la que sumar la anterior: ");
		horaOp=teclado.nextInt();
		System.out.println("Introduce los minutos: ");
		minOp=teclado.nextInt();
		System.out.println("Introduce los segundos: ");
		segOp=teclado.nextInt();
		
		segInicial= hora*3600+minuto*60+segundo;
		segOperar= horaOp*3600+minOp*60+segOp;
		
		resultado= segInicial+segOperar;
		hora=resultado/3600;
		minuto= (resultado-hora*3600)/60;
		segundo= resultado-(hora*3600+minuto*60);
		System.out.println("La suma de las horas es: " +hora+":"+minuto+":"+segundo);
	}
	public void restaHoras() {// resta de la hora dada anteriormente y otra nueva
		int horaOp, minOp, segOp;
		int segInicial,segOperar, resultado;
		
		System.out.println("Introduce la hora a la que restar la anterior: ");
		horaOp=teclado.nextInt();
		System.out.println("Introduce los minutos: ");
		minOp=teclado.nextInt();
		System.out.println("Introduce los segundos: ");
		segOp=teclado.nextInt();
		
		segInicial= hora*3600+minuto*60+segundo;
		segOperar= horaOp*3600+minOp*60+segOp;
		
		resultado= segInicial-segOperar;
		hora=resultado/3600;
		minuto= (resultado-hora*3600)/60;
		segundo= resultado-(hora*3600+minuto*60);
		System.out.println("La suma de las horas es: " +hora+":"+minuto+":"+segundo);
	}
}
