import java.util.Scanner;
public class Ej_5_trabajador {
	Scanner teclado= new Scanner(System.in);
	
	public static void main (String[]Args) {
		
		
		
		
	}
	
	
	
	private static int identificador;
	private static  String nombre;
	private static String estadoCivil;
	private static String turno;
	private static int titulacion;
	private static int a�osEmpresa;
	
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
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
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
							+ getA�osEmpresa());
		 
	}
	
	public int Trabajador(int identificador, String nombre, String estadoCivil,String turno,int titulacion, int a�osEmpresa) {
		this.identificador=identificador;
		this.nombre=nombre;
		this.estadoCivil=estadoCivil;
		this.turno=turno;
		this.titulacion=titulacion;
		this.a�osEmpresa=a�osEmpresa;
		return identificador;
	}
}

