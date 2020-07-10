package arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Examples {

    public static void main(String[] args){

        List<Integer> integer_list = new ArrayList<>();

        integer_list.add(5);
        integer_list.add(5);
        integer_list.add(10);
        integer_list.add(20);
        integer_list.add(30);

        if(integer_list.contains(5))
            System.out.println("The list contains the number five");

        System.out.println("The list has " + integer_list.size() + " elements");

        if(integer_list.isEmpty())
            System.out.println("The list is empty");
        else
            System.out.println("My first element is" + integer_list.get(0));

        integer_list.clear();
        System.out.println("The clear method emptied me");

        /* The arraylist has the same methods than a list */

        // the number defines the initial capacity
        ArrayList<String> arrayList = new ArrayList<>(4);

        arrayList.add("I must be a string");

        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Something"));
        System.out.println(arrayList.get(0));

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Something");
        System.out.println(arrayList.indexOf("Something"));

        /* The vector works the same */
        Vector<Double> vector = new Vector<>(4);

        vector.add(5.0);
        vector.add(15.0);
        vector.add(50.0);
        vector.add(25.0);

        System.out.println(Arrays.toString(vector.toArray()));
        vector.clear();
    }




}
