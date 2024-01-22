package PA30371Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] anArray = {99,98,97,96,95};
        int middle = anArray.length / 2;
        for(int i = 0; i < anArray.length; i++){
            /*if(i-((double)anArray.length)/2 >= 0 && )i-((double)anArray.length))/2 <1){
                System.out.println(anArray[i]);
            }*/
            if(i==middle ){
                continue;
            }
            System.out.println(anArray[i]);
        }
    }
}
