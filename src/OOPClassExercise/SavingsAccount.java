package OOPClassExercise;

public class SavingsAccount {
    public SavingsAccount(){}
    public static double annualInterestRate = .05;
    private double savingsBalance;

    public SavingsAccount(double d){
        this.savingsBalance = d;
    }
    public double getMonthlyInterest(){
        return (annualInterestRate * this.savingsBalance) / 12;
    }
    public void addMonthlyInterest(){
        savingsBalance = savingsBalance + getMonthlyInterest();
    }
    public static void modifyInterestRate(double d){
        if(d < 1) annualInterestRate = d;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
}
