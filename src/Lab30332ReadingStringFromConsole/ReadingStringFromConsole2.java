package Lab30332ReadingStringFromConsole;

import java.util.Scanner;

public class ReadingStringFromConsole2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character you entered was: " + ch);

    }
}
