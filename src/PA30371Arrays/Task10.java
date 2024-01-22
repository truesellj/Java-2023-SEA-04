package PA30371Arrays;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        //declare new instance of self created object with required parameters height and age
        AThing thisThing = new AThing(5.5, 36);
        //use setter method to set name
        thisThing.setName("Charlotte", "Renee", "Byers");
        //For my own fun im printing out the three strings combined to make their whole name
        System.out.println(thisThing.name);
        //Store the one object in the array, which now contains all
        AThing[] thingArray = new AThing[]{thisThing};
        //Print all attributes from array to show it contains the requirements for this assignment
        System.out.println(thingArray[0].fName);
        System.out.println(thingArray[0].mName);
        System.out.println(thingArray[0].lName);
        System.out.println(thingArray[0].howOld);
        System.out.println(thingArray[0].heightInFeet);
        System.out.println(Arrays.toString(thingArray));
    }

}
