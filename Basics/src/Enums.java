import java.util.Scanner;

/***
 * internally above enum Color is converted to
 * class Color
 * {
 *      public static final Color RED = new Color();
 *      public static final Color BLUE = new Color();
 *      public static final Color GREEN = new Color();
 * }
 */

enum Colors {
    BLACK,
    BLUE,
    GREEN,
    YELLOW,
    RED,
    WHITE;
    Colors() {
        System.out.println("default constructor "+ this);
    }
    public void method () {
        System.out.println("Color member function called\t🎶");
    }
}

public class Enums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("Enter 1->Black; 2->blue; green->3; yellow->4; red->5; white->6");
        choice = in.nextInt();
        switch (choice) {
            case 1 -> System.out.println(Colors.BLACK);
            case 2 -> System.out.println(Colors.BLUE);
            case 3 -> System.out.println(Colors.GREEN);
            case 4 -> System.out.println(Colors.YELLOW);
            case 5 -> System.out.println(Colors.WHITE);
        }

        Colors[] arr = Colors.values();

        for (Colors c : arr ) {
            System.out.println(c + " The colour in " + c.ordinal());
            c.method();
        }
        in.close();
    }
}
