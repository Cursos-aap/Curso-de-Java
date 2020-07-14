package opcional2;

import java.util.ArrayList;

public class OptionalClass3 {

    public static void fibonacciSeries(){
        short index = 40;
        ArrayList<Long> fibonacci_list = new ArrayList<>();
        fibonacci_list.add((long) 0);
        fibonacci_list.add((long) 1);

        long number;
        for (int i = 2; i < index; i++) {
            number = fibonacci_list.get(i - 1) + fibonacci_list.get(i - 2);
            fibonacci_list.add(number);
        }
        System.out.println(fibonacci_list);

    }

    public static void sumDigitsUntilLength1(){

        long number = Long.MAX_VALUE; //9223372036854775807

        String number_str = Long.toString(number);

        while (number_str.length() > 1)
            number_str = sumDigits(number_str);

        System.out.println(number_str);

    }

    public static String sumDigits(String number_str){
        int suma = 0;
        for (int i = 0; i < number_str.length(); i++)
            suma += Integer.parseInt(String.valueOf(number_str.charAt(i)));

        return String.valueOf(suma);
    }

}
