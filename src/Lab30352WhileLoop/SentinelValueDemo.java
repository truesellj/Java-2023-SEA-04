package Lab30352WhileLoop;
import java.util.Scanner;

public class SentinelValueDemo {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Read in initial data
        System.out.println("Enter an int value (the program exits if the input is 0): " );
        int data = input.nextInt();
        //keep reading data until the input is 0
        int sum = 0;
        while(data != 0){
            sum += data;
            //read the next data
            System.out.println("Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt();
        }
        System.out.println("The Sum is " + sum);
    }
}
