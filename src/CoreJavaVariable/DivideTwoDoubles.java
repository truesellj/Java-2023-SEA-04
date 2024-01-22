package CoreJavaVariable;

public class DivideTwoDoubles {
    public static void main(String[] args) {
        double firstNum = 22.2;
        double secondNum = 2.0;
        double dividend =  firstNum / secondNum;
        System.out.println("When you divide the decimal " + Double.toString(firstNum) + " by " + Double.toString(secondNum) + " you will get "+ Double.toString(dividend));
        //Trying to change the divident to type integer
        int dividendAsInt = (int) dividend;
        System.out.println("When we change a double type to an integer we lose some precision.\nSo the value of the dividend as an integer would be: " + dividendAsInt);


    }
}
