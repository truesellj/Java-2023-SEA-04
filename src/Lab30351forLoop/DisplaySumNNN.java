package Lab30351forLoop;

public class DisplaySumNNN {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;
        for(int i = 1; i <= n; ++i){
            sum+=i;
            System.out.println(i);
        }
        System.out.println("Sum = " + sum);
    }
}
