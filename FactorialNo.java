 class A
 {
    public static int fact(int n) {
        if (n==0||n==1) { 
            return 1;
        }
        return n * fact(n-1); 
    }
    public class FactorialNo{
    public static void main(String[] args) {
        int num = 5;
        int result = fact(num); 
        System.out.println("Factorial of " + num + " is: " + result); 
    }
}
}
