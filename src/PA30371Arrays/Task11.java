package PA30371Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //create scanner object
        Scanner sc = new Scanner(System.in);
        //prompt the user for how many favorite things they have
        System.out.println("How many favorite things do you have?");
        int favThingsCount = sc.nextInt();
        //create array large enough to store fav things
        String[] favThings = new String[favThingsCount];
        //loop enough times to store those things in each element of the array
        for(int i = 0; i< favThings.length ; i++){
            //verbal prompt for user
            System.out.println("Please enter one of your favorite things: ");
            favThings[i] = sc.next();
        }
        //verbal feedback
        System.out.println("Your favorite things are: ");
        //print out each item user had input to the array
        for(String s : favThings){
            System.out.print(s + " ");
        }
    }
}
