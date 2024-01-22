package Lab303104Interface;

public class Triangle extends Shape implements Movable{

    private int x, y;
    public Triangle(double base){
        this.base = base;
    }
    @Override
    public double getArea(){
        return this.base * this.height* 0.5;
    }
    @Override
    public void moveUp(){
        y++;
    }
    public void moveDown(){
        y--;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }
    public String getCoordinate(){
        return "For Triangle \nX coordinate is : " + this.x + "\n and Y coordinate is : " + this.y;
    }
}
