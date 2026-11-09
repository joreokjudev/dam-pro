package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Calcular la fecha de vencimiento
 *
 * @author joreokjudev
 * @version 1.0.0
 */
public final class CalculadoraVencimientos {


    public static void main(String[] args) {
        System.out.println("Pon la fecha que quieras saber cuando se vence:");
        LocalDate calcularVencimiento;
        System.out.println("La fecha de vencimiento es:" +calcularVencimiento);
    }

    /**
     * Funcion para calcular el vencimiento de una fecha
     *
     * @param fecha Fecha inicial
     * @param dias Numero de dias a sumar
     * @param meses Numero de meses a sumar
     * @param anios Numero de años sumar
     * @return LocalDate con la fecha de vencimiento calculada
     */
    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        if (fecha == null) {
            return LocalDate.MIN;
        }
        LocalDate resultado = fecha.plusYears(anios);

        resultado = resultado.plusMonths(meses);

        resultado = resultado.plusDays(dias);
        return resultado;
    }
}
