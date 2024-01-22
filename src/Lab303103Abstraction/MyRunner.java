package Lab303103Abstraction;

public class MyRunner {
    public static void main(String[] args){
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());

        System.out.println("++++++++++++++");
        Shape shapeCircleObj = new Circle(100);
        shapeCircleObj.displayShapeName();
        System.out.println("Area of Circle "  + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj instanceof Circle);

        System.out.println("------------");
        Shape shapeRectangleObj = new Rectangle("Red");
        shapeRectangleObj.displayShapeName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(4);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);
        System.out.println(shapeRectangleObj instanceof Rectangle);
        System.out.println("/////////////");
        Shape shapeTriangleObj = new Triangle("Blue");
        shapeTriangleObj.displayShapeName();
        shapeTriangleObj.setHeight(10);
        shapeTriangleObj.setBase(15);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);
    }
}
