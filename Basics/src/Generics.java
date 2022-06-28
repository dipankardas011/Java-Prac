/***
 * @doc "Bounded types with generics in Java"
 * Sometimes we don’t want whole class to be parameterized,
 * in that case we can create java generics method. Since
 * constructor is a special kind of method, we can use generics type in constructors too.
 * Suppose we want to restrict the type of objects that
 * can be used in the parameterized type. For example in a method that
 * compares two objects and we want to make sure that the accepted objects are Comparables.
 * The invocation of these methods is similar to unbounded method except
 * that if we will try to use any class that is not Comparable, it will throw compile time error.
 */

//class Bound<T extends A> {
//    private final T obj;
//
//    public Bound(T ob) {
//        this.obj = ob;
//    }
//    public void doRun() {
//        this.obj.display();
//    }
//}

/***
 * Multiple Bounds
 *
 * Bounded type parameters can be used with methods as
 * well as classes and interfaces.
 *
 * Java Generics supports multiple bounds also, i.e .
 * In this case A can be an interface or class. If A is class
 * then B and C should be interfaces. We can’t have more than
 * one class in multiple bounds.
 * @param <T>
 */
class Bound<T extends A & B> {
    private final T obj;

    public Bound(T ob) {
        this.obj = ob;
    }
    public void doRun() {
        this.obj.display();
    }
}

interface B {
    public void display();
}

class A implements B{
    public void display() {
        System.out.println("inside super class A");
    }
}
//class B extends A {
//    public void display() {
//        System.out.println("inside super class B");
//    }
//}

//class C extends A {
//    public void display() {
//        System.out.println("inside super class C");
//    }
//}

public class Generics {
    public static void main(String[] args) {
        // creating the object of subclass C and passing it to bound as type
        // parameter
//        Bound<C> o = new Bound<C>(new C());
//        o.doRun();
//
//        Bound<B> o1 = new Bound<B>(new B());
//        o1.doRun();
//
//        Bound<A> o2 = new Bound<A>(new A());
//        o2.doRun();
        Bound<A> obj = new Bound<A>(new A());
        obj.doRun();
    }
}
