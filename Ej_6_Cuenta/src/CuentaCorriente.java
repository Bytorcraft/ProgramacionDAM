import java.util.Arrays;
import java.util.Scanner;

public class CuentaCorriente {
	Scanner teclado = new Scanner(System.in);

	private String titular;
	private float saldo;
	private String codigo;
	
	int[] vecSaldo=new int [100];
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getCodigo() {
		return codigo;
	}
	public void meterDatos() {
		System.out.println("Introduce el nombre del Titular: ");
		titular = teclado.nextLine();
		System.out.println("Introduce el saldo: ");
		saldo = teclado.nextFloat();
		System.out.println("Introduce tu codigo de seguridad, de 8 caracteres: ");
		codigo = teclado.next();
		
		while (codigo.length() > 8 || codigo.length() < 8) {
			System.out.println("Cagaste mi loco, solo 8 caracteres EXACTOS :C, vuelve a introducirlo: ");
			codigo=teclado.next();
			}
	}
	
	public void crear(){// crea un vector de 100 digitos entre el 1 y el 10000000
        for(int i=0;i<vecSaldo.length;i++){
            int num=(int)(Math.random()*1000000)+1;
            vecSaldo[i]=num;
            
        }
	}
	
	public void ordenar() {
		Arrays.sort(vecSaldo);//ordena el vector en orden ascendente
		
		System.out.println("El vector es: ");
		for(int i=0;i<vecSaldo.length;i++){
            System.out.print(vecSaldo[i]+" ");
        }
		System.out.println("");
		System.out.println(vecSaldo[99]);
	}
}
