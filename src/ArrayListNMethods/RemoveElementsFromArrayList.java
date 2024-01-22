package ArrayListNMethods;
import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

public class RemoveElementsFromArrayList {
    public static void main(String[] args){
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial list: " + programmingLanguages);

        //remove the element at index 5:
        programmingLanguages.remove(5);
        System.out.println("After we removed the 5th element from the ArrayList, here are our results: " + programmingLanguages);
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);

        //remove all elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");
        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

        //remove all elements from the array list
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);


    }
}
