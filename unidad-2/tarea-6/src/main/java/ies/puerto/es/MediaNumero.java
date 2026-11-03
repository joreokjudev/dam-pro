package ies.puerto.es;


import java.util.Scanner;

/**
 * @author joreokjudev
 * @version 1.0.0
 */
public class MediaNumero {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        String sNumero = teclado.nextLine();
        double resultado = calcularMedia(sNumero);
        System.out.println("La media es = "+resultado);
    }

    /**
     * Funcion para calcular la media de un parametro de numeros
     * @param numeros String documenta los numeros
     * @return Documenta el valor devuelto
     */
    static double calcularMedia(String numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (int i = 0; i < numeros.length(); i++) {
            char cNumero = numeros.charAt(i);
            String sNumero = String.valueOf(cNumero);
            int numero = Integer.parseInt(sNumero);
            suma = suma +numero;
        }
        int totalNumeros = numeros.length();
        return suma/numeros.length();
    }
}
