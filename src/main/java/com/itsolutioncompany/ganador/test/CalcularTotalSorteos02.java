package com.itsolutioncompany.ganador.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

public class CalcularTotalSorteos02 {

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
        int total =0; //10/05/2014
        // Definir las fechas de inicio
        LocalDate startForTuesday = LocalDate.of(2014, 05, 10);
        LocalDate startForWednesdays = LocalDate.of(2014, 05, 10);
        LocalDate startForSaturday = LocalDate.of(2014, 05, 10);
        LocalDate end = LocalDate.now(); // Fecha actual

        // Contar domingos y miercoles
        long sundaysCount = countDaysBetween(startForTuesday, end, DayOfWeek.TUESDAY);
        long wednesdaysCount = countDaysBetween(startForWednesdays, end, DayOfWeek.WEDNESDAY);
        long SaturdayCount = countDaysBetween(startForSaturday, end, DayOfWeek.SATURDAY);

        long totalDays = sundaysCount + wednesdaysCount +SaturdayCount;

       // System.out.println("Numero de domingos desde el " + startForSundays + " hasta el " + end + ": " + sundaysCount);
        //System.out.println("Numero de miercoles desde el " + startForWednesdays + " hasta el " + end + ": " + wednesdaysCount);

        //System.out.println("Suma total de domingos y miercoles: " + totalDays);

        total = (int) totalDays;


        return total;
    }
}
