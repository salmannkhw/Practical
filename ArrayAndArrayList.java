import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {
    public static void main (String [] args) {

        //  ******************    Declarations    ******************

        String [] fruitsNull = new String[4];       //   [4] is size of array and not index
        String [] fruits = {"Apple", "Banana", "Chickoo", "Dates"};

        ArrayList<String> flowersNull = new ArrayList<>();
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList("Rose", "Marigold", "Lily", "Hibiscus"));


        //  ******************    printing    ******************

        System.out.println("--- This is Null array of String ---");
        for (int i = 0; i < fruitsNull.length; i++) {
            System.out.println(fruitsNull[i]);
        }
        System.out.println("\n--- This is filled Array of String ---");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("\n\n--- This is Null ArrayList ---");
        System.out.println(flowersNull);
        System.out.println("\n--- This is filled ArrayList ---");
        System.out.println(flowers);


        //  ******************    Get element    ******************

        System.out.println("This is the second element of the Array " + fruits[1]);
        System.out.println("This is the second element of the ArrayList: " + flowers.get(1));


        //  ******************    Get Size    ******************
        System.out.println("Size of the Array is: " + fruits.length);
        System.out.println("Size of the ArrayList is: " + flowers.size());


        //  ******************    Add element at end    ******************

        // Cannot do it with Arrays as the size if fix
        flowers.add("Tulips");
        System.out.println(flowers);

        //  ******************    set element at end    ******************

        fruits[3] = "Dragon fruit";
        System.out.println(fruits[3]);
        flowers.set(4, "Daisy");        //  index, entry
        System.out.println(flowers);

        //  ******************    Remove element    ******************

        // Cannot do it with Arrays as the size if fix
        flowers.remove(4);               //  by using index
        flowers.remove("Rose");           //  by using Entry
        System.out.println(flowers);
    }
}