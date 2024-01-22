package InClassExercises_Misc;
import java.util.Scanner;

public class PA30341ControlFlow {
    public static void main(String[] args) {
        //numberOne();
        //numberTwo();
        //numberThree();
        //numberFour();
        //numberFive();
        //numberSix();
        numberSeven();

    }
    public static void numberOne(){
        int x = 15;
        if(x < 10 ){
            System.out.println("Less than 10");
        }
    }
    public static void numberTwo(){
        int x = 15;
        if(x  < 10){
            System.out.println("Less than 10");
        }
        else{
            System.out.println("Greater than 10");
        }
    }
    public static void numberThree(){
        int x = 50;
        if(x<10){
            System.out.println("Less than 10");
        }
        else if(x>10 && x<20){
            System.out.println("Between 10 and 20");
        }
        else{
            System.out.println("Greater than or equal to 20");
        }
    }
    public static void numberFour(){
        int x = 9;
        if(x < 10 | x > 20){
            System.out.println("Out of range");
        }
        else{
            //this is inclusive of 10 and 20 as the above logical is exclusive
            System.out.println("In range");
        }
    }
    public static void numberFive(){
        Scanner sc = new Scanner(System.in);
        double grade = (double)sc.nextDouble();
        if(grade > 90){
            System.out.println("A");
        }
        else if(grade >=80 && grade<90){
            System.out.println("B");
        }
        else if(grade >=70 && grade < 80){
            System.out.println("C");
        }
        else if(grade>=60 && grade<70){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
    public static void numberSix(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer (counting numbers) between 1 - 7 (inclusive): ");
        int userInt = sc.nextInt();
        if(userInt < 1 || userInt > 7){
            System.out.println("Sorry, that wasn't in the range we specified, please try again...");
        }
        else{
            switch(userInt){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }
    }
    public static void numberSeven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - 'Single'\n2 - 'Married Filing Jointly'\n3 - 'Married Filing Separately' \n4 - 'Head of Household'\nPlease enter one of the corresponding numbers to identify your filing Status :");
        int filingStatus = sc.nextInt();
        double taxesOwed;
        final double TIER1 = .10, TIER2 = .15, TIER3 = .25, TIER4 = .28, TIER5 = .33, TIER6 = .35;
        if(filingStatus >=1 && filingStatus<=4){
            System.out.println("Please enter your salary using only digits with none of the following [$, . , ,]: ");
            double salary = sc.nextDouble();
            if(salary < 0){
                System.out.println("Please enter a valid salary and try again. A salary less than zero will not compute.");
            }
            else if(filingStatus == 1){
                if(salary <= 8350){
                    taxesOwed = salary * TIER1;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if(salary>=8351 && salary<=33950){
                    taxesOwed = salary * TIER2;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if(salary>=33951 && salary<=82250){
                    taxesOwed = salary * TIER3;
                    System.out.println("You owe " + taxesOwed + " in taxes.");

                }
                else if((salary>=82251 && salary<=171550)){
                    taxesOwed = salary * TIER4;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=171551 && salary<=372950)){
                    taxesOwed = salary * TIER5;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else{
                    taxesOwed = salary * TIER6;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }

            }
            else if(filingStatus == 2){
                if(salary <= 16700){
                    taxesOwed = salary * TIER1;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if(salary>=16701 && salary<=67900){
                    taxesOwed = salary * TIER2;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=67901 && salary<=137050)){
                    taxesOwed = salary * TIER3;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=137051 && salary<=208850)){
                    taxesOwed = salary * TIER4;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=208851 && salary<=372950)){
                    taxesOwed = salary * TIER5;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else{
                    taxesOwed = salary * TIER6;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
            }
            else if(filingStatus == 3){
                if(salary <= 8350){
                    taxesOwed = salary * TIER1;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if(salary<=8351 && salary>=33950){
                    taxesOwed = salary * TIER2;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=33951 && salary<=68525)){
                    taxesOwed = salary * TIER3;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=68526 && salary<=104425)){
                    taxesOwed = salary * TIER4;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=104426 && salary<=186475)){
                    taxesOwed = salary * TIER5;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else{
                    taxesOwed = salary * TIER6;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
            }
            else{
                if(salary <= 11950){
                    taxesOwed = salary * TIER1;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=11951 && salary<=45500)){
                    taxesOwed = salary * TIER2;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=45501 && salary<=117450)){
                    taxesOwed = salary * TIER3;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=117451 && salary<=190200)){
                    taxesOwed = salary * TIER4;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else if((salary>=190201 && salary<=372950)){
                    taxesOwed = salary * TIER5;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
                else{
                    taxesOwed = salary * TIER6;
                    System.out.println("You owe " + taxesOwed + " in taxes.");
                }
            }

        }
        else{
            System.out.println("The number you entered for filing status was not in the range we specified. Please enter a value in the range of 1-4 (inclusive). Please try again.");
        }
    }
}
