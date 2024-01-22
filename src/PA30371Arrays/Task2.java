package PA30371Arrays;

public class Task2 {
    public static void main(String[] args) {
        //declare array
        int[] myArr = new int[]{13,5,7,68,2};
        //determine middle value of array by dividing by two
        double middleValue = (double)myArr.length / 2;
        //cycle through array
        for(int i = 0;i<myArr.length;i++){
            //once the array index - middleValue is between 0 and 1 (inclusive)
            //we can print out the value at that index
            if(((i+1)-middleValue) >= 0 && ((i+1)-middleValue) <= 1){
                System.out.println(myArr[i]);
            }
        }

    }
}
