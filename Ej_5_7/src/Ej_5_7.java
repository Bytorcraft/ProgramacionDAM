import java.util.Scanner;
/**Programa que te dice el M.C.M de 2 numeros
 *  
 * @author Minaya Herrero
 * @date 10/01/2022
 */
public class Ej_5_7 {
	static Scanner teclado =new Scanner(System.in);
	
		public static void main (String [] Args) {
			
			int r;
			int opcion;
			
			System.out.println("Introduce el radio:");
			r=teclado.nextInt();
			System.out.println("Opcion 1: longitud del circulo.");
			System.out.println("Opcion 2: superficie del circulo.");
			System.out.println("Opcion 3: volumen de la esfera.");
			System.out.println("Selecciona la opcion que quieras: 1, 2 o 3.");
			opcion =teclado.nextInt();
			
			double resultado= radio(r, opcion);
			System.out.println("El resultado de la operacion es: "+ resultado);
	}
		public static double radio(int r, int opcion) {
			double operacion=0;
			
			switch (opcion) {
			case 1:
				operacion= 2*3.14159*r;break;
			case 2:
				operacion= 3.14159*r;break;
			case 3:
				operacion= (4/3)*3.14159*Math.pow(r, 3);break; // elavar al cubo
				default: System.out.println("Algo ha salido mal.");
			}
			
			
			return operacion;
		}
		
}
