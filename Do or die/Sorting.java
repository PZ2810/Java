import java.util.*;

public class Sorting {
    public static void bubblesort(int numbers[]) {
        for(int turns=0;turns<numbers.length-1;turns++){
            for(int j=0;j<numbers.length-1;j++){
                if(numbers[j]>numbers[j+1]){
                    //Swap
                    int temp= numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers [j+1]=temp;

                }

            }
        }
        //  for(int i=0;i<numbers.length;i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println();
    }
    public static void printnumbers(int numbers[]) {
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    public static void selectionsort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            int  minpos=i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]<numbers[minpos]){
                    minpos=j;

                    
                }

            }
             //Swap
                    int temp= numbers[minpos];
                    numbers[minpos]=numbers[i];
                    numbers [i]=temp;

        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        
       // bubblesort(numbers);
    //    selectionsort(numbers);
    Arrays.sort(numbers,0,3);
     printnumbers(numbers);
   
    


    }
}
