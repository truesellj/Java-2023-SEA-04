package Lab303104Interface;

public class Rectangle extends Shape implements Movable{
    public Rectangle(int height, int width){
        super.height = height;
        super.width = width;
    }
    private int x,y;
    @Override
    public void moveUp(){
        y++;
    }
    @Override
    public void moveDown(){
        y--;
    }
    @Override
    public void moveLeft(){
        x--;
    }
    @Override
    public void moveRight(){
        x++;
    }
    @Override
    public double getArea(){
        return super.height * super.width;
    }
    @Override
    public String getCoordinate(){
        return "The X coordinate is : " + x + ", and the Y coordinate is : " + y;
    }
}
