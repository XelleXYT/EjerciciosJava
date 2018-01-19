/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosjava;

import java.util.Arrays;

/**
 *
 * @author Alejandro Luna Gomez
 */
public class EjerciciosNivel2 {
    
    /**
     * Ejercicio Escalera de Palabras - Haz un método que reciba un array de
     * char de 2 dimensiones como parámetro, de cualquier longitud. El método
     * devolverá true si el array que se ha pasado es una escalera de palabras,
     * por ejemplo: P A T A P A T O R A T O R A M O G A M O G A T O M A T O es
     * una escalera de palabras porque cada palabra sólo se diferencia en un
     * char con la siguiente.
     *
     * @param _palabras - char[][]
     *
     */
    public void escaleraPalabras(char[][] _palabras) {

	boolean esEscalera = true;
	boolean errTamaño = false;

	for (int i = 1; i < _palabras.length; i++) {
	    if (_palabras[i].length == _palabras[i - 1].length && !errTamaño) {
		int diff = 0;
		for (int j = 0; j < _palabras[i].length; j++) {
		    if (_palabras[i][j] != _palabras[i - 1][j]) {
			diff++;
		    }
		}
		if (diff > 1) {
		    esEscalera = false;
		}
	    } else if (!errTamaño) {
		errTamaño = true;
	    }
	}
	if (errTamaño) {
	    System.out.println("Las palabras son de distinto tamaño");
	} else if (esEscalera) {
	    for (int i = 0; i < _palabras.length; i++) {
		System.out.println(Arrays.toString(_palabras[i]));
	    }
	    System.out.println("-----------------------------");
	    System.out.println("Es una escalera de palabras.");
	} else {
	    for (int i = 0; i < _palabras.length; i++) {
		System.out.println(Arrays.toString(_palabras[i]));
	    }
	    System.out.println("-----------------------------");
	    System.out.println("No es una escalera de palabras.");
	}

    }

    /**
     * Ejercicio ADN - Las moléculas de ADN consisten en dos cadenas de
     * nucleótidos pareados, moléculas que codifican información genética. Los
     * biotecnólogos representan cada hebra de ADN como una cadena hecha de
     * cuatro diferentes Letras - A, C, T y G - cada una de las cuales
     * representa uno de los cuatro posibles nucleótidos. Los dos hilos
     * emparejados en una molécula de ADN no son arbitrarios. En el ADN normal,
     * las dos hebras siempre tienen la misma longitud, y cada nucleótido de una
     * hebra se empareja con un correspondiente nucleótido de la segunda hebra.
     * En las cadenas normales de ADN, las letras se emparejan de la siguiente
     * manera: A se empareja con T y viceversa. C se empareja con G y
     * vice-versa. Debajo tienes un ejemplo de una cadena de ADN correcta.
     * Fíjate en cómo las letras casan según la regla anterior:
     * GCATGGATTAATATGAGACGACTAATAGGATAGTTACAACCCTTACGTCACCGCCTTGA
     * ↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕
     * CGTACCTAATTATACTCTGCTGATTATCCTATCAATGTTGGGAATGCAGTGGCGGAACT En algunas
     * ocasiones, ocurren errores en las cadenas de ADN. Los errores se pueden
     * agrupar en dos tipos: - Mutación puntual: dos letras que no casan. Por
     * ejemplo, si una A se empareja con una C - Nucleótidos sin pareja: una
     * letra que no tiene ninguna pareja. Considera ahora estas dos hebras de
     * ADN: GGGA-GAATCTCTGGACT CCCTACTTA-AGACCGGT Aquí, hay dos nucleótidos sin
     * casar (representado por una cadena de ADN que contiene un carácter de
     * guión en lugar de una letra) y dos mutaciones puntuales (A emparejado con
     * G y T emparejado con T). Aunque ambos tipos de errores son problemáticos,
     * consideraremos que las mutaciones puntuales son menos "costosas" que un
     * nucleótido sin pareja. Vamos a asignar a las mutaciones puntuales (una
     * letra que coincida con la letra equivocada) un coste de 1 y un nucleótido
     * sin igual (una letra con un guión) un coste de 2. Tu trabajo es escribir
     * un método private int costeErroresADN (String uno, String dos) que acepte
     * como entrada dos cadenas que representan cadenas de ADN, y que devuelva
     * el coste total de todos los errores. En esas dos cadenas puedes asumir lo
     * siguiente: • Las dos cuerdas tienen la misma longitud. • Cada cadena
     * consiste únicamente en los caracteres A, C, T, G y - (el carácter de
     * guión). Todas las letras serán mayúscula. • El carácter - en una cadena
     * nunca se empareja con un carácter - en la otra.
     *
     * @param uno - String
     * @param dos - String
     * @return - int
     *
     */
    public int costeErroresADN(String uno, String dos) {
	int errores = 0;
	if (uno.length() == dos.length()) {
	    for (int i = 0; i < uno.length(); i++) {
		errores += comparaNucleotidos(uno.charAt(i), dos.charAt(i));
	    }
	}
	return errores;
    }

    /**
     * Segundo metodo de Ejercicio ADN - Se encarga de realizar los calculos de
     * errores.
     *
     * @param uno - char
     * @param dos - char
     * @return - int
     *
     */
    public int comparaNucleotidos(char uno, char dos) {
	int error = 0;

	//Comprobamos si los Nucleotidos son iguales
	if (uno == dos) {
	    error++;
	}

	//Transforma las T en A de uno
	if (uno == 'T') {
	    uno = 'A';
	} else if (uno == 'G') {
	    uno = 'C';
	}

	//Transforma las T en A de dos
	if (dos == 'T') {
	    dos = 'A';
	} else if (dos == 'G') {
	    dos = 'C';
	}

	//Comprobamos si los Nucleotidos son distintos despues de la transformacion
	if (uno != dos) {
	    if (uno == '-') {
		error += 2;
	    } else if (dos == '-') {
		error += 2;
	    } else {
		error++;
	    }
	}

	return error;
    }

}
