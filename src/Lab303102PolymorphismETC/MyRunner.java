package Lab303102PolymorphismETC;

public class MyRunner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());

        Shape sObj = new Shape();
        sObj.displayShapeName();
        System.out.println(sObj instanceof Shape);

        System.out.println("++++++++++");
        Shape shapeCircleObj = new Circle(100);
        shapeCircleObj.displayShapeName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);
        System.out.println(shapeCircleObj instanceof Circle);

        System.out.println("----------");
        Shape shapeRectangleObj = new Rectangle("Red");
        shapeRectangleObj.displayShapeName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(2);
        System.out.println("Area of rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeCircleObj);

        System.out.println(shapeCircleObj instanceof Rectangle);
        System.out.println(sObj instanceof Rectangle);
        System.out.println("*********");
        Shape shapeTriangleObj = new Triangle("Blue");
        shapeTriangleObj.displayShapeName();
        shapeRectangleObj.setHeight(2);
        shapeTriangleObj.setBase(3);
        System.out.println("Area of a Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);
        System.out.println(shapeTriangleObj instanceof Triangle);
        System.out.println(sObj instanceof Triangle);
        System.out.println("##########");

        Cylinder cylinderShape = new Cylinder(3);
        cylinderShape.displayShapeName();
        cylinderShape.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinderShape.getVolume());
        System.out.println(cylinderShape);




    }
}
