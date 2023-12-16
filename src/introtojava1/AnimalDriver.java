package introtojava1;

public class AnimalDriver {
    public static void main(String[] args) {
        //create animal objects:
        //The 'new' keyword is used to create a new object
        //instance is another name for object\
        /*Animal is the class, dog it the new object that is derived from that class and the new operator is used to allocate memory in the heap */
        Animal dog = new Animal();
        dog.setName("Dog");
        dog.setType("Canine");
        dog.setColor("Brown");
        dog.setLevel(2);
        dog.setAlive(true);
        System.out.println();

        //cannot do this with primitives
        /* Primatives are stored in the stack memory and the primitive variables store the actualvalues; reference types are stored on heap memory and they point to the place in memory. */
    }
}
