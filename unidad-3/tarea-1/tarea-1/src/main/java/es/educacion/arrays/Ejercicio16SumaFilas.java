package es.educacion.arrays;

/**
 * @author joreokjudev
 * @version 1.0.0
 */
public final class Ejercicio16SumaFilas {
    private Ejercicio16SumaFilas() { }

    public static void main(String[] args) {

    }


    public static int[] sumarFilas(int[][] matriz) {
        if (matriz == null) {
            throw new IllegalArgumentException();
        }
        int[] resultado = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            int[] fila = matriz[i];
            if (fila == null) {
                throw new IllegalArgumentException();
            }
            /**
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila = sumaFila +j;
            }
             **/
            for (int columna:fila) {
                sumaFila += columna;
            }
            resultado[i] = sumaFila;
        }
        return resultado;
    }
}
