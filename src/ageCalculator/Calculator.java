package ageCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Calculator {
    /*
        PascalCase   -> Clase e instancias
        camelCase    -> Método
        snake_case   -> variable

     */

    protected double sum(double a, double b){
        return a + b;
    }

    protected double subtract(double a, double b){
        return a - b;
    }

    protected double product(double a, double b){
        return a * b;
    }

    protected void division(double a, double b){
        if (b == 0){
            System.out.println("No dividas 0 entre 0, me lastimas :c");
            return;
        }
        System.out.println(a / b);
    }

    protected void sayMyAge(int year, int month, int day){

        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(year, month, day);

        Period my_age = birth.until(today);

        System.out.println("Tengo " + my_age.getYears() + " años, "
                + my_age.getMonths() + " meses, " + my_age.getDays() + " días" );

        System.out.println("Tengo " + ChronoUnit.DAYS.between(birth, today) + " días");
    }

}
