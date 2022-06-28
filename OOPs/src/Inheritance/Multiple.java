package Inheritance;

// Java program to illustrate the
// concept of Multiple inheritance
/*
In Multiple inheritances, one class can have more than one superclass
and inherit features from all parent classes.
Please note that Java does not support multiple inheritances with classes.
In java, we can achieve multiple inheritances only through Interfaces.
In the image below, Class C is derived from interface A and B.
 */
import java.io.*;
import java.lang.*;
import java.util.*;
interface one {
    public void print_geek();
}

interface two {
    public void print_for();
}

interface three extends one, two {
    public void print_geek();
}

class child implements three {
    @Override
    public void print_geek() {
        System.out.println("Hello");
    }
    public void print_for() {
        System.out.println("Interfaces");
    }

}
public class Multiple {
    public static void main(String[] args) {
        child c = new child();
        c.print_geek();
        c.print_for();
    }
}
