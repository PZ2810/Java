public class callbyvalue {
    public static void swap(int a, int b) {
         //swap
        int temp =a;
        a=b;
        b= temp;
     
 
    }

    public static void main(String[] args) {
        //swap- values exchange
        int a= 4;
        int b= 5;
       swap(a, b);
          System.out.println("a="+a);
    }
}