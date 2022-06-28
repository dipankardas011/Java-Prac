package Inheritance;

abstract class ShapeC {
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public ShapeC(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() { return color; }
}
class CircleC extends ShapeC {
    double radius;

    public CircleC(String color, double radius) {
        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor()
                + "and area is : " + area();
    }
}
class RectangleC extends ShapeC {

    double length;
    double width;

    public RectangleC(String color, double length, double width) {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() { return length * width; }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }
}

public class Abstract {
    public static void main(String[] args) {
        CircleC s1 = new CircleC("Red", 2.2);
        RectangleC s2 = new RectangleC("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
