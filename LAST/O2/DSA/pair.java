public class pair {
    public static void printPair(int numbers[]) {
        int tp =0;
        for(int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for(int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                tp++;

            }
            System.out.println(); // Move to the next line after printing all pairs with curr
            
        }
        System.out.println(tp  );
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPair(numbers);
    }
}
