
public class FichaJuego extends Ficha {
	
	boolean ocupado1, ocupado2; //lados ocupados de cada ficha
	
	
	public FichaJuego(char c, char d) {
		super(c, d);
		ocupado1=ocupado2=false;
		
	}

	public FichaJuego(int x, int y) {
		super(x, y);
		ocupado1=ocupado2=false;
	}
	
	public boolean compatibe(FichaJuego f) {
		 return (c1== f.c1 || c2==f.c2 || c2==f.c1 || c1==f.c2);
	}

	public void casar(FichaJuego f) {
		if (! compatibe(f))
			throw new IllegalArgumentException();
		if(c1==f.c1 && !ocupado1 && !f.ocupado2)
			ocupado1=true;
		f.ocupado1=true;
	}
	
}
