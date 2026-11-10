package es.educacion.arrays;

/**
 * @author joreokjudev
 * @version 1.0.0
 */
public final class Ejercicio04ContarAprobados {
    private Ejercicio04ContarAprobados() { }

    public static void main(String[] args) {
        int[] notas = {5,2,1,10,8};
        int aprobados = contarAprobados(notas);
        System.out.println("Numero de aprobados = " +aprobados);
    }

    public static int contarAprobados(int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException();
        }
        int aprobados = 0;
        for (int nota:notas) {
            if (nota >= 5) {
                aprobados = aprobados +1;
            }
        }
        return aprobados;
    }

    public static int contarSuspenso(int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException();
        }
        int suspensos = 0;
        for (int nota:notas) {
            if (nota < 5) {
                suspensos = suspensos +1;
            }
        }
        return suspensos;
    }

    public static int contarSuspensoTop(int[] notas) {
        return - contarAprobados(notas)+notas.length;
    }
}
