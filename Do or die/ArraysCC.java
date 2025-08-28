import java.util.*;
//linear search
public class ArraysCC {
    // public static int linearSearch(int numbers[],int key){
    //     for(int i =0; i<numbers.length;i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }

    //     }
    //     return-1;

    // }

    // public static void main(String[] args) {
    //     int numbers[]={2,4,6,8,10,12,14,16};
    //     int key =10;
    //     int index=linearSearch(numbers, key);
    //     if(index==-1){
    //         System.out.println("index not found");
    //     }else{
    //         System.out.println("key is at index" + " "+index);
    //     }
    // }

    //linear search
    // public static int linearSearch(String menu[],int key){
    //     for(String i=0;i<menu.length;i++){
    //         if(menu[i]==key){

    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     String menu[]={"dosa","samosa","bhindi","kachori","paratha"};
    //     String key="bhindi";


    // }

    //largest Number
    // public static int getlargest(int numbers[]){
    //     int largest=Integer.MIN_VALUE;
    //     int smallest=Integer.MAX_VALUE;
    //     for(int i=0;i<numbers.length;i++){
    //         if(largest<numbers[i]){
    //             largest=numbers[i];
    //         }
    //         if (smallest>numbers[i]){
    //             smallest=numbers[i];

    //         }
            
    //     }
    //     System.out.println("smallest value is : "+ smallest);
    //     return largest;
    // }
    // public static void main(String[] args) {
    //     int numbers[]={1,2,3,5,6,8,2};
    //     System.out.println("largest value is : "+ getlargest(numbers));

    // }
    
    //binary search
    // public static int binarysearch(int numbers[] ,int key){
    //     int start = 0 , end= numbers.length-1;
    //     while(start<=end){
    //         int mid = (start+end)/2;
    //      if (numbers[mid] == key){
    //         return mid;

    //     }
    //     if(numbers [mid]<key){
    //        start=mid+1;
    //     }
    //     if(numbers[mid]>key){
    //       end=mid-1;
    //     }

    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int numbers[]={2,4,6,8,10,12,14,16};
    //     int key=14;
    //     int index=binarysearch(numbers, key);
    //     if (index==-1){
    //         System.out.println("key not found");
    //     }else{
    //         System.out.println("key is found at the index "+index);
    //     }

    // }

    //reverse of array
    // public static void reverse(int numbers[]){
    //     int first=0, last=numbers.length-1;
    //     while(first<last){
    //         //swap
    //         int swap =numbers[last];
    //         numbers[last] =numbers[first];
    //         numbers[first]= swap;

    //         first++;
    //         last--;

            
    //     }

    // }
    // public static void main(String[] args) {
    //     int numbers[]={2,4,6,8,10,12};

    //     reverse(numbers);

    //     for(int i=0;i<numbers.length;i++){
    //         System.out.print( numbers[i]+" ");

    //     }
    //     System.out.println();

    // }

    //Pairs in an array 
    // public static void printPairs(int numbers[]) {
    //     int tp=0;
    //     for (int i = 0; i < numbers.length; i++) {
    //         int current = numbers[i];
    //         for (int j = i + 1; j < numbers.length; j++) {
    //             System.out.print("(" + current + "," + numbers[j] + ")");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("tp: " + tp);
    // }
    // public static void main(String[] args) {
    //     int numbers[]={2,4,6,8,10};
    //     printPairs(numbers);
    // }

//PRint subarrays
// public static void subarrays(int numbers[]){
//     int tp=0;
//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             for(int k=start;k<=end;k++){
//                 System.out.print(numbers[k]+" ");
//                 tp++;               
//             }
//             System.out.println();
//         }  
//         System.out.println();
//         System.out.println(tp);
//     }
//     System.out.println(tp);
// }
//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10};
//         subarrays(numbers);

//     }

//Max Subarray Sum
// public static void MaxSubaraySum(int numbers[]){ 
//     int currSum=0;
//     int maxSum=Integer.MIN_VALUE;
//      for(int i=0;i<numbers.length;i++){
//         int start=i;
//    for(int j=i;j<numbers.length;j++){
//             int end=j;
//             currSum=0;
//             for(int k=start;k<=end;k++){
//                 currSum+=numbers[k];
//             }
//             System.out.println(currSum);
//             if(maxSum<currSum){
//                 maxSum=currSum;
//             }
           
//         }
      
//     }
//     System.out.println( "max sum = " +maxSum);
// }
//  public static void main(String[] args) {
//      int numbers[]={1,-2,6,-1,3};
// //     MaxSubaraySum(numbers);
//  }

// //Prefix Sum
//   public static void maxSubarraySum(int numbers[]){
//     int currSum=0;
//     int maxSum=Integer.MIN_VALUE;
//     int prefix[]=new int[numbers.length];

//     prefix[0]=numbers[0];
//     //calculate prefix array
//     for(int i=1;i<prefix.length;i++){
//         prefix[i]=prefix[i-1] +numbers[i];

//     }
//     for 
//   }

//kadan's Algorithm

public static void kadanes(int numbers[]) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for (int i = 0; i < numbers.length; i++) {
        cs += numbers[i];
        ms = Math.max(cs, ms);     // 1. Update ms before cs reset
        if (cs < 0) cs = 0;        // 2. Only then reset cs if negative
    }
    System.out.println("our max subarray sum is : " + ms);
}

  public static void main(String[] args) {
    int number[]={-2,-3,4,-1,-2,1,-5,-3};
kadanes(number);
  }
}
 