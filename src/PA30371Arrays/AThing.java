package PA30371Arrays;

public class AThing {
    String fName = "";
    String mName = "";
    String lName = "";
    String name = "";
    double heightInFeet;
    int howOld;
    public AThing(double height, int age){
        this.heightInFeet = height;
        this.howOld = age;
    }

    public void setName(String s, String t, String u){
        this.fName = s;
        this.mName = t;
        this.lName = u;
        this.name = s + " " + t + " " + u;
    }
    public String toString(){

        return fName + "," + mName + "," + lName + "," + heightInFeet + "," + howOld;

    }
}
