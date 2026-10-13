package ies.puerto;

import java.util.Scanner;
/**
 * @author joreokjudev
 * @version 1.0.0
 */
public class Tickets {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int productos = 0;
        float suma = 0;
        System.out.println("Introduce el nombre");
        String nombre = teclado.nextLine();
        System.out.println("¿Cuántos productos vas a comprar?");
        productos = teclado.nextInt();

        for (int i = 1; i <= productos; i++) {
            System.out.println("Producto " + i);
            teclado.nextLine();
            System.out.println("Nombre:");
            String nombreProducto = teclado.nextLine();
            System.out.println("Precio:");
            float precioProducto = teclado.nextFloat();

            System.out.println(nombreProducto +"-"+ precioProducto+" euros");
            System.out.println("Suma: " +precioProducto+ suma +"euros");
            suma = suma + precioProducto;
        }
        teclado.close();
        System.out.println("Gracias por tu compra,"+ nombre +", tu total es de " + suma+" euros");

    }
}
