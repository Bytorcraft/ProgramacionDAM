import java.util.*;
public class ejecutable {
 Scanner teclado= new Scanner(System.in);
		public static void main (String []Args) {
			Ej_5_trabajador nuevoTrabajador= new Ej_5_trabajador();
			
			System.out.println("Pon tu identificador (1-100): ");
			setIdentificador(teclado.nextInt());
			
			System.out.println("Indica el nombre del trabajador: ");
			setNombre(teclado.nextLine());
			
			System.out.println("Indica el estado civil S(soltero)/C(casado): ");
			setEstadoCivil(teclado.nextLine());
		
			System.out.println("Indica el turno D(diurno)/N(nocturno): ");
			setTurno(teclado.nextLine());
			
			System.out.println("Indique la titulacion que tienes 0 al 4: ");
			setTitulacion(teclado.nextInt());
			
			System.out.println("Indica los años en la empresa: ");
			setAñosEmpresa(teclado.nextInt());
			
			
		}
}
