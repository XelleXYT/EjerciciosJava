/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

/**
 *
 * @author Alejandro Luna Gomez
 */
public class EjerciciosNivel1 {

    /**
     * Ejercicio Maximo y segundo maximo. - Haz un método que reciba un array de
     * ints como parámetro. Tiene que devolver el mayor número y el segundo
     * mayor número.
     *
     * @param listaNumeros - int[]
     * @return - int[]
     *
     */
    public int[] maximo(int[] _listaNumeros) {
	int[] numeroMaximo = {0, 0};
	for (int i = 0; i < _listaNumeros.length; i++) {
	    if (numeroMaximo[0] < _listaNumeros[i]) {
		numeroMaximo[1] = numeroMaximo[0];
		numeroMaximo[0] = _listaNumeros[i];
	    } else if (numeroMaximo[1] < _listaNumeros[i]) {
		numeroMaximo[1] = _listaNumeros[i];
	    }
	}
	return numeroMaximo;
    }

    /**
     * Ejercicio Palíndromo - Haz un método que reciba un String como parámetro,
     * de cualquier longitud. El método devolverá true si la palabra es un
     * Palíndromo, es decir, se lee igual de izquierda a derecha que de derecha
     * a izquierda (ignorando los espacios en blanco). Devolverá falso en caso
     * contrario.
     *
     * @param frase - String
     * @return - String
     *
     */
    public String palindromo(String _frase) {
	//Inicializamos los valores
	boolean palin = true;

	//Formateamos el String _frase
	_frase = _frase.toUpperCase();
	_frase = _frase.replaceAll("Á", "A");
	_frase = _frase.replaceAll("É", "E");
	_frase = _frase.replaceAll("Í", "I");
	_frase = _frase.replaceAll("Ó", "O");
	_frase = _frase.replaceAll("Ú", "U");
	_frase = _frase.replaceAll("Ñ", "n");
	_frase = _frase.replaceAll("\\W", "");

	//Comprobamos si la frase es un palíndromo
	for (int i = 0; i < _frase.length() / 2; i++) {
	    if (_frase.charAt(i) == _frase.charAt(_frase.length() - i - 1)) {
	    } else {
		palin = false;
	    }
	}

	//Devolvemos si es un palíndromo o no
	if (palin) {
	    return "Es un palíndromo";
	} else {
	    return "No es un palíndromo";
	}
    }

    /**
     * Ejercicio Isograma - Haz un método que reciba un String como parámetro,
     * de cualquier longitud. El método devolverá true si la palabra es un
     * Isograma, es decir, no tiene ninguna letra repetida. Devolverá falso en
     * caso contrario.
     *
     * @param _frase - String
     * @return - String
     *
     */
    public String isograma(String _frase) {
	boolean isog = true;

	//Formateamos el String _frase
	_frase = _frase.toUpperCase();
	_frase = _frase.replaceAll("Á", "A");
	_frase = _frase.replaceAll("É", "E");
	_frase = _frase.replaceAll("Í", "I");
	_frase = _frase.replaceAll("Ó", "O");
	_frase = _frase.replaceAll("Ú", "U");
	_frase = _frase.replaceAll("Ñ", "n");
	_frase = _frase.replaceAll("\\W", "");

	for (int i = 0; i < _frase.length(); i++) {
	    for (int j = 0; j < _frase.length(); j++) {
		if (_frase.charAt(i) != _frase.charAt(j) || i == j) {
		} else {
		    isog = false;
		}
	    }
	}
	if (isog) {
	    return "Es un isograma";
	} else {
	    return "No es un isograma";
	}
    }

    /**
     * Ejercicio Calendario - Haz un método que imprima los días de un mes de 31
     * días. El método recibirá como parámetro el día de la semana en que
     * quieres que empiece el calendario.
     *
     * @param _diasemana - Int
     *
     */
    public void calendario(int _diasemana) {
	//Inicializamos los valores
	int filas = 5;
	int contador = 0;
	int contador2 = 0;
	String dianulo = "XX";
	if (_diasemana >= 5) { //Si la semana empieza despues del jueves
	    filas = 6; //Añade otra fila
	}
	String[] calend = new String[filas * 7]; //Crea el array de strings

	//Asigna el valor XX a los dias que esten antes del primer dia
	for (int i = 0; i <= _diasemana - 2; i++) {
	    calend[contador] = dianulo;
	    contador++;
	}

	//Asigna los números de los dias hasta el 31
	for (int j = 1; j < 32; j++) {
	    String aux = Integer.toString(j);
	    if (j <= 9) {
		aux = "0" + aux;
	    }
	    calend[contador] = aux;
	    contador++;
	}

	//Asigna el valor XX a los dias que esten despues del ultimo dia
	while (contador < calend.length) {
	    calend[contador] = dianulo;
	    contador++;
	}

	//Imprime la tabla
	for (int l = 0; l < filas; l++) {
	    for (int k = 1; k < 7; k++) {
		System.out.print(calend[contador2] + " ");
		contador2++;
	    }
	    System.out.print(calend[contador2] + " ");
	    System.out.println();
	    contador2++;
	}
    }

}
