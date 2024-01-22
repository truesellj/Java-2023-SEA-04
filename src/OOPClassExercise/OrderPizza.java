package OOPClassExercise;
import java.util.Scanner;

public class OrderPizza {
    public static void main(String[] args) {
        //must order 3 pizzas
        Scanner sc = new Scanner(System.in);
        Pizza[] aPizzaOrder = new Pizza[2];
        for(int i = 0; i < 2;i++){
            String decision, size;
            int cheese, pepperoni, ham;
            System.out.println("Would you like to order a pizza? Y/n : ");
            decision = sc.next();
            if(decision.compareTo("Y") == 0){
                aPizzaOrder[i] = new Pizza();
                System.out.println("Would you like a small, medium, or large? ");
                size = sc.next();
                aPizzaOrder[i].setPizzaSize(size);
                System.out.println("How many cheese toppings would you like?" );
                cheese = sc.nextInt();
                aPizzaOrder[i].setCheeseToppings(cheese);
                System.out.println("How many pepperoni toppings would you like? ");
                pepperoni = sc.nextInt();
                aPizzaOrder[i].setPeppToppings(pepperoni);
                System.out.println("How many ham toppings would you like? ");
                ham = sc.nextInt();
                aPizzaOrder[i].setHamToppings(ham);
            }
            else{
                break;
            }
        }
        System.out.println(Pizza.calcTotal(aPizzaOrder));

    }


}
