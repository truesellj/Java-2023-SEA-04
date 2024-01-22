package CoreJavaVariable;

public class CafePurchase {
    public static void main(String[] args) {
        double cinnamonRoll = 2.75;
        double apple = .50;
        double hotTea = 1.76;
        double subtotal, totalSale;
        final double SALES_TAX = .08;
        subtotal = cinnamonRoll + apple + hotTea;
        totalSale = subtotal + (subtotal*SALES_TAX);
        System.out.println(String.format("%.2f", totalSale));

    }
}

