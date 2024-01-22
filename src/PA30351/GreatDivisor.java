package PA30351;
import java.util.Scanner;

public class GreatDivisor {
    public static void main(String[] args) {
        /*Algorithm***
        * go from 1 -> the number checking for divisors
        * nest loop which would go through the first loop checking for divisors
        * compare the latest divisor or inner loop to current divisor of outer loop
        * if the divisor is common store it if it is bigger then the last stored value
        * */
        //create scanner
        Scanner sc = new Scanner(System.in);
        //declare integetr variables to store the user's two numbers
        int numOne = 0, numTwo = 0,outerDivisor, commonDivisor = 1;
        System.out.println("Please enter your first counting number: ");
        numOne = sc.nextInt();
        System.out.println("Please enter your second counting number: ");
        numTwo = sc.nextInt();
        //create loop to go through all divisors of numOne
        for(int i = 2; i < numOne + 1; i++){
            if(numOne % i == 0){
                outerDivisor = i;
                //create loop to go through all divisors of numTwo
                for(int j=2;j< numTwo+1;j++){
                    if(numTwo%j == 0){
                        if(j == outerDivisor && j > commonDivisor){
                            commonDivisor = j;
                        }
                    }
                }
            }
        }
        System.out.println("Greatest Common Divisor: " + commonDivisor);

    }
}
