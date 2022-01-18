import java.util.Scanner;
public class CuentaCorriente {
	Scanner teclado= new Scanner(System.in);
	
	private String titular;
	private float saldo, nuevoSaldo, saldoInicial=10;
	private String codigo;
		
	
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
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void  ingresarDinero() {
		
		
	}
	
}
