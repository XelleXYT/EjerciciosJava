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
public class Ejemplos {
    
    /**
     * Ejercicio de Ejemplos de String
     */
    public void ejemplosString() {
	String cadena1 = "Acaso hubo buhos aca";

	System.out.println(cadena1.charAt(7));
	System.out.println(cadena1.charAt(0));
	System.out.println(cadena1.charAt(cadena1.length() - 1));

	System.out.println(cadena1.substring(6, 9));
	System.out.println(cadena1.substring(11, 16));

	System.out.println(cadena1.substring(17));
	System.out.println(cadena1.substring(17, cadena1.length()));

	String[] arrayPalabras = cadena1.split(" ");
	System.out.println(arrayPalabras[2]);

	System.out.println(cadena1.indexOf('h'));
	System.out.println(cadena1.indexOf("buho"));
    }

}
