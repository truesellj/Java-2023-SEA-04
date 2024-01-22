package PA30371Arrays;

import java.util.Arrays;

public class Task8{
    public static void main(String[] args) {
        String[] arrayEight = new String[]{"Mary", "had", "a", "little", "Lamb"};
        int middleIndex = arrayEight.length / 2;
        for(int i = 0; i<arrayEight.length;i++){
            if( i == middleIndex){
                String tempString = arrayEight[i];
                arrayEight[i] = arrayEight[0];
                arrayEight[0] = tempString;
            }
        }
        System.out.println(Arrays.toString(arrayEight));
    }

}
