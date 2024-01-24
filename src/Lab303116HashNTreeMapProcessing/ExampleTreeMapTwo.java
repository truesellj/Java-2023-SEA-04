package Lab303116HashNTreeMapProcessing;
import java.util.TreeMap;

public class ExampleTreeMapTwo {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First",1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        //using the firstKey() method:
        String firstKey = numbers.firstKey();
        System.out.println("First Key: "+ firstKey);
        //using the lastKey() method:
        String lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        //using the firstEntry() method:
        System.out.println("First Entry: " + numbers.firstEntry());

        //using the lastEntry() method:
        System.out.println("Last Entry: " + numbers.lastEntry());
    }
}
