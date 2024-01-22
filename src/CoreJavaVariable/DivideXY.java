package CoreJavaVariable;

public class DivideXY {
    public static void main(String[] args) {
        //declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y
        int x,y;
        x=5;
        y=6;
        //Declare a variable q and assign y/x to it and print q.
        double q = y/x;
        System.out.println(q);
        //cast y to a double and assign it to q. Print q again.
        q = (double) y;
        System.out.println(q);

    }
}
