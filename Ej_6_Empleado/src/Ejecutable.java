/**
 * Utilizar la clase Empleado del 5-11 para crear 50 nombres aleatorios y visualizar los datos.
 * @author alu
 *@date 01/02/2022
 */
import java.util.*;
public class Ejecutable {

	public static void main(String[]Args) {
		Scanner teclado=new Scanner(System.in);
		
		int numEmpleado=0;
		
		Empleado nuevoEmpleado= new Empleado();
		
		String[] nombre={"Pedro","Jose","Roser","Cañete","Ibon","Prado","Eusebia","Fariña","Noemi","Gómez",
						 "Pedro","Jose","Roser","Cañete","Ibon","Prado","Eusebia","Fariña","Noemi","Gómez",
						 "Pedro","Jose","Roser","Cañete","Ibon","Prado","Eusebia","Fariña","Noemi","Gómez",
						 "Pedro","Jose","Roser","Cañete","Ibon","Prado","Eusebia","Fariña","Noemi","Gómez"};
		
		for(int y=0;y<nombre.length;y++) {// devuelve el valor del nombre y el num de empleado
			numEmpleado++;
			System.out.println(nombre[y]+ " tiene el codigo "+ numEmpleado);
		}
	}
}
