package ies.puerto.es;

/**
 * @author joreokjudev
 * @version 1.0.0
 */

import java.util.Scanner;

public class SumaDigitos {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero:");
        String numero = teclado.nextLine();
        System.out.println("La suma es:"+sumarDigitos(numero));
    }

    /**
     * Funcion para sumar digitos de un numero
     * @param numero String del valor de los digitos
     * @return suma total de los digitos del numero
     */
    static int sumarDigitos(String numero) {
        if (numero == null || numero.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);
            if (!Character.isDigit(Integer.parseInt(String.valueOf(caracter)))) {
                suma = suma + Integer.parseInt(String.valueOf(caracter));
            }
        }
        return suma;
    }
}
