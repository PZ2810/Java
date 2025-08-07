public class maxsubarr {
    public static void msxSubarrays(int numbers[]){
        int maxsum =Integer.MIN_VALUE; 
        for(int i=0;i <numbers.length;i++){
            //int start= numbers[i];
            for(int j=i;j<numbers.length;j++){
              //  int end =numbers[j];
              int sum =0;
                for(int k=i;k<=j;k++){
                    //System.out.print(numbers [k]+" ");
                     sum += numbers[k];
                   
                }
                System.out.println(" "+sum );
                if (maxsum<sum){
                    maxsum=sum;
                }
                
                
            }
           
        }
        System.out.println(maxsum + "= max sum");

    }
    public static void main(String[] args) {
         int numbers[]={2,4,6,8,10};
         msxSubarrays(numbers);
    }

    
}