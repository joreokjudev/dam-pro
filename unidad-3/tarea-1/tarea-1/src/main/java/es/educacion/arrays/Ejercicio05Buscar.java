package es.educacion.arrays;

/**
 * @author joreokjudev
 * @version 1.0.0
 */
public final class Ejercicio05Buscar {
    private Ejercicio05Buscar() { }

    public static void main(String[] args) {


    }

    public static int buscar(int[] numeros, int objetivo) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero == objetivo) {
                return i;
            }
        }
        return -1;
    }
}
