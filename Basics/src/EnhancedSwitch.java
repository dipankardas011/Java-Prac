import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pencil or paper");
        String choice = in.next();
        switch (choice) {
            case "pencil" -> {
                System.out.println("Enter no of pencils required");
                int x = in.nextInt();
                System.out.println("Bought " + x + " number of " + choice);
            }
            case "paper" -> {
                System.out.println("Enter the size A4 / A5 / A3");
                String paper = in.next();
                switch (paper) {
                    case "A4", "A5", "A3" -> System.out.println(paper + " size " + choice);
                }
            }
        }
    }
}
