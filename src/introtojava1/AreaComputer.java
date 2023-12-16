package introtojava1;
/*This class allows the calculation of the area of a circle
using radius
*/
public class AreaComputer {
    //This is the entry point into the JVM
    public static void main(String[] args){
        //Declare our variables:
        double radius; //one of the 'integral' types
        //for when we need a decimal value
        double area;
        //Assign a value
        radius = 20;
        final double PI = 3.14159;
        final double PI2 = Math.PI;
        //the above two are constants, hence 'final'
        //i.e. they cannot be changed

        //compute area:
        area = radius * radius * 3.14159;

        //display results
        System.out.println("The area for the circle of " + "radius " + radius + " is " + area);

        String result;
        String myResult;
        String _result;
        String my_result;
        String STATIC = "This is allowed even though this variables name is a reserved word. This is becuase Java is case sensitive, and this is not the same case as the actual reserved word.";

        boolean yesOrNo = true;
        boolean trueOrFalse = false;

        float aFloat = 1.001f;
        char yourLetter = 'A';
        //you can only use single quotes for characters in JAVA
        //strings use double quotation marks


    }
}


