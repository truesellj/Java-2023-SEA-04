package Lab30321;

public class UnaryOperators {
    public static void main(String[] args) {
        int sum = +1;
        //sum is now 1
        System.out.println(sum);

        sum--;
        //sum is now 0
        System.out.println(sum);

        sum++;
        //sum is now 1
        System.out.println(sum);

        sum= -sum;
        //sum is now -1
        System.out.println(sum);

        boolean result = false;

        System.out.println(result);
        System.out.println(!result);
    }
}
