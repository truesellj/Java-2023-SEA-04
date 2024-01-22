package Lab303102PolymorphismETC;

public class Triangle extends Shape{
    public Triangle(){}
    public Triangle(String color, double area, double base, double height, double width){
        super(color);
    }
    public Triangle(String color){
        super(color);
    }
    @Override
    public void setBase(double base){
        super.base = base;
    }

    @Override
    public void setWidth(double width){
        super.width = width;
    }
    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
    @Override
    public void displayShapeName(){
        System.out.println("I am a triangle");
    }
    @Override
    public String toString(){
        return "Triange[base = " + base + ", height = " + height + ", " + super.toString() + "]";
    }
}
