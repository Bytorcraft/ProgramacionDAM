import java.util.Scanner;
/**
 * Programa que te muestra un calendario gregoriano.
 */
/**
 * @author Minaya Herrero
 * @date hoy
 */
public class Ej_5_fecha {
	
	class Fecha {
		int dia,mes,a�o;
		void fecha() {
		Scanner teclado =new Scanner(System.in);
		boolean valido=true;{// verificacion
		while(valido==false) {
			dia=teclado.nextInt();
			mes= teclado.nextInt();
			a�o=teclado.nextInt();
			if (a�o >= 1582)
				valido= true;
			else if (mes >= 10)
				valido=true;
			else if (dia >=15)
				valido=true;}
		}
		}
		
		public void setDia(int dia) { // get del dia
			this.dia=dia;}
		public void setMes(int mes) { // get del mes
			this.mes=mes;}
		public void setA�o(int a�o) { // get del a�o
			this.a�o=a�o;}

		public void incrementaDias(int dia) {// incrementa los dias
			this.dia++;}
		public void incrementaMeses(int mes) {// incrementa los meses
			this.mes++;}
		public void incrementaA�os(int a�o) { //incrementa los a�os
			this.a�o++;}	
		
		public void incrementaDias (int dia, int mes) { //sobrecarga de incrementaDias
			this.dia++;}
		public void incrementaDias (int dia, int mes, int a�o) { //sobrecarga de incrementaDias
			this.dia++;}
	
	}
	// el calendario gregoriano, no puede ser menor que el 15/10/1582
	public static void main(String[] args) {
		Fecha objeto = fecha();
	 System.out.println(objeto.dia + " "+ objeto.mes+ " " + objeto.a�o );
	}
}