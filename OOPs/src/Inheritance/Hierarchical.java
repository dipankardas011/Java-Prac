package Inheritance;

import java.util.Scanner;

class Shape {
    Shape() {
        System.out.println("Shape class called");
    }
    double Area() {
        System.out.println("Base class Area()");
        return 0.0;
    }
}

class Rectangle extends Shape{
    Rectangle() {
        System.out.println("Rectangle class called");
    }
    @Override
    double Area() {
        System.out.println("Enter the length & breadth: ");
        double l = new Scanner(System.in).nextInt();
        double b = new Scanner(System.in).nextInt();
        System.out.println("Circle class Area()");
        return l*b;
    }
}

class Circle extends Shape {
    Circle() {
        System.out.println("Circle class called");
    }
    @Override
    double Area() {
        System.out.println("Enter the radius: ");
        double radius = new Scanner(System.in).nextInt();
        System.out.println("Circle class Area()");
        return Math.PI * Math.pow(radius,2);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println("## Rectangle Area: " + rec.Area());

        Circle cir = new Circle();
        System.out.printf("## Circle Area: %.3f" , cir.Area());
    }
}
