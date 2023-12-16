package introtojava1;

public class Animal {
    String name;
    String type;
    int level;
    String color;
    boolean alive;

    static String animalGame = "Ezra's Animal Game";

    //Behavior - the mthods that descrive or show the behavior of an animal.
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }
    public String  getType(){
        return type;
    }
    public void setLevel(int level){
        this.level=level;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setAlive(boolean alive){
        this.alive=alive;
    }

}
