public class revarr {
    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;

        while(first<last){
            //swap
            int temp= numbers [last];
            numbers[last]=numbers[first];
            numbers[first]=numbers[temp];

            first++;
            last--; 

        }
        for(int i=0;i<numbers.length;i++){
            System.out.println();

        }

    }
    
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        
        
    }
}
