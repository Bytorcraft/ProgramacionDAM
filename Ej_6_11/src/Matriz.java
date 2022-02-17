import java.util.*;
public class Matriz {
	Scanner teclado= new Scanner(System.in);

	private int filas;
	private int columnas;
	
	public int getFilas() {
		return filas;}
	public void setFilas(int filas) {
		this.filas = filas;}
	
	public int getColumnas() {
		return columnas;}
	public void setColumnas(int columnas) {
		this.columnas = columnas;}
	
	private int[][] vector1;
	private int[][] vector2;
	private int[][] resultado;
	
	public Matriz(int cuadrada) {//se nos crean matrices cuadradas(filas=columnas)
		filas=columnas=cuadrada;
		vector1= new int[cuadrada][cuadrada];
		vector2= new int[cuadrada][cuadrada];
		resultado= new int[cuadrada][cuadrada];
	}
	public void crearVectores() {//crea los 2 vectores necesarios
		
		 for(int fila=0;fila<vector1.length;fila++){// crea la primera matriz numeros random del 1 al 100
			 for(int colum=0;colum<vector1[fila].length;colum++) {  
			 int num=(int) ((Math.random()*100)+1);
	            vector1[fila][colum]=num;
			 	}
	        }
		 for(int fila=0;fila<vector2.length;fila++){// crea la segunda matriz numeros random del 1 al 100
			 for(int colum=0;colum<vector2[fila].length;colum++) {  
			 int num=(int) ((Math.random()*100)+1);
	            vector2[fila][colum]=num;
			 }
		 }
	}
	
	public void valorCelda() {// introduces la fila y columna y te da el numero
		int bfila, bcolum;
		System.out.println("Introduce la fila en la que buscar: ");
		bfila=teclado.nextInt();
		System.out.println("Introduce la columna en la que buscar: ");
		bcolum=teclado.nextInt();
		System.out.println(vector1[bfila][bcolum]);
		
	}
	public void introDato() {// das fila y columna y cambias el dato
		int bfila, bcolum, num;
		System.out.println("Introduce la fila en la que buscar: ");
		bfila=teclado.nextInt();
		System.out.println("Introduce la columna en la que buscar: ");
		bcolum=teclado.nextInt();
		System.out.println("Introduce el numero al que lo queires cambiar: ");
		num=teclado.nextInt();
		System.out.println(vector1[bfila][bcolum]=num);
	}
	public void imprimir() {//imprime la matriz
		for(int fila=0; fila<vector1.length;fila++) {
			System.out.println(" ");
			for(int colum=0;colum<vector1[fila].length;colum++) {
				System.out.print(" "+vector1[fila][colum]+ " ");
			}
		}
	}
	public void suma() {//suma de 2 matrices, guarda el resultado y lo imprime
		for (int x=0; x < vector1.length; x++) {
			System.out.println(" ");
			  for (int y=0; y < vector1[x].length; y++) {				
			    resultado[x][y]=vector1[x][y]+vector2[x][y];
			    System.out.print(" "+resultado[x][y]+" ");
			  }
			}
	}
	public void resta() {//resta de 2 matrices, guarda el resultado y lo imprime
		for (int x=0; x < vector1.length; x++) {
			System.out.println(" ");
			  for (int y=0; y < vector1[x].length; y++) {				
			    resultado[x][y]=vector1[x][y]-vector2[x][y];
			    System.out.print(" "+resultado[x][y]+" ");
			  }
			}
	}
	public void mult() {//multiplicacion de 2 matrices, guarda el resultado y lo imprime
		for (int x=0; x < vector1.length; x++) {
			System.out.println(" ");
			  for (int y=0; y < vector1[x].length; y++) {				
			    resultado[x][y]=vector1[x][y]*vector2[x][y];
			    System.out.print(" "+resultado[x][y]+" ");
			  }
			}
	}
	
}
