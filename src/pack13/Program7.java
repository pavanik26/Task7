package pack13;

import java.util.ArrayList;
import java.util.List;

public class Program7 {
	
	public static void main(String[] args) {
        // Step 1: Create and populate a List
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("kiwi");

        // Step 2: Convert List to Array
        // Specify the type of the array
        String[] stringArray = new String[stringList.size()];
        stringList.toArray(stringArray);

        // Print the array elements
        System.out.println("Array elements:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }

}
