package exercises;

import java.util.Scanner;

public class Exercises {

    //                                  while exercise

    /*
        While you like me, I don't like you
        While I like you, you don't like me
     */
    public static void doILikeYou(){
        Scanner scanner = new Scanner(System.in);

        boolean do_i_like_you = false;

        do{
            System.out.println("-Oye, me gustas UwU\n-¿Quieres ser mi novia? y/n");
            if(scanner.nextLine().equalsIgnoreCase("Y")){
                do_i_like_you = true;
                System.out.println("+Sí, me gustas mucho\n-No, ya no quiero nada");
            }else
                System.out.println("Sácate de aquí >:(");
        }while (!do_i_like_you);

        scanner.close();
    }


    //                                  Palindrome example

    /*
        This method says if a String if a palindrome or not
     */
    public final void checkPalindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type something to verify if it's a palindrome");

        String text = scanner.nextLine();
        Exercises examples = new Exercises();

        String reversed = examples.reverseString(text);

        if(text.equalsIgnoreCase(reversed)){
            System.out.println("It's a palindrome");
        }else{
            System.out.println("It's not a palindrome");
        }
    }
    /* This method reverse a String */
    public String reverseString(String text){
        String reversed = "";
        for(int i = text.length() -1; i >= 0; i--)
            reversed += text.charAt(i);

        return reversed;
    }

    /* This method reverse a String */
    public String reverseStringWithStringBuilder(String text){
        return  new StringBuilder(text).reverse().toString();
    }


    //                                  do-while exercise

    /*
        This method will ask you to enter a word until you type a
        15 characters length or the text

     */
    public static void until15Characters(){
        Scanner scanner = new Scanner(System.in);
        String text;
        do{
            System.out.println("Enter 15 characters or say you're very very happy when I'm around you");
            text = scanner.nextLine();

            if(text.equalsIgnoreCase("I'm very very happy when you're around me")) {
                System.out.println("Awww me too");
                break;
            }else  if(text.length() == 15){
                System.out.println("Okay");
                break;
            }

        }while (true);
    }

    //                                  Math exercises


    /*
        This method will print the summation from 0 to n
        using the for cycle
     */
    public static void summation(int n){
        int answer = 0;

        for (int i = 1; i <= n; i++)
            // answer = answer + i;
            answer += i;

        System.out.println("Summation: " + answer);
    }
    /*
        This method will print the summation from 0 to n
        using Gauss formula
     */
    public static void summationWithGauss(int until){
        int answer = until * (until + 1) / 2;
        System.out.println("Summation: " + answer);
    }
    /*
        This method prints the factorial of a number
     */
    public static void factorial(byte number){
        if(number < 0) {
            System.out.println("invalid factorial");
            return;
        }
        double factorial = 1;

        while (number > 1)
            factorial *= number--;

        System.out.println(factorial);
    }


}
