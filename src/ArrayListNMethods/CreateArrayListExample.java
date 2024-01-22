package ArrayListNMethods;
import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        //create an ArrayList of Strings
        List<String> animals = new ArrayList<>();

        //adding new elements to the arraylist
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        //adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        System.out.println(animals);
    }
}
