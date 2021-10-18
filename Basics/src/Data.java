import java.sql.SQLOutput;
import java.util.*;

public class Data {
    public static void main(String[] args) {
        int amount = 1_00_000;
        System.out.println(amount);
        float fnum = 2.3_01_000F;
        System.out.println(fnum);
        int[] arr = {2,3,54,12,1,43};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target;
        Scanner in = new Scanner(System.in);
        target = in.nextInt();
        int pos = Arrays.binarySearch(arr, target);
        if (pos >= 0)
            System.out.println("Found");
        else
            System.out.println("Not Found");

        // using Collections
        List<Integer> ar = new ArrayList<>();
        ar.add(34);
        ar.add(23);
        ar.add(3);
        ar.add(45);
        pos = Collections.binarySearch(ar,target);
        if(pos >= 0){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        Integer[] array = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sorts arr[] in descending order
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.printf("the descending order [] = %s", Arrays.toString(array));
    }
}
