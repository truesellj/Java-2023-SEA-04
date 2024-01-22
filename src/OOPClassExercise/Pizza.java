package OOPClassExercise;

public class Pizza {
    public Pizza(){}
    private String pizzaSize;
    private int cheeseToppings;
    private int peppToppings;
    private int hamToppings;
    public double pizzaBasePrice;

    final private int TOPPINGS_COST = 2;



    public Pizza(String pizzaSize, int cheeseToppings, int peppToppings, int hamToppings){
        this.pizzaSize = pizzaSize;
        this.cheeseToppings = cheeseToppings;
        this.peppToppings = peppToppings;
        this.hamToppings = hamToppings;
        switch(this.pizzaSize){
            case "small":
                pizzaBasePrice = 10.00;
                break;
            case "medium":
                pizzaBasePrice = 12.00;
                break;
            case "Large":
                pizzaBasePrice = 14.00;
                break;
        }
    }
    public void setPizzaSize(String pizzaSize){
        this.pizzaSize = pizzaSize;
    }
    public void setCheeseToppings(int cheeseToppings){
        this.cheeseToppings = cheeseToppings;
    }
    public void setPeppToppings(int peppToppings){
        this.peppToppings = peppToppings;
    }
    public void setHamToppings(int hamToppings){
        this.hamToppings = hamToppings;
    }
    public String getPizzaSize(){
        return pizzaSize;
    }
    public int getCheeseToppings(){
        return cheeseToppings;
    }
    public int getPeppToppings(){
        return peppToppings;
    }
    public int getHamToppings(){
        return hamToppings;
    }
    public double calcCost() {
        double pizzaFinalPrice;

        switch(this.pizzaSize.toLowerCase()){
            case "small":
                pizzaBasePrice = 10.00;
                break;
            case "medium":
                pizzaBasePrice = 12.00;
                break;
            case "large":
                pizzaBasePrice = 14.00;
                break;
        }
        pizzaFinalPrice = pizzaBasePrice + (hamToppings+ peppToppings + cheeseToppings) * 2;
        return pizzaFinalPrice;
    }
    public String getPizza(){
        return "You have ordered a " + pizzaSize + " pizza with " + cheeseToppings + " cheese toppings, " + peppToppings + " pepperoni toppings, and " + hamToppings + " ham toppings.";
    }
    public static double calcTotal(Pizza[] p){
        double cost = 0;
        for(int i = 0; i < p.length;i++){
            cost+= p[i].calcCost();
            //System.out.println(cost);
        }
        return cost;
    }
}
