package CoreJavaVariable;

//This program will add two numbers, one of type double, one of type int
//The result will have to be stored in a double type variable so that we dont lose precision
public class AddDiffTypes {
    public static void main(String[] args) {
        int firstNum = 152;
        double secondNum = 2.1;
        double product = firstNum + secondNum;
        System.out.println(Integer.toString(firstNum) + " + " + Double.toString(secondNum) + " = " + Double.toString(product));
    }
}
