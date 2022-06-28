package Inheritance;


class A {
    A() {
        System.out.println("Class A called");
    }
}

class B extends A{
    B() {
        System.out.println("Class B called");
    }
}

public class Multilevel extends B{
    Multilevel() {
        System.out.println("Child class of both A and B");
    }
    public static void main(String[] args) {
        Multilevel obj = new Multilevel();
    }
}
