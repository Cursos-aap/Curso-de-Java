package Exercises;

import java.util.Scanner;
import java.util.stream.LongStream;

public class ApproachingEulerNumber {

    public void init(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an integer number between 20 and 0");

        if(scanner.hasNextByte()){

            // Saving approach level
            byte approach_number = scanner.nextByte();

            // Validating approach
            if(approach_number < 0 || approach_number > 20)
                System.out.println("No UnU");
            else {
                //Calculating euler
                double euler = approachEulerNumber(approach_number);

                System.out.println("euler \u2248 " + euler);
                //Prints the difference between our Euler constant and Java Euler constant
                System.out.println("Difference euler - Java constant = " + ( Math.E - euler ));
            }

        }else
            System.out.println("No UnU");
    }

    private static double factorial(byte number){
        double result = 1;

        for (int i = 2; i <= number; i++)
            result *= i;

        return result;
    }

    private static double approachEulerNumber(byte number){
        double result = 0;

        for (byte i = 0; i <= number; i++)
            result += 1/factorial(i);

        return result;
    }

    /* Another way to calculate a factorial */
    private static long factorialWithLongStream(byte number){
        return LongStream.rangeClosed(1, number).reduce(1, (long x, long y) -> x * y);
    }
}
