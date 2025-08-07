public class subarr {
    public static void printSubarrays(int numbers[]){
        for(int i=0;i <numbers.length;i++){
            int start= numbers[i];
            for(int j=i;j<numbers.length;j++){
               int end =numbers[j];
              //int sum =0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers [k]+" ");
                     //sum += numbers[k];
                }
                //System.out.println("sum" + " "+s );
                System.out.println();
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
         int numbers[]={2,4,6,8,10};
         printSubarrays(numbers);
    }

    
}