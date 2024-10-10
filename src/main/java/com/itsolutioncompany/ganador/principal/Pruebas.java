package com.itsolutioncompany.ganador.principal;

import com.itsolutioncompany.ganador.test.CalcularTotalSorteos01;
import org.testng.annotations.Test;

public class Pruebas {


    @Test
    public void Pruebas001 () {
        System.out.printf("Total de días : " + CalcularTotalSorteos01.TotalDias() + 1 );

    }
}
