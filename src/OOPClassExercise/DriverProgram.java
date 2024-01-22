package OOPClassExercise;

public class DriverProgram {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.annualInterestRate = 0.03;
        saver1.addMonthlyInterest();
        saver2.addMonthlyInterest();
        System.out.println(saver1.getSavingsBalance());
        System.out.println(saver2.getSavingsBalance());
    }
}
