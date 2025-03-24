import java.util.Arrays;
public class CountOccurance {

    static int  dis(int arr[],int x){
        Arrays.sort(arr);
        return arr[arr.length-x];

    }
    public static void main(String[] args) {
        int arr[]={10,14,19,26,27,31,33,35,42,44};
        int x=27;
       int res= CountOccurance.dis(arr,x);
        System.out.println(res);
      
        
        
    }
    
}
