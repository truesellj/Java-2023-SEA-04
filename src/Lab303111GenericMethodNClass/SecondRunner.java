package Lab303111GenericMethodNClass;

public class SecondRunner {
    public static void main(String[] args) {
        //initialize generic class with String and Integer Data
        GMultipleDatatype<String, Integer> mObj = new GMultipleDatatype<String, Integer>("Per Scholas", 11025);
        System.out.println(mObj.getValueOne());
        System.out.println(mObj.getValueTwo());

        //create 2nd obj w/ our generics class
        GMultipleDatatype<String, String> mObj2 = new GMultipleDatatype<String, String>("Per Scholas", "Non-profit");
        System.out.println(mObj2.getValueOne());
        System.out.println(mObj2.getValueTwo());
    }
}
