package PA30351;

public class MultTable {
    public static void main(String[] args) {
        for(int i = 1; i < 13; i++){
            for(int j = 1; j < 13; j++){
                //create spacing for alignment of table
                if(i*j <10) System.out.print("   ");
                if(i*j <100 && i*j >9){
                    System.out.print("  ");
                }
                if(i*j >99){
                    System.out.print(" ");
                }
                //print out the product
                System.out.print(i * j);
                //if we get to the last multiplier print a new line value
                if(j == 12){
                    System.out.print("\n");
                }
            }
        }
    }
}
