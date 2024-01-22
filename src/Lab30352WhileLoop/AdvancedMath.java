package Lab30352WhileLoop;

import java.util.Scanner;

public class AdvancedMath {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);

        while(count < NUMBER_OF_QUESTIONS){
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            //swap #'s if needed
            if(number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            //prompt for user
            System.out.println("What is " + number1 + " - " + number2 + "?");
            int answer = input.nextInt();
            //grade answer -> display output
            if(number1 - number2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }
            else{
                System.out.println("Your answer was wrong");
            }
            //Increase count
            count++;
            output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? "correct" : "wrong");
        }
    }
}
