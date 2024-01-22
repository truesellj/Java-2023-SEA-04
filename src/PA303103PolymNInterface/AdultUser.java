package PA303103PolymNInterface;

public class AdultUser implements LibraryUser{
    private String bookType = new String();
    private int age;
    public AdultUser(){}

    public AdultUser(String bookType, int age){
        this.bookType = bookType;
        this.age=age;
    }
    @Override
    public void registerAccount(){
        if(this.age >=12) System.out.println("You have successfully registered under an Adult Account");
        else System.out.println("Sorry age must be 12 or greater to register as an adult");
    }
    @Override
    public void requestBook(){
        if(this.bookType.compareTo("Fiction")==0) System.out.println("Book issued successfully, please return within 7 days");
        else System.out.println("Oops! You are allowed to only to take out adult fiction books.");
    }
}
