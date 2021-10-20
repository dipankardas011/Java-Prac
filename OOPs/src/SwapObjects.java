
// method 1: we could use the object method

// method 2: using wrapper class

class Car {
    int model, no;
    Car(int model, int no) {
        this.model = model;
        this.no = no;
    }

    void print() {
        System.out.println("car mode: " + model + ", number: " + no);
    }
}

class CarWrapper {
    Car c;
    CarWrapper(Car c) {
        this.c = c;
    }
}


public class SwapObjects {

    public static void swap(CarWrapper a, CarWrapper b) {
        Car temp = a.c;
        a.c = b.c;
        b.c = temp;
    }

    public static void main(String[] args) {
        Car a = new Car(101, 1);
        Car b = new Car(102, 3);
        CarWrapper c1 = new CarWrapper(a);
        CarWrapper c2 = new CarWrapper(b);

        swap(c1, c2);
        c1.c.print();
        c2.c.print();
    }
}
