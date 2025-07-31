public class reverse {
    public static void rev(int numbers[]){
        int start=0, end =numbers.length-1;
        while (start<end) {
            //swap
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]= temp;

            start++;
            end--;

        }
          

    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10};
        rev(numbers);   

        //print
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
             

        }
        System.out.println();
    }
}
