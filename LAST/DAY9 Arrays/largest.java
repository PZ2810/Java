public class largest {
    public static int getlargest(int numbers[]){
        int largest= Integer.MIN_VALUE;//minus infinity
        for (int i=0;i<numbers.length;i++){
            if (largest<numbers[i]) {
                largest=numbers[i];

                
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        System.out.println(getlargest(numbers));

    }
}
