package PA30371Arrays;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        //declare new array of 5 integers - don't assign then yet
        int[] task5 = new int[5];
        //loop through array indexes and assign the values
        //add "1" to each so we get the standard 1-5
        for(int i = 0;i < task5.length;i++)task5[i] = i+1;
        //print the array
        System.out.println(Arrays.toString(task5));
    }
}
