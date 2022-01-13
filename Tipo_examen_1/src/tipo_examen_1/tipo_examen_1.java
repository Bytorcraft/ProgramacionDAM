package tipo_examen_1;
import java.util.Scanner;
/**
 * Programa que te dice en que dia estamos, cuantos dias tiene el mes y te pone un calendario de este.
 */
/**
 * @author Minaya
 *
 */
public class tipo_examen_1{
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		int dia=1, mes, año, diames=0;
		int semana;
		char diaS;
		int empieza=0;
		//hacemos que introduzca el dia, mes y año
		System.out.println("Introducle el dia: ");
			dia= teclado.nextInt();
		System.out.println("Introducle el mes: ");
			mes= teclado.nextInt();
		System.out.println("Introducle el año: ");
			año= teclado.nextInt();	
		
		if (mes<=2) {
			mes=mes+2;
			año=año-1;			
		}
		semana= ((dia+2*mes+3*(mes+1)/5+año+año/4-año/100+año/400+2)%7);
		switch(semana) {
		case 0:
			diaS= 'S';
			break;
		case 1:
			diaS= 'D';
			break;
		case 2:
			diaS= 'L';
			break;
		case 3:
			diaS= 'M';
			break;
		case 4:
			diaS= 'X';
			break;
		case 5:
			diaS= 'J';
			break;
		default: diaS='V';
		}
		
		System.out.println("Hoy estamos a: "+ diaS);
		switch(mes) {
			case 4,6,9,11:
				diames=30;break;
			case 1,3,5,7,8,10,12:
				diames=31;break;
			case 2:
				if (año%4 == 0) {
					diames=28;
				}else {diames=29;
				}
		}
		System.out.println("Dias que tiene el mes: " +diames);
		System.out.println("Calendario:");
		System.out.println(" ");
		dia=1;
		for(int contador=dia;contador<=diames;contador++) {
			System.out.print(dia);

			++dia;
			for(int linea=7;linea>0; linea--);{	
			System.out.print(diaS+ "**  ");
			semana= ((dia+2*mes+3*(mes+1)/5+año+año/4-año/100+año/400+2)%7);
				switch(semana) {
				case 0:
					diaS= 'S';
					break;
				case 1:
					diaS= 'D';
					break;
				case 2:
					diaS= 'L';
					break;
					
				case 3:
					diaS= 'M';
					break;
				case 4:
					diaS= 'X';
					break;
				case 5:
					diaS= 'J';
					break;
				default: diaS='V';
			}
			
			empieza++;
			if(empieza%7 ==0) {
				System.out.println("");
			}
		}
		}
	}
}