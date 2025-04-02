
//import java.util.Scanner;

public class PrimeNoDemo {
    public static void main(String[] args) {
       // Scanner sc= new Scanner(System.in);
      //  System.out.println("Enter Any No:");
      //  int num=sc.nextInt();
        int num=7;  
        boolean flag=false;  
  
          for(int i=2;i<num;i++)  
          {  
              if(num%i==0)  
              {  
                  flag=true;  
                    break;  
              }  
          }  
        if(flag)  
        {  
            System.out.println("Not prime");  
        }  
        else  
        {  
            System.out.println("prime");  
        }  
          
    }         
    
}
