/**Programa para representar vehiculos con sus caracteristicas 
 * @author Minaya
 * @date 14/03/2022 
 * 
 */
import java.util.*;
public class Examen extends Vehiculo {
	Scanner teclado=new Scanner(System.in);
	public int tipo;
	public int ejes;
	public int sePinta;
	public int seRevisa;
	
	
	public  void tipoVehiculo() {
		
		int num=(int) (Math.random()*3)+1;
		 
		if (num==1) {
			tipo=1;//automovil
		}
		else if (num==2) {
			tipo=2;//fargoneta
		}
		else if (num==3) {
			tipo=3;//camion
		}
		
	}
	public void numEjes() {
		
		if(tipo==1) {
			ejes=2;
		}
		else if (tipo==2) {
			ejes=(int)(Math.random()*3)+2;
		}
		else if (tipo==3) {
			ejes=(int)(Math.random()*6)+4;
		}
		
	}
	public void pintar() {
		int color=0xFFFFFF;
		
		sePinta=(int)(Math.random()*1)+0;
		
		if(sePinta==0) {
			color=0xFFFFFF;
		}
		else if (sePinta==1) {
			color=(int)(Math.random()*0xFFFFFF)+0;
		}		
	}
	public void precioPintura() {
		int precioBase;
		int precioEje;
		int precioTotal;
		
		if(sePinta==1) {
			
			if (tipo==1) {
				precioTotal=precioBase=600;
			}
			else if (tipo==2) {
				precioBase=500; precioEje=ejes*100; precioTotal= precioBase+precioEje;
			}
			else if (tipo==3) {
				precioBase=300; precioEje=ejes*200; precioTotal= precioBase+precioEje;
			}			
		}	
	}
	public void distReco() {
		int dist=0;
		System.out.println("Introduce la distancia que has recorrido hoy: ");
		dist+=teclado.nextInt();
		
	}
	public void debeRevisarse() {
		int dias;
		int kmRecorridos;
		
		if(tipo==1) {
			dias=(int)(Math.random()*360)+1; kmRecorridos=(int)(Math.random()*15000)+0;
			while (dias>=360 && kmRecorridos>=15000) {
				seRevisa=1;
			}
		}
		if(tipo==2) {
			dias=(int)(Math.random()*180)+1; kmRecorridos=(int)(Math.random()*12000)+0;
			while (dias>=360 && kmRecorridos>=12000) {
				seRevisa=1;
			}
		}
		if(tipo==3) {
			dias=(int)(Math.random()*180)+1; kmRecorridos=(int)(Math.random()*10000)+0;
			while (dias>=360 && kmRecorridos>=10000) {
				seRevisa=1;
			}
		}
	}
	public void pasarRevision() {
		int pasa;
		if(seRevisa==1) {
			pasa=(int)(Math.random()*1)+0;
		}
	}

}