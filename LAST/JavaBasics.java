import java.util.*;
public class JavaBasics {
      public static void main(String args[]){

        /*System.out.println("12345");
        System.out.println("12345");

        print(print in same line)
        println(moves in nxt line)
        /n(movesnxt line)
       */
         /*patern
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
         */
        /*int a = 10;
        int b= 5;
        System.out.println(a);
        System.out.println(b);
        String name ="Tony stark";
        System.out.println(name);

        a =b;
        System.out.println(b);*/

       //byte [1 byte = 8 bits] [-128 to 127] 256
       //char [2 byte]
       //short [2 bytes]
       //boolean[1 byte]
       //int[4 byte]
       //long[8 byte]
       //float[4 byte]
       //double [8 bytes]

       // Sum of a&b

       /*int a = 10;

      
       int b =5;
       int sum =a+b;
       System.out.println(sum);*/

       Scanner sc = new Scanner(System.in);
       /*String input = sc.next();
       System.out.println(input );*/

       /*String name =sc.nextLine();
       System.out.println(name);

       int number =sc.nextInt();
       System.out.println(number);

       int a = sc.nextInt();
       int b =sc.nextInt();
       int sum =a+b;
       int product= a*b;
       System.out.println(sum);
       System.out.println(product);*/

       // type casting
    /*  float a =25.9f;
       int b =(int)a;
       System.out.println(b);*/
  //Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
 //these 3 numbers

 /*int a =sc.nextInt();
 int b =sc.nextInt();
 int c =sc.nextInt();
 int avg= (a+b+c)/3;

System.out.println(avg);*/

//2: In a program, input the side of a square. You have to output the area of the  square.

/*int a=sc.nextInt();

int sq= a*a;
System.out.println(sq);*/

// Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
 //(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
 float pencil = sc.nextFloat();
 float pen = sc.nextFloat();
 float eraser = sc.nextFloat();
 float total = pencil + pen + eraser;
 System.out.println("Bill is : " + total);
 //Add on - with 18% tax
 float newTotal = total + (0.18f * total);
 System.out.println("Bill with 18% tax : " + newTotal);
 



      }
    
}
//boilerplate