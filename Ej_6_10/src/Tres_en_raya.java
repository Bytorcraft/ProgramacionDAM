import java.util.*;

/**
 * <h1>Ejercicio_06_10</h1>
 * <p>Aplicacion para jugar al tres en raya.</p>
 * <p>Representar el tablero como una matriz cuadrada de 3 caracteres.</p>
 * <p>La matriz se inicializa en espacios en blanco y a cada jugador se
 * le pregunta en que posicion quiere introducir su marca.</p>
 * <p><b>La posicion del primer jugador esta marcada en el
 * tablero con una "O" y la posicion del segundo jugador esta marcada con una "X". Continuar el
 * proceso hasta que un jugador gana el juego o empate.</b></p>
 * <p>Para ganar, un jugador debe tener tres marcas en una fila, en una columna o en una diagonal.
 * Se produce un empate cuando el tablero esta lleno y nadie ha ganado.</p>
 * <p>La posicion de cada jugador debe ingresarse como indices: es decir, un numero de fila, un
 * espacio y un numero de columna. La aplicacion debe ser facil de usar. Despues de cada juego,
 * imprimir un diagrama del tablero que muestre las posiciones finales.</p>
 * @since 08/02/2022
 * @version 1.0
 * @author Victor Sanz*/

public class Tres_en_raya {

	// Representaciones de los jugadores y del simbolo vacio:
	private final char player1 = 'O';
	private final char player2 = 'X';
	private final char VACIO = '-';
	private static int cont1;
	private static int cont2;

	// Turno actual:
	// true = player1, false = player2
	private boolean turno;

	// Tablero donde vamos a jugar:
	private char tablero[][];

	public Tres_en_raya() {
		this.turno = true;
		this.tablero = new char[3][3];
		this.initTablero();
	}

	// Obtener simbolo del primer jugador:
	/**
	 * @return the player1
	 */
	public char getPlayer1() {
		return player1;
	}

	// Obtener simbolo del segundo jugador:
	/**
	 * @return the player2
	 */
	public char getPlayer2() {
		return player2;
	}

	// Obtener simbolo de VACIO:
	/**
	 * @return the VACIO
	 */
	public char getVACIO() {
		return VACIO;
	}

	// Obtener contador de partidas ganadas por el primer jugador:
	/**
	 * @return the cont1
	 */
	public int getCont1() {
		return cont1;
	}

	// Obtener contador de partidas ganadas por el segundo jugador:
	/**
	 * @return the cont2
	 */
	public int getCont2() {
		return cont2;
	}

	// Inicializar el tablero con el simbolo VACIO:
	private void initTablero() {
		for ( int i = 0; i < tablero.length; i++ ) {
			for ( int j = 0; j < tablero.length; j++ ) {
				// Al comienzo, el tablero debe contener '-', como si fueran espacios en blanco:
				tablero[i][j] = VACIO;
			}
		}
	}

	// Fin de la partida, acaba cuando hay un ganador o el
	// tablero esta lleno:
	/**
	 * @return fin de partida
	 */
	public boolean endPartida() {
		if ( tableroLleno() || coincidenciaLinea() != VACIO || coincidenciaColumna() != VACIO || coincidenciaDiagonal() != VACIO ) {
			return true;
		}
		return false;
	}

	// Si el tablero esta lleno cuando el simbolo por defecto aparezca,
	// no esta lleno:
	/**
	 * @return tablero vacio o no
	 */
	public boolean tableroLleno() {
		for ( int i = 0; i < tablero.length; i++ ) {
			for ( int j = 0; j < tablero[0].length; j++ ) {
				if ( tablero[i][j] == VACIO ) {
					return false;
				}
			}
		}
		return true;
	}

	// Indicar si hay un ganador en una linea:
	/**
	 * @return Simbolo del ganador, VACIO sino hay ganador
	 */
	private char coincidenciaLinea() {
		char simbolo;
		boolean coincidencia;
		for ( int i = 0; i < tablero.length; i++ ) {
			// Reiniciar la coincidencia:
			coincidencia = true;
			// Coger el simbolo de la fila:
			simbolo = tablero[i][0];
			if ( simbolo != VACIO ) {
				for ( int j = 1; j < tablero[0].length; j++ ) {
					// Sino coincide ya no habra ganador en esta fila:
					if ( simbolo != tablero[i][j] ) {
						coincidencia = false;
					}
				}
				//Si no se mete en el if, devuelve el simbolo ganador:
				if ( coincidencia ) {
					return simbolo;
				}
			}
		}
		//Si no hay ganador, devuelve el simbolo por defecto:
		return VACIO;
	}

