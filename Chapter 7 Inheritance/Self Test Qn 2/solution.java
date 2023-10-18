/*
 * Create a subclass of TwoDShape called Circle. Include an area() method that computes the area of the circle and
 * a constructor that uses super to initialize the TwoDShape portion.
 */

// Create an abstract class
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    // A default constructor
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    // Parameterized constructor.
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Construct object with equal width and height.
    TwoDShape(double x, String n) {
        width = height = x;
        name=  n;
    }

    // Construct an object from an object.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Accessor methods for width and height
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Width and height are " + width + " and " +  height);
    }

    abstract double area();
}

// A subclass of TwoDShape for circles
class Circle extends TwoDShape{
    private double radius;

    Circle() {
        super();
        radius = 0.0;
    }

    Circle(double r) {
        super();
        radius = r;
    }

    Circle(Circle ob){
        super();
        radius = ob.radius;
    }

    double area() {
        return 0.5 * radius * radius;
    }
}

class Solution {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(c2);

        System.out.println("Area of c1: " + c1.area());
        System.out.println("Area of c2: " + c2.area());
        System.out.println("Area of c3: " + c3.area());

    }
}