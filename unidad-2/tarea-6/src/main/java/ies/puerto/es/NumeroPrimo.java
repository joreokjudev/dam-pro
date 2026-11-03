package ies.puerto.es;

import java.util.Scanner;

/**
 * @author joreokjudev
 * @version 1.0.0
 */
public class NumeroPrimo {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero:");
        String sNumero = teclado.nextLine();
        System.out.println("Es primo:"+esPrimo(sNumero));
    }

    static boolean esPrimo(String sNumero) {
        int numero = 0;
        if (numero < 2) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= numero ; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
