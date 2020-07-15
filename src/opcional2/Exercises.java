package opcional2;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un palídromo");

        String palindrome = scanner.nextLine()
                .replaceAll(" +", "");

        StringBuilder stringBuilder = new StringBuilder(palindrome);

        String reversed_string = stringBuilder
                .reverse()
                .toString()
                .replaceAll(" +", "");

        boolean condition = palindrome.equalsIgnoreCase(reversed_string);

        if(condition)
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");

    }

    public static void askNumberForMatrix(){
        System.out.println("Mis números UwU\n");

        //Read number from stdin
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número natural");
        String number = scanner.nextLine();

        while (!isNaturalNumber(number)){

            System.out.println("Entrada inválida, ingresa un número natural: ");
            number = scanner.nextLine();

        }

        printNMatrix(Integer.parseInt(number));

    }

    public static boolean isNaturalNumber(String number){
        try {
            if(Integer.parseInt(number) >= 0)
                return true;
        }catch(NumberFormatException e){
            //e.printStackTrace();
        }
        return false;
    }

    public static void printNMatrix (int n){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++)
                stringBuilder.append(j + i * n).append(' ');
            stringBuilder.append('\n');
        }

        System.out.println(stringBuilder);
    }

    public static void readTriangleData(){
        Scanner scanner = new Scanner(System.in);
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
