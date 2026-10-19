package ies.puerto;

import java.util.Scanner;

/**
 * @author joreokjudev
 * @version 1.0.0
 */

    public class AppAhorro {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);


            System.out.println("====================================");
            System.out.println("       SIMULADOR DE AHORRO");
            System.out.println("====================================");

            System.out.print("Introduce tu nombre: ");
            String nombre = teclado.nextLine();

            float ahorroInicial = -1;

            while (ahorroInicial < 0) {
                System.out.print("¿Cuánto dinero tienes ahorrado? ");


                if (!teclado.hasNextFloat()) {
                    System.out.println("Error: Introduce un número válido.");
                    teclado.next();
                }


                if (teclado.hasNextFloat()) {
                    ahorroInicial = teclado.nextFloat();


                    if (ahorroInicial < 0) {
                        System.out.println("Error: El ahorro inicial no puede ser negativo.");
                    }
                }
            }
            teclado.nextLine();

            System.out.println("\nHola, " + nombre + ".");


            int aportacionesValidas = 0;
            float totalAportado = 0f;
            float ahorroActual = ahorroInicial;
            String respuesta;


            do {
                float aportacion = 0;
                boolean aportacionValida = false;


                while (!aportacionValida) {
                    System.out.print("Introduce una cantidad para ahorrar: ");


                    if (!teclado.hasNextFloat()) {
                        System.out.println("Error: Introduce un número válido.");
                        teclado.next();
                    }


                    if (teclado.hasNextFloat()) {
                        aportacion = teclado.nextFloat();


                        if (aportacion > 0) {
                            aportacionValida = true;
                        }


                        if (aportacion <= 0) {
                            System.out.println("Error: La cantidad debe ser mayor que cero.");
                        }
                    }
                }
                teclado.nextLine();


                aportacionesValidas++;
                totalAportado += aportacion;
                ahorroActual += aportacion;

                System.out.printf("Aportación registrada. Ahorro actual: %.2f euros%n", ahorroActual);


                System.out.print("\n¿Deseas realizar otra aportación? (S/N): ");
                respuesta = teclado.nextLine().trim();

            } while (respuesta.equalsIgnoreCase("S"));


            System.out.println("\n====================================");
            System.out.println("          RESUMEN DEL AHORRO");
            System.out.println("====================================");
            System.out.println("Usuario: " + nombre);
            System.out.printf("Ahorro inicial: %.2f euros%n", ahorroInicial);
            System.out.println("Aportaciones realizadas: " + aportacionesValidas);
            System.out.printf("Total aportado: %.2f euros%n", totalAportado);
            System.out.printf("Ahorro final: %.2f euros%n", ahorroActual);
            System.out.println("====================================");

            teclado.close();
        }
    }
