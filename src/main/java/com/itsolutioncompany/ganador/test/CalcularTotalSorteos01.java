package com.itsolutioncompany.ganador.test;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
import java.util.stream.Stream;

public class CalcularTotalSorteos01 {

    public static void main (String [] args){

        System.out.println("Total de Días : " + TotalDias());

    }

    private static long countDaysBetween(LocalDate start, LocalDate end, DayOfWeek dayOfWeek) {
        return Stream.iterate(start, date -> date.plusDays(1))
                .limit(ChronoUnit.DAYS.between(start, end) + 1)
                .filter(date -> date.getDayOfWeek() == dayOfWeek)
                .count();
    }

    public static int TotalDias(){
        int total =0;
        // Definir las fechas de inicio
        LocalDate startForSundays = LocalDate.of(1994, 10, 16);
        LocalDate startForWednesdays = LocalDate.of(2004, 5, 19);
        LocalDate end = LocalDate.now(); // Fecha actual

        // Contar domingos y miercoles
        long sundaysCount = countDaysBetween(startForSundays, end, DayOfWeek.SUNDAY);
        long wednesdaysCount = countDaysBetween(startForWednesdays, end, DayOfWeek.WEDNESDAY);

        long totalDays = sundaysCount + wednesdaysCount;

       // System.out.println("Numero de domingos desde el " + startForSundays + " hasta el " + end + ": " + sundaysCount);
        //System.out.println("Numero de miercoles desde el " + startForWednesdays + " hasta el " + end + ": " + wednesdaysCount);

        //System.out.println("Suma total de domingos y miercoles: " + totalDays);

        total = (int) totalDays;


        return total;
    }
}
