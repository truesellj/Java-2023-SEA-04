package PA30371Arrays;

import java.awt.*;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //declare an array of strings
        String[] colors = new String[]{"red", "green", "blue", "yellow"};
        //print the above arrays length
        System.out.println(colors.length);
        //clone the first array into a new array
        String[] colorsCloned = colors.clone();
        //change one value in the original array to see if it is a deep or
        //shallow copy
        colors[1] = "purple";
        //print original array
        System.out.println(Arrays.toString(colors));
        //print colond array
        System.out.println(Arrays.toString(colorsCloned));
    }
}
