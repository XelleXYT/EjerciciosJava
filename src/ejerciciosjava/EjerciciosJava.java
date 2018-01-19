/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import com.sun.xml.internal.ws.util.StringUtils;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Ejercicios Java Moodle. Realizar todos los ejercicios de NetBeans.
 *
 * @author Alejandro Luna Gómez
 */
public class EjerciciosJava {

    public void menu(int ej) {
	
	EjerciciosBasicos eb = new EjerciciosBasicos();
	EjerciciosNivel1 elvl1 = new EjerciciosNivel1();
	EjerciciosNivel2 elvl2 = new EjerciciosNivel2();
	Ejemplos ejemplo = new Ejemplos();
	
	if (ej == 1) {
	    System.out.println("-----------------------------");
	    System.out.println("Fiesta de ardillas:");
	    System.out.println(eb.fiestaArdillas(30, false));
	    System.out.println(eb.fiestaArdillas(50, false));
	    System.out.println(eb.fiestaArdillas(70, true));
	    System.out.println("-----------------------------");
	    System.out.println("Pruebas Fiesta de ardillas:");
	    System.out.println(eb.fiestaArdillas(150, true));
	    System.out.println(eb.fiestaArdillas(60, false));
	    System.out.println(eb.fiestaArdillas(40, false));
	    System.out.println("-----------------------------");
	} else if (ej == 2) {
	    System.out.println("-----------------------------");
	    System.out.println("GTA:");
	    System.out.println(eb.multa(60, false));
	    System.out.println(eb.multa(65, false));
	    System.out.println(eb.multa(65, true));
	    System.out.println("-----------------------------");
	    System.out.println("Pruebas GTA:");
	    System.out.println(eb.multa(81, true));
	    System.out.println(eb.multa(85, true));
	    System.out.println(eb.multa(81, false));
	    System.out.println(eb.multa(-81, false));
	    System.out.println("-----------------------------");
	} else if (ej == 3) {
	    System.out.println("-----------------------------");
	    System.out.println("Números muy vanidosos:");
	    System.out.println(eb.muyVanidoso(22));
	    System.out.println(eb.muyVanidoso(23));
	    System.out.println(eb.muyVanidoso(24));
	    System.out.println("-----------------------------");
	    System.out.println("Pruebas Números muy vanidosos:");
	    System.out.println(eb.muyVanidoso(34));
	    System.out.println(eb.muyVanidoso(45));
	    System.out.println(eb.muyVanidoso(57));
	    System.out.println("-----------------------------");
	} else if (ej == 4) {
	    System.out.println("-----------------------------");
	    System.out.println("Suena el móvil:");
	    System.out.println(eb.contesta(false, false, false));
	    System.out.println(eb.contesta(false, false, true));
	    System.out.println(eb.contesta(true, false, false));
	    System.out.println("-----------------------------");
	    System.out.println("Pruebas Suena el móvil:");
	    System.out.println(eb.contesta(false, true, false));
	    System.out.println(eb.contesta(true, true, false));
	    System.out.println(eb.contesta(false, true, true));
	    System.out.println("-----------------------------");
	} else if (ej == 5) {
	    System.out.println("-----------------------------");
	    System.out.println(eb.menorPor10(1, 7, 11));
	    System.out.println(eb.menorPor10(1, 7, 10));
	    System.out.println(eb.menorPor10(11, 1, 7));
	    System.out.println("-----------------------------");
	    System.out.println("Pruebas Enteros menores:");
	    System.out.println(eb.menorPor10(110, 7, 100));
	    System.out.println(eb.menorPor10(11, 1, 21));
	    System.out.println(eb.menorPor10(1, 11, 11));
	    System.out.println("-----------------------------");
	} else if (ej == 6) {
	    System.out.println("-----------------------------");
	    System.out.println("Digito igual:");
	    System.out.println(eb.digitoIgual(12, 23));
	    System.out.println(eb.digitoIgual(12, 43));
	    System.out.println(eb.digitoIgual(12, 44));
	    System.out.println("-----------------------------");
	    System.out.println("Pruebas Digito igual:");
	    System.out.println(eb.digitoIgual(15, 50));
	    System.out.println(eb.digitoIgual(12, 21));
	    System.out.println(eb.digitoIgual(19, 99));
	    System.out.println("-----------------------------");
	} else if (ej == 7) {
	    System.out.println("-----------------------------");
	    System.out.println("Multiplo multiple:");
	    System.out.println(eb.multiploMultiple(3));
	    System.out.println(eb.multiploMultiple(10));
	    System.out.println(eb.multiploMultiple(15));
	    System.out.println("-----------------------------");
	    System.out.println("Pruebas Multiplo multiple:");
	    System.out.println(eb.multiploMultiple(6));
	    System.out.println(eb.multiploMultiple(20));
	    System.out.println(eb.multiploMultiple(30));
	    System.out.println("-----------------------------");
	} else if (ej == 8) {
	    System.out.println("-----------------------------");
	    System.out.println("Menos multiplo 20:");
	    System.out.println(eb.menos20(18));
	    System.out.println(eb.menos20(19));
	    System.out.println(eb.menos20(20));
	    System.out.println("-----------------------------");
	    System.out.println("Pruebas Menos multiplo 20:");
	    System.out.println(eb.menos20(38));
	    System.out.println(eb.menos20(39));
	    System.out.println(eb.menos20(40));
	    System.out.println("-----------------------------");
	} else if (ej == 9) {
	    System.out.println("-----------------------------");
	    System.out.println("Loteria:");
	    System.out.println(eb.loteria(2, 2, 2));
	    System.out.println(eb.loteria(2, 2, 1));
	    System.out.println(eb.loteria(0, 0, 0));
	    System.out.println("-----------------------------");
	    System.out.println("Pruebas Loteria:");
	    System.out.println(eb.loteria(1, 2, 0));
	    System.out.println(eb.loteria(2, 1, 0));
	    System.out.println(eb.loteria(0, 1, 0));
	    System.out.println("-----------------------------");
	} else if (ej == 10) {
	    System.out.println("-----------------------------");
	    System.out.println("Dados raros:");
	    System.out.println(eb.withoutDoubles(2, 3, true));
	    System.out.println(eb.withoutDoubles(3, 3, true));
	    System.out.println(eb.withoutDoubles(3, 3, false));
	    System.out.println(eb.withoutDoubles(6, 6, true));
	    System.out.println("-----------------------------");
	    System.out.println("Pruebas Dados raros:");
	    System.out.println(eb.withoutDoubles(1, 2, true));
	    System.out.println(eb.withoutDoubles(3, 4, true));
	    System.out.println(eb.withoutDoubles(2, 2, false));
	    System.out.println(eb.withoutDoubles(2, 2, true));
	    System.out.println("-----------------------------");
	} else if (ej == 11) {
	    int[] listaNumeros1 = {50, 31, 27, 2, 5, 99};
	    int[] listaNumeros2 = {150, 31, 27, 2, 5, 99};
	    System.out.println("-----------------------------");
	    System.out.println("Máximo y segundo máximo:");
	    System.out.println(Arrays.toString(elvl1.maximo(listaNumeros1)));
	    System.out.println("-----------------------------");
	    System.out.println(Arrays.toString(elvl1.maximo(listaNumeros2)));
	    System.out.println("-----------------------------");
	} else if (ej == 12) {
	    String palindromo1 = "ACASO	HUBO	BUHOS	ACA";
	    String palindromo2 = "DABALE ARROZ A LA ZORRA EL ABAD";
	    String palindromo3 = "Allí por la tropa portado, traído a ese paraje de maniobras, una tipa como capitán usar boina me dejara, pese a odiar toda tropa por tal ropilla";
	    String palindromo4 = "Esto no es un palíndromo";
	    System.out.println("-----------------------------");
	    System.out.println("Palíndromo:");
	    System.out.println("-----------------------------");
	    System.out.println(palindromo1);
	    System.out.println(elvl1.palindromo(palindromo1));
	    System.out.println("-----------------------------");
	    System.out.println(palindromo2);
	    System.out.println(elvl1.palindromo(palindromo2));
	    System.out.println("-----------------------------");
	    System.out.println(palindromo3);
	    System.out.println(elvl1.palindromo(palindromo3));
	    System.out.println("-----------------------------");
	    System.out.println(palindromo4);
	    System.out.println(elvl1.palindromo(palindromo4));
	    System.out.println("-----------------------------");
	} else if (ej == 13) {
	    String isograma1 = "Abcd efg hijk";
	    String isograma2 = "Murciélago";
	    String isograma3 = "Esto no es un isograma";
	    System.out.println("-----------------------------");
	    System.out.println("Isograma:");
	    System.out.println("-----------------------------");
	    System.out.println(isograma1);
	    System.out.println(elvl1.isograma(isograma1));
	    System.out.println("-----------------------------");
	    System.out.println(isograma2);
	    System.out.println(elvl1.isograma(isograma2));
	    System.out.println("-----------------------------");
	    System.out.println(isograma3);
	    System.out.println(elvl1.isograma(isograma3));
	    System.out.println("-----------------------------");
	} else if (ej == 14) {
	    System.out.println("-----------------------------");
	    System.out.println("Calendario:");
	    System.out.println("-----------------------------");
	    System.out.println("Mes empieza en Sabado");
	    elvl1.calendario(6);
	    System.out.println("-----------------------------");
	    System.out.println("Mes empieza en Miércoles");
	    elvl1.calendario(3);
	    System.out.println("-----------------------------");
	} else if (ej == 15) {
	    char[][] palabras1 = {
		{'P', 'A', 'T', 'A'},
		{'P', 'A', 'T', 'O'},
		{'R', 'A', 'T', 'O'},
		{'R', 'A', 'M', 'O'},
		{'G', 'A', 'M', 'O'},
		{'G', 'A', 'T', 'O'},
		{'M', 'A', 'T', 'O'}
	    };
	    char[][] palabras2 = {
		{'P', 'A', 'T', 'A'},
		{'P', 'A', 'T', 'O'},
		{'R', 'A', 'T', 'A'},
		{'R', 'A', 'M', 'O'},
		{'G', 'A', 'M', 'O'},
		{'G', 'A', 'T', 'O'},
		{'M', 'A', 'T', 'O'}
	    };
	    System.out.println("-----------------------------");
	    System.out.println("Escalera de Palabras:");
	    System.out.println("-----------------------------");
	    elvl2.escaleraPalabras(palabras1);
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    elvl2.escaleraPalabras(palabras2);
	    System.out.println("-----------------------------");
	} else if (ej == 16) {
	    String ADN1 = "ACGT";
	    String ADN2 = "TGCA";
	    String ADN3 = "A-C-G-T-ACGT";
	    String ADN4 = "TTGGCCAATGCA";
	    String ADN5 = "AAAAAAAA";
	    String ADN6 = "TTTATTTT";
	    String ADN7 = "GATTACA";
	    String ADN8 = "CTATT-T";
	    String ADN9 = "CAT-TAG-ACT";
	    String ADN10 = "GTATATCCAAA";
	    String ADN11 = "--------";
	    String ADN12 = "ACGTACGT";
	    String ADN13 = "TAATAA";
	    String ADN14 = "ATTATT";
	    String ADN15 = "GGGA-GAATATCTGGACT";
	    String ADN16 = "CCCTACTTA-AGACCGGT";

	    System.out.println("-----------------------------");
	    System.out.println("Ejercicio ADN");
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("Sin errores:");
	    System.out.println(ADN1);
	    System.out.println(ADN2);
	    System.out.println("-----------------------------");
	    System.out.println("Errores: " + elvl2.costeErroresADN(ADN1, ADN2));
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("Cuatro nucleótidos sin casar:");
	    System.out.println(ADN3);
	    System.out.println(ADN4);
	    System.out.println("-----------------------------");
	    System.out.println("Errores: " + elvl2.costeErroresADN(ADN3, ADN4));
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("Una mutación puntual:");
	    System.out.println(ADN5);
	    System.out.println(ADN6);
	    System.out.println("-----------------------------");
	    System.out.println("Errores: " + elvl2.costeErroresADN(ADN5, ADN6));
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("Una mutación puntual, un nucleótido sin casar:");
	    System.out.println(ADN7);
	    System.out.println(ADN8);
	    System.out.println("-----------------------------");
	    System.out.println("Errores: " + elvl2.costeErroresADN(ADN7, ADN8));
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("Dos mutaciones puntuales, dos nucleótidos sin casar:");
	    System.out.println(ADN9);
	    System.out.println(ADN10);
	    System.out.println("-----------------------------");
	    System.out.println("Errores: " + elvl2.costeErroresADN(ADN9, ADN10));
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("Ocho nucleótidos sin casar:");
	    System.out.println(ADN11);
	    System.out.println(ADN12);
	    System.out.println("-----------------------------");
	    System.out.println("Errores: " + elvl2.costeErroresADN(ADN11, ADN12));
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("Sin errores:");
	    System.out.println(ADN13);
	    System.out.println(ADN14);
	    System.out.println("-----------------------------");
	    System.out.println("Errores: " + elvl2.costeErroresADN(ADN13, ADN14));
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("Dos mutaciones puntuales, dos nucleótidos sin casar:");
	    System.out.println(ADN15);
	    System.out.println(ADN16);
	    System.out.println("-----------------------------");
	    System.out.println("Errores: " + elvl2.costeErroresADN(ADN15, ADN16));
	    System.out.println("-----------------------------");

	} else if (ej == 17) {
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	    System.out.println("-----------------------------");
	} else if (ej == 99) {
	    ejemplo.ejemplosString();
	} else {
	    System.out.println("No se ha encontrado el ejercicio.");
	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	EjerciciosJava ejerJava = new EjerciciosJava();
	
	System.out.print("Introduce un número de ejercicio: ");
	Scanner sc = new Scanner(System.in);
	int ej = sc.nextInt();
	System.out.println();
	ejerJava.menu(ej);
    }

}
