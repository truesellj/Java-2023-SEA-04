package PA30371Arrays;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        //4,2,9,13,1,0
        int[] fiveNumbers = {4,2,9,13,1,0};
        int inOrder = 0;
        int smallest = fiveNumbers[0];
        int largest = fiveNumbers[0];
        while(inOrder<5){
            for(int i = 0; i < fiveNumbers.length -1;i++){
                int temp = 0;
                if(fiveNumbers[i] < smallest){
                    smallest = fiveNumbers[i];
                }
                if(fiveNumbers[i] > largest){
                    largest = fiveNumbers[i];
                }
                if(fiveNumbers[i] > fiveNumbers[i+1]) {
                    temp = fiveNumbers[i];
                    fiveNumbers[i] = fiveNumbers[i+1];
                    fiveNumbers[i+1] = temp;
                    inOrder = 0;
                }
                else inOrder++;
            }
        }
        System.out.println("This is the ordered array" + Arrays.toString(fiveNumbers));
        System.out.println("This was determined to be the largest value: " + largest);
        System.out.println("This was determined to be the smallest value: " + smallest);

    }
}
