public class DemoClass {
    String name = "DD Labs";

    private boolean add(int a, int b) {
        return a>b;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
//        DemoClass obj = new DemoClass();
        // second type is
        // creating clone of above object
//        DemoClass t2 = (DemoClass) obj.clone();

        try {
            Class cls = Class.forName("DemoClass");

            DemoClass object = (DemoClass)cls.newInstance();
            System.out.println(object.name);
        }
        //handling class not found exception
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // handling Instatiation exception
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
