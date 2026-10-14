package ies.puerto;

import java.util.Scanner;

/**
 * @author joreokjudev
 * @version 1.0.0
 */
public class Tickets2 {


    public static double kmAMetros(double valor) {
        return valor * 1000;
    }

    public static double metrosACentimetros(double valor) {
        return valor * 100;
    }

    public static double kmAMillas(double valor) {
        return valor * 0.621371;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double resultado = 0;
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        int contador = 0;


        while (opcion != 4) {
            System.out.println("=== Menu ===");
            System.out.println("1. Kilometros a metros");
            System.out.println("2. Metros a centimetros");
            System.out.println("3. Kilometros a millas");
            System.out.println("4. Salir");
            System.out.println("Elija una opcion ");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Ingresa el valor");
                double valor = scanner.nextDouble();

                resultado = kmAMetros(valor);
                System.out.println("Metros=" + resultado);
                contador++;
            }
            if (opcion == 2) {
                System.out.println("Ingresa el valor");
                double valor = scanner.nextDouble();

                resultado = metrosACentimetros(valor);
                System.out.println("Centimetros=" + resultado);
                contador++;
            }
            if (opcion == 3) {
                System.out.println("Ingresa el valor");
                double valor = scanner.nextDouble();

                resultado = kmAMillas(valor);
                System.out.println("Millas=" + resultado);
                contador++;
            }
            if (opcion == 4) {
                System.out.println("Usuario:" +nombre);
                System.out.println("Numero de conversiones:" + contador );
                System.out.println("Gracias por usar DAM-PRO");
                return;

            }

        }

    }
}