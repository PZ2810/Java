public class linear {
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]== key){
                return i;
            

            }
            
        }
        return-1;
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,5,43,222,1,9,40,5};
        int key =43;
        
        int index=linearSearch(numbers, key);
        if(index==-1){
            System.out.println("not found");
        
        }
        System.out.println(index);
    }
}
