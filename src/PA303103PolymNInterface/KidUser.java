package PA303103PolymNInterface;

public class KidUser implements LibraryUser{
    private int age;
    private String bookType = new String();

    public KidUser(){}
    public KidUser(String bookType, int age){
        this.bookType = bookType;
        this.age = age;
    }
    @Override
    public void registerAccount(){
        if(this.age <=11){
            System.out.println("You have successfully registered under a kids account, welcome to the library!!");
        }
        else System.out.println("Unfortunately you're not eligible for a kids account. \nPlease consult with the librarian on our rules and regulations.");
    }
    @Override
    public void requestBook(){
        if(this.bookType.compareTo("Kids") == 0)System.out.println("Book issued successfully, please return within 10 days. Enjoy.");
        else System.out.println("Oops! You are only allowed to check out kids books.");
    }
}
