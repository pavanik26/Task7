package pack13;

import java.util.ArrayList;


public class Program5 {
	
	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<>();		
		
		str.add("apple");
		str.add("banana");
		str.add("kiwi");
		str.add("orange");
		str.add("pears");
		str.add("pomogranate");
		// Display the ArrayList before removing elements
        System.out.println("ArrayList before clearing: " + str);

        // Remove all elements
        str.clear();

        // Display the ArrayList after removing elements
        System.out.println("ArrayList after clearing: " + str);
		
	}

}
