package ies.puerto.es;

import java.util.Scanner;

public class ClaveSecreta {
    static void main() {
        // o O = 0
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
     *  Genera una clave cambiando las letras puestas por otros caracteres
     * @param sPalabra
     * @return
     */

    static String generarClaveSegura(String sPalabra) {
        String clave = "";

        if (sPalabra == null || sPalabra.isEmpty()) {
            return "";
        }
        sPalabra = sPalabra.replace("a", "?");
        sPalabra = sPalabra.replace("A", "?");
        sPalabra = sPalabra.replace("o", "0");
        sPalabra = sPalabra.replace("O", "0");
        sPalabra = sPalabra.replace("i", "2");
        sPalabra = sPalabra.replace("I", "2");
        sPalabra = sPalabra.replace("e", "*");
        sPalabra = sPalabra.replace("E", "*");
        sPalabra = sPalabra.replace("u", "3");
        sPalabra = sPalabra.replace("U", "3");

        return sPalabra;
    }
}
