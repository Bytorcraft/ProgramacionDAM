import java.util.*;
public class Matriz {
	Scanner teclado= new Scanner(System.in);

	private int filas;
	private int columnas;
	
	public int getFilas() {
		System.out.println("Introduce el numero de filas que quieres que tenga el vector: ");
		filas=teclado.nextInt();
		return filas;}
	public void setFilas(int filas) {
		this.filas = filas;}
	
	public int getColumnas() {
		System.out.println("Introduce el numero de columnas que quieres que tenga el vector: ");
		columnas=teclado.nextInt();
		return columnas;}
	public void setColumnas(int columnas) {
		this.columnas = columnas;}
	
	int[][] vector1= new int[filas][columnas];
	int[][] vector2= new int[filas][columnas];
	int[][] resultado= new int[filas][columnas];
	
	public void crearVectores() {
		
		
		 for(int fila=0;fila<vector1.length;fila++){// crea el primer matriz numeros random del 1 al 100
			 for(int colum=0;colum<vector1[fila].length;colum++) {  
			 int num=(int) ((Math.random()*100)+1);
	            vector1[fila][colum]=num;
			 	}
	        }
		 for(int fila=0;fila<vector2.length;fila++){// crea el segundo matriz numeros random del 1 al 100
			 for(int colum=0;colum<vector2[fila].length;colum++) {  
			 int num=(int) ((Math.random()*100)+1);
	            vector2[fila][colum]=num;
			 }
		 }
	}
	public void valorCelda() {
		int bfila, bcolum;
		System.out.println("Introduce la fila en la que buscar: ");
		bfila=teclado.nextInt();
		System.out.println("Introduce la columna en la que buscar: ");
		bcolum=teclado.nextInt();
		System.out.println(vector1[bfila][bcolum]);
		
	}
	public void introDato() {
		int bfila, bcolum, num;
		System.out.println("Introduce la fila en la que buscar: ");
		bfila=teclado.nextInt();
		System.out.println("Introduce la columna en la que buscar: ");
		bcolum=teclado.nextInt();
		System.out.println("Introduce el numero al que lo queires cambiar: ");
		num=teclado.nextInt();
		System.out.println(vector1[bfila][bcolum]=num);
	}
	public void imprimir() {
		for(int fila=0; fila<vector1.length;fila++) {
			System.out.println(" ");
			for(int colum=0;colum<vector1[fila].length;colum++) {
				System.out.print(" "+vector1[fila][colum]+ " ");
			}
		}
	}
	public void suma() {
		for (int x=0; x < vector1.length; x++) {
			  for (int y=0; y < vector1[x].length; y++) {				
			    resultado[x][y]=vector1[x][y]+vector2[x][y];
			    System.out.println(resultado[x][y]);
			  }
			}
	}
	public void resta() {
		for (int x=0; x < vector1.length; x++) {
			  for (int y=0; y < vector1[x].length; y++) {				
			    resultado[x][y]=vector1[x][y]-vector2[x][y];
			    System.out.println(resultado[x][y]);
			  }
			}
	}
	public void mult() {
		for (int x=0; x < vector1.length; x++) {
			  for (int y=0; y < vector1[x].length; y++) {				
			    resultado[x][y]=vector1[x][y]*vector2[x][y];
			    System.out.println(resultado[x][y]);
			  }
			}
	}
	
}
