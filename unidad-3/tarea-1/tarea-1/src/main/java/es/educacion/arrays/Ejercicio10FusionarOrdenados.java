package es.educacion.arrays;

/**
 * @author joreokjudev
 * @version 1.0.0
 */
public final class Ejercicio10FusionarOrdenados {
    private Ejercicio10FusionarOrdenados() { }


    public static void main(String[] args) {
        System.out.println();
        int fusionados = 0;

    }
    // Fusiona dos arrays ya ordenados ascendentemente, conservando repetidos, en un array nuevo ordenado. Null: IllegalArgumentException.
    public static int[] fusionar(int[] primero, int[] segundo) {
        if ( primero == null || primero.length == 0 || segundo == null || segundo.length == 0) {
            throw new IllegalArgumentException();
        }

        return new int[0];
    }


}