	// Indica si hay un ganador en una columna:
	/**
	 * @return Simbolo del ganador, VACIO sino hay ganador
	 */
	private char coincidenciaColumna() {
		char simbolo;
		boolean coincidencia;
		for ( int j = 0; j < tablero.length; j++ ) {
			// Reiniciar la coincidencia:
			coincidencia = true;
			// Coger el simbolo de la columna:
			simbolo = tablero[0][j];
			if ( simbolo != VACIO ) {
				for ( int i = 1; i < tablero[0].length; i++ ) {
					// Sino coincide ya no habra ganador en esta fila:
					if ( simbolo != tablero[i][j] ) {
						coincidencia = false;
					}
				}
				// Si no se mete en el if, devuelve el simbolo ganador:
				if ( coincidencia ) {
					return simbolo;
				}
			}
		}
		// Si no hay ganador, devuelve el simbolo por defecto:
		return VACIO;
	}

	// Comprobar las diagonales:
	/**
	 * @return Simbolo del ganador, VACIO sino hay ganador
	 */
	private char coincidenciaDiagonal() {
		char simbolo;
		boolean coincidencia = true;
		// Diagonal principal:
		simbolo = tablero[0][0];
		if ( simbolo != VACIO ) {
			for ( int i = 1; i < tablero.length; i++ ) {
				// Sino coincide ya no habra ganador en esta fila:
				if (simbolo != tablero[i][i]) {
					coincidencia = false;
				}
			}
			// Si no se mete en el if, devuelve el simbolo ganador:
			if ( coincidencia ) {
				return simbolo;
			}
		}
		coincidencia = true;

		// Diagonal inversa:
		simbolo = tablero[0][2];
		if ( simbolo != VACIO ) {
			for ( int i = 1, j = 1; i < tablero.length; i++, j-- ) {
				// Sino coincide ya no habra ganador en esta fila:
				if ( simbolo != tablero[i][j] ) {
					coincidencia = false;
				}
			}
			// Si no se mete en el if, devuelve el simbolo ganador:
			if ( coincidencia ) {
				return simbolo;
			}
		}
		// Si no hay ganador, devuelve el simbolo por defecto:
		return VACIO;
	}
/**
 * @return muestra el ganador
 */
	// Muestra el ganador de la partida:
	public void mostrarGanador() {
		char simbolo = coincidenciaLinea();
		if ( simbolo != VACIO ) {
			ganador(simbolo, 1);
			return;
		}
		simbolo = coincidenciaColumna();
		if ( simbolo != VACIO ) {
			ganador(simbolo, 2); 
			return;
		}
		simbolo = coincidenciaDiagonal();
		if ( simbolo != VACIO ) {
			ganador(simbolo, 3);
			return;
		}
		System.out.println("\n\tHay empate.");
	}

	// Metodo ganador():
	/**
	 * @param simbolo
	 * @param tipo
	 */
	private void ganador(char simbolo, int tipo) {
		switch (tipo) {
		case 1:
			if ( simbolo == player1 ) {
				System.out.println("\n\tHa ganado el primer jugador por coincidencia en linea.");
				cont1++;
				System.out.println("\n\t" + getCont1() + " partidas ganadas.");
			} else {
				System.out.println("\n\tHa ganado el segundo jugador por coincidencia en linea.");
				cont2++;
				System.out.println("\n\t" + getCont2() + " partidas ganadas.");
			}
			break;
		case 2:
			if ( simbolo == player1 ) {
				System.out.println("\n\tHa ganado el primer jugador por coincidencia en columna.");
				cont1++;
				System.out.println("\n\t" + getCont1() + " partidas ganadas.");
			} else {
				System.out.println("\n\tHa ganado el segundo jugador por coincidencia en columna.");
				cont2++;
				System.out.println("\n\t" + getCont2() + " partidas ganadas.");
			}
			break;
		case 3:
			if ( simbolo == player1 ) {
				System.out.println("\n\tHa ganado el primer jugador por coincidencia en diagonal.");
				cont1++;
				System.out.println("\n\t" + getCont1() + " partidas ganadas.");
			} else {
				System.out.println("\n\tHa ganado el segundo jugador por coincidencia en diagonal.");
				cont2++;
				System.out.println("\n\t" + getCont2() + " partidas ganadas.");
			}
			break;
		}
	}

