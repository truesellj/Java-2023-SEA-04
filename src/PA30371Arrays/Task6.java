package PA30371Arrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] thisArr = new int[5];
        for(int i = 0; i < thisArr.length;i++){
            thisArr[i] = i*2;
        }
        System.out.println(Arrays.toString(thisArr));
    }
}
