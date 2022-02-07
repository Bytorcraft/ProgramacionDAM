import java.util.Scanner;

public class CuentaCorriente {
	Scanner teclado = new Scanner(System.in);

	private String titular;
	private float saldo;
	private String codigo;
	private float retirar;
	
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

//	public void setCodigo(String codigo) {
//		this.codigo = codigo;
//	}

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
		System.out.println("El nombre del Titular es: "+ titular +" tu saldo es de "+ saldo);
	}

	public void ingresarDinero() {
		float ingreso;
		System.out.println("Tu saldo actual es de: " + saldo);
		System.out.println("Cuanto dinero deseas ingresar: ");
		ingreso = teclado.nextFloat();
		saldo = saldo + ingreso;
		System.out.println("Despues de tu ingreso de " + ingreso + "€ tu saldo es de: " + saldo);
	}

	public boolean puedoSacar() {
		boolean saldoPositivo = true;
		if (saldo -retirar<=0) {
			saldoPositivo = false;
		} else {
			saldoPositivo = true;
		}
		return saldoPositivo;
	}

	public void retiraDinero() {
		System.out.println("Indica cuanto dinero desea retirar: ");
		retirar = teclado.nextFloat();
		
		if (puedoSacar() == true) {
			saldo = saldo - retirar;
			System.out.println("Despues de retirar " + retirar + "€ su saldo es de: " + saldo);
		} else {
			System.out.println("Eror, no puedes sacar tanto dinero, no tienes suficiente.");
		}

	}
}
