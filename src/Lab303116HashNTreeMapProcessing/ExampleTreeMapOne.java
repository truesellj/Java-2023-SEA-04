package Lab303116HashNTreeMapProcessing;

import java.util.TreeMap;

public class ExampleTreeMapOne {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        //remove method with single argument:
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        //remove method with two arguments:
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed?: " + result);
        System.out.println("Updated TreeMap: " + numbers);


    }
}
