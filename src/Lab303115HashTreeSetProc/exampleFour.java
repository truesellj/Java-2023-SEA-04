package Lab303115HashTreeSetProc;
import java.util.HashSet;
public class exampleFour {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<String>();

        //add elements to the HashSet
        hSet.add("Apple");
        hSet.add("Mango");
        hSet.add("Grapes");
        hSet.add("Orange");
        hSet.add("Fig");
        //addition of dupliucate elements
        hSet.add("Apple");
        hSet.add("Mango");
        //addition of null values:
        hSet.add(null);
        hSet.add(null);
        //use advanced for loop:
        for(String s: hSet){
            System.out.println(" ---> " + s);
        }
    }
}
