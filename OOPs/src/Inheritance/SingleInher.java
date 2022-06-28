package Inheritance;

class ParentClass {
    ParentClass() {
        System.out.println("ParentClass called");
    }
}

public class SingleInher extends ParentClass{
    SingleInher() {
        System.out.println("Derived class called");
    }
    public static void main(String[] args) {
        SingleInher obj = new SingleInher();
    }
}
