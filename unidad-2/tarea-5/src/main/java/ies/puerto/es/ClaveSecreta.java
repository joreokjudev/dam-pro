package ies.puerto.es;

import java.util.Scanner;

public class ClaveSecreta {
    static void main() {
        //o O = 0
        // i I = 2
        // u U = 3
        // e E = *
        // a A = ?
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una vocal para generar una clave:");
        String sPalabra = teclado.nextLine();
        String bGenerarClaveSegura = generarClaveSegura(sPalabra);
        System.out.println("La clave es:"+bGenerarClaveSegura);
    }

    /**
     *  Genera
     * @param sPalabra
     * @return
     */

    static String generarClaveSegura(String sPalabra) {
        String clave = "";

        if (sPalabra == null || sPalabra.isEmpty()) {
            return "";
        }
        sPalabra.replace("a", "?");
        sPalabra.replace("A", "?");
        sPalabra.replace("o", "0");
        sPalabra.replace("O", "0");
        sPalabra.replace("i", "2");
        sPalabra.replace("I", "2");
        sPalabra.replace("e", "*");
        sPalabra.replace("E", "*");
        sPalabra.replace("u", "3");
        sPalabra.replace("U", "3");

        return clave;
    }
}
