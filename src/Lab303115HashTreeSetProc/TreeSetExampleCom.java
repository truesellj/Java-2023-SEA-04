package Lab303115HashTreeSetProc;
import java.util.TreeSet;
public class TreeSetExampleCom {
    public static void main(String[] args) {
        //create a TreeSet w/ user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new cities_comparator());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");


        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of the TreeSet:
        System.out.println("TreeSet: " + cities);
    }
}