	// Insertar el simbolo en una posicion de la matriz:
	/**
	 * @param fila
	 * @param columna
	 */
	public void insertarEn(int fila, int columna) {
		if ( turno ) {
			this.tablero[fila][columna] = player1;
		} else {
			this.tablero[fila][columna] = player2;
		}
	}
	// Mostrar la matriz:
	public void mostrarTablero() {
		for ( int i = 0; i < this.tablero.length; i++ ) {
			for ( int j = 0; j < this.tablero[0].length; j++ ) {
				System.out.print("\t");
				System.out.print(this.tablero[i][j] + " ");
			}
			System.out.println("");
		}
	}

	// Mostrar el turno actual:
	public void mostrarTurnoActual() {
		if ( turno ) {
			System.out.println("\n\tLe toca al primer jugador.\n");
		} else {
			System.out.println("\n\tLe toca al segundo jugador.\n");
		}
	}

	// Siguiente turno:
	public void nextTurno() {
		this.turno = !this.turno;
	}

	// Validar simbolo insertado:
	/**
	 * @param fila
	 * @param columna
	 * @return
	 */
	public boolean validarPosicion(int fila, int columna) {
		if ( fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero.length ) {
			return true;
		}
		return false;
	}

	// Indicar si en una posicion hay una 'marca':
	/**
	 * @param fila
	 * @param columna
	 * @return
	 */
	public boolean hayValorPosicion(int fila, int columna) {
		if ( this.tablero[fila][columna] != VACIO ) {
			return true;
		}
		return false;
	}
	
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Tres_en_raya juego = new Tres_en_raya();
		int fila, columna;
		boolean valido, correcto;

		System.out.println("\tBienvenido al juego del Tres en raya en Java.");
		System.out.println("\t=============================================");


		// Finalizar cuando uno gane o no haya mas posibilidades:
		while ( !juego.endPartida() ) {
			do {
				// Mostrar el jugador actual:
				juego.mostrarTurnoActual();

				// Mostrar el tablero:
				juego.mostrarTablero();

				correcto = false;
				System.out.println("\tIntroducir 0, 1 o 2.");
				fila = pedirInteger("\tIntroduce fila: ");
				System.out.println("\tIntroducir 0, 1 o 2.");
				columna = pedirInteger("\tIntroduce columna: ");

				// Validar posicion:
				valido = juego.validarPosicion(fila, columna);

				// Si es valida, comprobar que no haya ninguna 'marca':
				if ( valido ) {
					// Si no hay 'marca', significa que es correcto:
					if ( !juego.hayValorPosicion(fila, columna) ) {
						correcto = true;
					} else {
						System.out.println("\n\t Hay una marca en esa posicion.");
					}
				} else {
					System.out.println("\n\t La posicion no es valida.");
				}
				// Mientras no sea correcto, no sale:
			} while ( !correcto ); // Fin 'while'.
			// Segun el turno, inserta un simbolo u otro:
			juego.insertarEn(fila, columna);
			juego.nextTurno();
		}
		//Mostrar tablero:
		juego.mostrarTablero();
		//Mostrar ganador:
		juego.mostrarGanador();
		
		System.out.println("\n\t¿Desea borrar los contadores?(S/N)");
		char borrar = teclado.next().charAt(0);
		if ( Character.toUpperCase(borrar) == 'S' ) {
			cont1= 0;
			cont2 = 0;
			System.out.println("\n\tEliminando contadores ...");
		} else if ( Character.toUpperCase(borrar) == 'N' ) {
			System.out.println("\n\tManteniendo contadores ...");
		} 
		
		teclado.close();
	}
	
	

	// Pedir un numero y devolverlo:
	/**
	 * @param mensaje
	 * @return
	 */
	private static int pedirInteger(String mensaje) {
		System.out.println(mensaje);
		int numero = teclado.nextInt();
		return numero;
	}
}
