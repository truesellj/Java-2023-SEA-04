package PA30351;

public class FutureTuition {
    public static void main(String[] args) {
        //declare starting tuition
        float tuitionThisYear = 10000;
        //declare variable to keep tracker of year
        int currentYear = 1;
        do{
            tuitionThisYear += tuitionThisYear*.07;
            currentYear++;
            System.out.format("During year " + currentYear + " the tuition is: $%,.2f\n", tuitionThisYear);
        }while(tuitionThisYear<20000);
    }
}
