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
		int dia,mes,año;
		void fecha() {
		Scanner teclado =new Scanner(System.in);
		boolean valido=true;{// verificacion
		while(valido==false) {
			dia=teclado.nextInt();
			mes= teclado.nextInt();
			año=teclado.nextInt();
			if (año >= 1582)
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
		public void setAño(int año) { // get del año
			this.año=año;}

		public void incrementaDias(int dia) {// incrementa los dias
			this.dia++;}
		public void incrementaMeses(int mes) {// incrementa los meses
			this.mes++;}
		public void incrementaAños(int año) { //incrementa los años
			this.año++;}	
		
		public void incrementaDias (int dia, int mes) { //sobrecarga de incrementaDias
			this.dia++;}
		public void incrementaDias (int dia, int mes, int año) { //sobrecarga de incrementaDias
			this.dia++;}
	
	}
	// el calendario gregoriano, no puede ser menor que el 15/10/1582
	public static void main(String[] args) {
		Fecha objeto = fecha();
	 System.out.println(objeto.dia + " "+ objeto.mes+ " " + objeto.año );
	}
}