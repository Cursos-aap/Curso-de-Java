package opcional2;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args){

        //OptionalClass3.sumDigitsUntilLength1();
        OptionalClass3.fibonacciSeries();

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número natural menor a " + Byte.MAX_VALUE);

        if(scanner.hasNextByte()) {
            byte height = scanner.nextByte();
            for (byte i = 1; i <= height; i++){
                for (int j = i; j < height; j++)
                    System.out.print(" ");
                for (byte j = 0; j < i; j++ )
                    System.out.print("*");
                System.out.println();
            }
            //Exercises.printTriangle(scanner.nextByte());
        }
        else
            System.out.println("No es un número");


         */
    }

    public static void printTriangle(byte height){
        if(height < 0){
            System.out.println("Número inválido");
            return;
        }

        StringBuilder str_builder = new StringBuilder();

        for (byte i = 0; i < height; i++) {

            for (byte j = 0; j <= i; j++) {
                str_builder.append('*');
            }
            str_builder.append('\n');
        }

        System.out.println(str_builder);
    }

}
