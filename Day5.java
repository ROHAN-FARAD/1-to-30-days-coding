import java.util.Arrays;
import java.util.Collections;
class Day5{

    public static void main(String[] args) {
        // Original array
        Integer[] arr = {7, 2, 9, 1, 4, 10, 15, 8, 6, 2, 5};

        // Ascending order
        Integer[] ascArr = arr.clone();
        Arrays.sort(ascArr);
        System.out.println("Ascending Order:");
        System.out.println(Arrays.toString(ascArr));

        // Descending order
        Integer[] descArr = arr.clone();
        Arrays.sort(descArr, Collections.reverseOrder());
        System.out.println("Descending Order:");
        System.out.println(Arrays.toString(descArr));
    }
}

}