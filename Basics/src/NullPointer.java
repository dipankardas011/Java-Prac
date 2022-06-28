public class NullPointer {
    public static void main(String[] args) throws java.lang.Exception{
        // here we can assign null to all the reference variables/objects
        // as class objects or the reference variables are dynamic memory
        // no primitive type can have null as it is in stack memory where sizee is defined
        Integer a = null;
        System.out.println("a object: " + a);

//        NullPointer obj = new NullPointer();
        NullPointer obj = null;
        System.out.println("address "+obj);
        obj = new NullPointer();
        System.out.println("address "+ obj);

//        int x = null;
        // here it is error as int is primitive type whereas the Wrapper class are objects i.e.
        // the reference type
        // instanceOf
        Integer i = null;
        Integer j = 23;
        System.out.println(i instanceof Integer);
        System.out.println(j instanceof Integer);

        System.out.println(null == null);
        System.out.println(null != null);
    }
}
