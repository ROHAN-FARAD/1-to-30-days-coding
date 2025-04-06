
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        
        int[] arr = {3, 8, 1, 7, 5, 9, 10, 14, 17, 77, 54, 4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int x = sc.nextInt();
        
        boolean found = false;
        for (int num : arr) {
            if (num == x) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
