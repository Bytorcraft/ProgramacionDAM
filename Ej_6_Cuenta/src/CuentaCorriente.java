import java.util.Arrays;
import java.util.Scanner;

public class CuentaCorriente {
	Scanner teclado = new Scanner(System.in);

	private String titular;
	private float saldo;
	private String codigo;
	private int numVector, posiMayor=0;
	
	int[] vecSaldo=new int [100];
	int[] vecTitular=new int[100];
	int[] vecCodigo=new int[100];

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
		codigo = teclado.nextLine();
			}
	
	public void crear(){// crea un vector de 100 digitos entre el 1 y el 10000000 para la cantidad de dinero
        for(int i=0;i<vecSaldo.length;i++){
           int num=(int) ((Math.random()*1000000)+1);
            vecSaldo[i]=num;
        }
	}
	public void crear2(){// crea un vector de 100 digitos entre el 1 y el 10000 para el titular de la cuenta
        for(int i=0;i<vecTitular.length;i++){
           int num=(int) ((Math.random()*10000)+1);
            vecTitular[i]=num;
        }
	}
	public void crear3(){// crea un vector de 100 digitos entre el 1 y el 10000 para el codigo del titular
        for(int i=0;i<vecCodigo.length;i++){
           int num=(int) ((Math.random()*10000)+1);
            vecCodigo[i]=num;
        }
	}
	
	public void ordenar() {
		for(int y=0;y<vecSaldo.length;y++) {// con eso quiero averiguar la posicion del numero mas alto
			if(vecSaldo[y]>numVector) {		// para luego obtener el titular y el codigo de este
				numVector=vecSaldo[y];
				posiMayor=y+1;
			}
		}
		
		Arrays.sort(vecSaldo);//ordena el vector en orden ascendente
		
		System.out.println("El vector es: ");
		for(int i=0;i<vecSaldo.length;i++){
            System.out.print(vecSaldo[i]+" ");
        }
		System.out.println("");
		System.out.println("El saldo mas alto es: "+vecSaldo[99]+" , el titular es: "+vecTitular[posiMayor]+" y su codigo es: "+vecCodigo[posiMayor]);
	}
}
