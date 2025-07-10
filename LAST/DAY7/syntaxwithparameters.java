import java.util.Scanner;

public class syntaxwithparameters {
    public static void printhelloworld() {
        System.out.println("hello World");
        System.out.println("hello World");
        System.out.println("hello World");
        System.out.println("hello World");
    }
     public static  int calculateSum( int num1 , int num2) {//parameters or formal parameter
        int sum =num1+num2;
        return sum; 
        
       
     }
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum =calculateSum(a,b);//argument or actual parameters
        System.out.println("sum is :" +sum);

       
    }
}
