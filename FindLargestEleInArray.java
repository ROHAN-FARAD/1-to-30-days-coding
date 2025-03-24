
public class FindLargestEleInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 8, 4, 9, 2, 5, 6};  
        int k = 4;
        int Largest = arr[arr.length - k];

        System.out.println(  k + "th Index Element is  largest element: " + Largest);
    }
}
