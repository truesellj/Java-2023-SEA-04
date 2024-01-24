package Lab30322;

public class AutoTypeConversion {
    public static void main(String[] args){
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;

        double z = x + y;
        System.out.println("sum of two numbers: " + z);

        float r = p-q;
        System.out.println("subtraction of two number: " + r);
    }
}
