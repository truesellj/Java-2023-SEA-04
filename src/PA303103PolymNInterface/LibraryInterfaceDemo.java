package PA303103PolymNInterface;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        LibraryUser kid1 = new KidUser("----", 18); //upcasting
        kid1.registerAccount();
        kid1.requestBook();

        AdultUser adult1 = new AdultUser("Non-fiction", 10);
        adult1.registerAccount();
        adult1.requestBook();

    }
}
//