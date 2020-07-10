package arrayListExample;

import java.util.Arrays;

public class ValidationsWithScanner {

    protected static boolean printArray(){

        try{
            String[] array = {"1","2","3","a"};

            nothingTooImportant("a");

            for (int i = 0; i < 10; i++)
                System.out.print(Integer.parseInt(array[i]) + ", ");

        }catch (Exception exception){
            System.out.println("\nCuidado, sucedió algo malo");

            System.out.println(exception.getMessage());
            exception.printStackTrace();

            return false;
        }finally {
            System.out.println("Programa finalizado");
        }

        return true;
    }

    public static void nothingTooImportant(String txt){
        Integer.parseInt(txt);

    }

}
