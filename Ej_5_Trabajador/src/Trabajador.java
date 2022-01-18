import java.util.Scanner;
public class Trabajador {
	Scanner teclado= new Scanner(System.in);
	
	private int identificador;
	private String nombre;
	private char estadoCivil;
	private char turno;
	private int titulacion;
	private int a�osEmpresa;
	private int nomina=425;
	private double totalNomina=0, retencion=0;
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public char getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public char getTurno() {
		return turno;
	}
	public void setTurno(char turno) {
		this.turno = turno;
	}
	public int getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(int titulacion) {
		this.titulacion = titulacion;
	}
	public int getA�osEmpresa() {
		return a�osEmpresa;
	}
	public void setA�osEmpresa(int a�osEmpresa) {
		this.a�osEmpresa = a�osEmpresa;
	}
		
	public void mostrarDatos() {
		System.out.println("El empleado " +getNombre() + " con el identificador " +getIdentificador()+ " est� " + getEstadoCivil()
							+ " ,trabaja en el turno de " +getTurno() + " ,con un nivel de titulaci�n " +getTitulacion() +" y con "
							+ getA�osEmpresa()+ " a�os en la empresa.");	 
	}
	
	public void introducirDatos() {
		System.out.println("Introduce el nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce el estado civil: ");
		estadoCivil = teclado.next().charAt(0);
		System.out.println("Introduce el turno: ");
		turno = teclado.next().charAt(0);
		System.out.println("Introduce la titulacion: ");
		titulacion = teclado.nextInt();
		System.out.println("Introduce los a�os en la empresa: ");
		a�osEmpresa = teclado.nextInt();
		
	}
	
	public void trabajador( String nombre, char estadoCivil,char turno,int titulacion, int a�osEmpresa) {
		this.nombre=nombre;
		this.estadoCivil=estadoCivil;
		this.turno=turno;
		this.titulacion=titulacion;
		this.a�osEmpresa=a�osEmpresa;
	}
	
	public void calculoNomina() {
		totalNomina=totalNomina+ nomina;
		if (turno == 'N') {
			totalNomina=totalNomina+100;
		}else if(turno=='D') {
			totalNomina=totalNomina+0;}
		
		switch (titulacion) {
			case 0:
				totalNomina=totalNomina+250;
				break;
			case 1:
				totalNomina=totalNomina+500;
				break;
			case 2:
				totalNomina=totalNomina+1000;
				break;
			case 3:
				totalNomina=totalNomina+1250;
				break;
			case 4:
				totalNomina=totalNomina+1500;break;	
				default:totalNomina=totalNomina+0;
		}
		totalNomina+= a�osEmpresa*75;
		if (estadoCivil=='S') {
			retencion= (totalNomina*12)/100;
			totalNomina=totalNomina-retencion;
		}else if (estadoCivil=='C'){
			retencion= (totalNomina*10)/100;
			totalNomina=totalNomina-retencion;
		}
		System.out.println("Su nomina es de: "+totalNomina +"�");			
	}
}

