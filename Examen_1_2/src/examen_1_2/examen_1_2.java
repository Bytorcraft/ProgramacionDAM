package examen_1_2;
import java.util.Scanner;
/**
 * Programa que te diga si has introducido bien el DNI
 */
/**
 * @author Minaya
 *
 */
public class examen_1_2 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		
		int numDni, modulo;
		char leDni, leCorrecta;
		String frase;
		boolean falso=false;
		
		do {
			
			System.out.println("Introduce la LETRA (en mayusculas por favor) del DNI: ");
			frase= teclado.nextLine();
			leDni= frase.charAt(0);
			System.out.println("Introduce el NUMERO de tu DNI: ");
			numDni= teclado.nextInt();

		if (numDni<100000000 && numDni>0) {
			modulo=numDni%23;
			
			switch (modulo) {
			case 0:
				leCorrecta='T';
				if (leDni==leCorrecta) {
					System.out.println("Tanto la letra como el numero son correctos.");
					falso=true;
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 1:
				leCorrecta='R';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
					}
				break;
			case 2:
				leCorrecta='W';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
					}
				break;
			case 3:
				leCorrecta='A';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
					}
				break;
			case 4:
				leCorrecta='G';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
					}
				break;
			case 5:
				leCorrecta='M';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
					}
				break;
			case 6:
				leCorrecta='Y';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
					}
				break;
			case 7:
				leCorrecta='F';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
					}
				break;
			case 8:
				leCorrecta='P';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
					}
				break;
			case 9:
				leCorrecta='D';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
					}
				break;
			case 10:
				leCorrecta='X';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 11:
				leCorrecta='B';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 12:
				leCorrecta='N';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 13:
				leCorrecta='J';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 14:
				leCorrecta='Z';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 15:
				leCorrecta='S';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 16:
				leCorrecta='Q';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 17:
				leCorrecta='V';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 18:
				leCorrecta='H';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 19:
				leCorrecta='L';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 20:
				leCorrecta='C';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 21:
				leCorrecta='K';
				if (leDni==leCorrecta) {
					falso=true;
					System.out.println("Tanto la letra como el numero son correctos.");
				}else {
					System.out.println("La letra no es correcta");
				}
				break;
			case 22:
				leCorrecta='E';
				falso=true;
				break;
			default: System.out.println("Algo ha salido mal.");
			}	
		}else {
			falso=true;
			System.out.println("El numero es muy grande, mayor de 100.000.000");
		}	
	}while (falso==true);
	}
}