/**Programa que te crea un vector de 100 elementos, permite obtener el titular y código de la cuenta con mayor saldo.
 * @author Minaya Herrero
 * @date 07/02/2022
 */
import java.util.*;
public class Ejecutable {

	public static void main(String[]Args) {
		
		CuentaCorriente nuevaCuenta=new CuentaCorriente();
		
		nuevaCuenta.crear();
		nuevaCuenta.crear2();
		nuevaCuenta.crear3();
		nuevaCuenta.ordenar();
		
		
	}
}
