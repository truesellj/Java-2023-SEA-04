package InClassExercises_Misc;
import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your body eight in lbs:");
        int bodyLbs = sc.nextInt();
        double bodyKg = bodyLbs / 2.2046;
        System.out.print("\nPlease enter your height in format n'n:");
        String height = sc.next();
        String[] ftAndInches = height.split("'");
        double metersHeight = ((Integer.parseInt(ftAndInches[0]) *12) + Integer.parseInt(ftAndInches[1]))*0.0254;
        //0.0254
        //2.2046
        double bmi = bodyKg / (metersHeight*2);
        System.out.format("Your BMI is: %.2f", bmi);

    }
}
