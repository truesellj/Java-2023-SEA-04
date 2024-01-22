package CoreJavaVariable;
//This program will divide two integer numbers
public class DivideTwoNums {
    public static void main(String[] args) {
        int firstNum = 24;
        int secondNum = 4;
        int dividend = firstNum / secondNum;
        System.out.println("Lets try dividing " + Integer.toString(firstNum) + " by " + Integer.toString(secondNum) + ". \nIt looks like the answer would be: " + Integer.toString(dividend));
        //change the larger number to a decimal
        // do this by storing it in a new variable of type double
        // and assigning it to the variable name of the larger integer.
        double firstNumD = secondNum;
        System.out.println(firstNumD);
    }
}
