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
public class EjerciciosBasicos {

        /**
     * Ejercicio A1: Fiesta de las Ardillas - Cuando las ardillas se reúnen para
     * una fiesta, les gusta tener bellotas. Una fiesta de ardillas tiene éxito
     * cuando el número de bellotas es de entre 40 y 60, ambos inclusive. A
     * menos que sea el fin de semana, en cuyo caso no hay limite de bellotas.
     *
     * @param n - int
     * @param finde - boolean
     * @return - boolean
     *
     */
    public boolean fiestaArdillas(int n, boolean finde) {
	if (finde) {
	    return true;
	} else if (n >= 40 && n <= 60) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Ejercicio A2: Multas de coches (GTA DAM CITY) - Estás conduciendo
     * demasiado rápido, y un policía te detiene. Escribir el código para
     * calcular el resultado, codificado como un valor int: 0 = sin multa 1 =
     * multa pequeña 2 = multa grande.
     *
     * Si la velocidad es de 60 o menos, el resultado es 0 Si la velocidad es de
     * entre 61 y 80 inclusive, el resultado es 1 Si la velocidad es 81 o más,
     * el resultado es 2
     *
     * A menos que sea tu cumpleaños: en ese día, tu velocidad puede ser 5
     * puntos superior en todos los casos.
     *
     * @param n - int
     * @param cumple - boolean
     * @return - int
     *
     */
    public int multa(int n, boolean cumple) {
	if (cumple) {
	    n -= 5;
	}
	if (n <= 60) {
	    return 0;
	} else if (n <= 80) {
	    return 1;
	} else {
	    return 2;
	}
    }

    /**
     * Ejercicio A3: Números muy vanidosos - Diremos que un número es muy
     * vanidoso si se trata de un múltiplo de 11 o si es uno más de un múltiplo
     * de 11. Devuelve true si el número no negativo dado es muy vanidoso.
     * (Utiliza el operador "mod" %)
     *
     * @param num - int
     * @return - boolean
     *
     */
    public boolean muyVanidoso(int num) {
	//return(num % 11 <= 1);
	if (num % 11 <= 1) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Ejercicio A4: Suena tu móvil - Suena tu movil. Crea una función que
     * devuelva true si debes responder. Normalmente sí contestas, salvo por la
     * mañana, que solo respondes si es tu madre. En todos los casos, si esás
     * dormido, no contestas.
     *
     * @param matinal - boolean
     * @param madre - boolean
     * @param dormido - boolean
     * @return - boolean
     *
     */
    public boolean contesta(boolean matinal, boolean madre, boolean dormido) {
	if (dormido) {
	    return false;
	} else if (madre) {
	    return true;
	} else if (!matinal) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Ejercicio A5: Enteros menores - Dados tres enteros, a, b, c, crea una
     * función que devuelva true si uno de ellos es 10 menos que uno de los
     * otros.
     *
     * @param x - int
     * @param y - int
     * @param z - int
     * @return - boolean
     *
     */
    public boolean menorPor10(int x, int y, int z) {
	if (x == y - 10 || x == z - 10 || y == z - 10 || y == x - 10 || z == x - 10 || z == y - 10) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Ejercicio A6: Digito igual - Dados dos enteros, cada uno en el rango 10
     * .. 99, ) crea una función que devuelva true si hay un dígito que aparece
     * en los dos números, como el 2 en 12 y 23 (Nota: la División, por ejemplo,
     * n/10, da el dígito de la izquierda, mientras que el % "mod" n % 10 da el
     * dígito de la derecha)
     *
     * @param x - int
     * @param y - int
     * @return - boolean
     *
     */
    public boolean digitoIgual(int x, int y) {
	if (x / 10 == y / 10 || x / 10 == y % 10 || x % 10 == y / 10 || x % 10 == y % 10) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Ejercicio A7: Multiplo multiple - Crea una función que devuelva verdadero
     * si un número no negativo dado es un múltiplo de 3 ó 5, pero no de ambos.
     * Utiliza el operador "mod"%
     *
     * @param x - int
     * @return - boolean
     *
     */
    public boolean multiploMultiple(int x) {
	if (x % 3 == 0 && x % 5 == 0) {
	    return false;
	} else if (x % 3 == 0 || x % 5 == 0) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Ejercicio A8: Menos multiplo 20 - Crea una función que devuelva true si
     * el número dado no negativo es 1 o 2 menos que un múltiplo de 20. Así, por
     * ejemplo, 38 y 39 de retorno es cierto, pero 40 vuelve falsa. Utiliza el
     * operador "mod"%
     *
     * @param x - int
     * @return - boolean
     *
     */
    public boolean menos20(int x) {
	if (x % 20 == 18 || x % 20 == 19) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Ejercicio A9: Loteria - Tienes un billete de lotería de color rojo con
     * tres ints a, b, y c, cada uno de los cuales es 0, 1 ó 2. Si son todos el
     * valor 2, el resultado es 10. De lo contrario, si son todos iguales, el
     * resultado es 5. De lo contrario, siempre que tanto B y C son diferentes
     * de A, el resultado es 1. de lo contrario el resultado es 0.
     *
     * @param a - int
     * @param b - int
     * @param c - int
     * @return - int
     *
     */
    public int loteria(int a, int b, int c) {
	if (a == b && b == c && c == 2) {
	    return 10;
	} else if (a == b && b == c) {
	    return 5;
	} else if (a != b && a != c) {
	    return 1;
	} else {
	    return 0;
	}
    }

    /**
     * Ejercicio A10: Dados raros - Crea una función que devuelva la suma de dos
     * tiradas de dados de 6 lados, cada uno en el rango de 1 .. 6. Tienes que
     * tener en cuenta que si el valor booleano noDoubles es cierto, si los dos
     * dados muestran el mismo valor, tienes que incrementar un dado al
     * siguiente valor.
     *
     * @param x - int
     * @param y - int
     * @param noDoubles - boolean
     * @return - int
     *
     */
    public int withoutDoubles(int x, int y, boolean noDoubles) {
	if (noDoubles && x == y) {
	    return (x + y + 1);
	} else {
	    return (x + y);
	}
    }
    
}
