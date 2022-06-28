package Inheritance;

class InheritIt {
    static int noOfObjects;
    InheritIt() {
        noOfObjects++;
        ID();
    }

    public void ID() {
        System.out.println("Object No: " + noOfObjects);
    }
}

public class CountObjects extends InheritIt{
    CountObjects() {
        System.out.println("Basic Constrctor called");
    }
    public static void main(String[] args) {
        CountObjects countObjects1 = new CountObjects();
        {
            CountObjects countObjects2 = new CountObjects();
            CountObjects countObjects3 = new CountObjects();
        }
    }
}
