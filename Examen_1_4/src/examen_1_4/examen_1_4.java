package examen_1_4;
import java.util.Scanner;
/**
 * Programa que te diga si el correo introducido es correcto.
 */
/**
 * @author Minaya
 *
 */
public class examen_1_4 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		
		String pLoc, pDom;
		char lLoc, lDom;

		
		System.out.println("Introduce la parte local del correo: ");
		pLoc= teclado.nextLine();
		System.out.println("Introduce la parte del dominio del correo: ");
		pDom= teclado.nextLine();
		
		//Haremos que realize una criba de longitud
		if (pLoc.length()<64 && pDom.length()<255 && pLoc.length()+pDom.length()<254) 
		{
			//Si empieza o termina con "." no es v�lido
			if (pLoc.startsWith(".") && pLoc.endsWith(".") && pDom.startsWith(".") && pDom.endsWith("."))
			{
				System.out.println("No es v�lido, empieza o termina con un \".\" ");
			}
			 else {
				for(int x=0; x<pLoc.length(); x++) {
					lLoc= pLoc.charAt(x);
					
					//Si es diferente de �, haga lo siguiente
					if(lLoc !='�' && lLoc!='�' ) {
						
					//Solo puede contener esos caracteres
					if(lLoc>'A' && lLoc<'Z' && lLoc>'0' && lLoc<'9' &&lLoc>'a' && lLoc<'z' && lLoc=='-' && lLoc=='_' && lLoc=='.' ) {
						System.out.println("El caracter "+ lLoc + " no es v�lido");
					}else {
						System.out.println("El caracter "+ lLoc + " es valido");
					}
					}else {
					System.out.println("Contiene � en la parte local, no es valido");
					}
			}
				for(int y=0;y<pDom.length();y++) {
					lDom= pDom.charAt(y);
					//Haremos las mismas cribas que antes,a excepcion del guion, sustitudio por el punto
					if (lDom!='�' && lDom!='�') {
						if(lDom>'A' && lDom<'Z' && lDom>'0' && lDom<'9' &&lDom>'a' && lDom<'z' && lDom=='-' && lDom=='.' ) {
							System.out.println("El caracter "+ lDom + " no es v�lido");
						}else {
							System.out.println("El caracter "+ lDom + "es v�lido");
						}		
				}else {
					System.out.println("Contiene � en la parte de dominio, no es valido");
				}
			}
		}
	}
	}
}
		
	
	
