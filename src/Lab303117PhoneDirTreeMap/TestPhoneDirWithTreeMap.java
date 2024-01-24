package Lab303117PhoneDirTreeMap;

public class TestPhoneDirWithTreeMap {
    public static void main(String[] args) {
        PhoneDirWithTreeMap dir = new PhoneDirWithTreeMap();
        System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
        System.out.println("adds several entries.  It then prints the contents of");
        System.out.println("directory and does a few lookups.");
        System.out.println();
        dir.putNumber("Fred","555-1234");
        dir.putNumber("Barney","555-2345");
        dir.putNumber("Wilma","555-3456");
        dir.putNumber("Wilma","555-3456");
        dir.putNumber("Wilma","555-2563");
        // directory.putNumber("James",null);
        //directory.putNumber(null,"555-2853");

        System.out.println("Contents are:");
        System.out.println();
        dir.print();
        System.out.println();
        System.out.println("Number for Fred is " + dir.getNumber("Fred"));
        System.out.println("Number for Wilma is" + dir.getNumber("Wilma"));
        System.out.println("Number for Tom is " + dir.getNumber("Tom"));
        System.out.println("Number for Tom is " + dir.getNumber("Alex"));

    }
}
