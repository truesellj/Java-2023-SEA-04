package Lab30331JavaStringMethods;
import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";
        String[] result = vowels.split("::");
        System.out.println("result = " + Arrays.toString(result));
    }
}
