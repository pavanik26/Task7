package pack13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Program6 {
	
	public static void main(String[] args) {
        // Step 1: Create the TreeMap and populate it with employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();
        employeeMap.put(1001, "Alice");
        employeeMap.put(1002, "Bob");
        employeeMap.put(1003, "Roma");
        employeeMap.put(1004, "Adam");
        employeeMap.put(1005, "Diana");
        employeeMap.put(1006, "Oliver");
        employeeMap.put(1007, "Eve");
        employeeMap.put(1008, "Vlad");
        employeeMap.put(1009, "Nikki");
        

        // Step 2: Retrieve the names and store them in an ArrayList
        ArrayList<String> namesList = new ArrayList<>(employeeMap.values());

        // Step 3: Sort the names in alphabetical order
        Collections.sort(namesList);

        // Step 4: Print the names
        System.out.println("Employee names in alphabetical order:");
        for (String name : namesList) {
            System.out.println(name);
        }
	}

}
