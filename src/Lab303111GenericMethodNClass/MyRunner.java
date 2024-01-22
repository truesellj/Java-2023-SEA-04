package Lab303111GenericMethodNClass;

public class MyRunner {
    public static void main(String[] args) {
        //initialize the class w/ integer data
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25); //submit Integer argument
        dObj.genericsMethod("PerScholas"); //submit String argument
        dObj.genericsMethod(2563.5); //submit float argument
        dObj.genericsMethod('H'); //submit char argument

    }
}
