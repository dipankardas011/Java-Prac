import java.lang.*;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer x = new StringBuffer("Dipankar Das");
        System.out.println(x);
        x.appendCodePoint(90);
        System.out.println(x);
    }
}
