public class MaxSubarr {

    public static int maxSubArraySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // Or throw an IllegalArgumentException
        }

        int maxSum = Integer.MIN_VALUE; // Initialize with the smallest possible integer value

        // Outer loop: Fix the starting point of the subarray
        for (int i = 0; i < arr.length; i++) {
            // Middle loop: Fix the ending point of the subarray
            for (int j = i; j < arr.length; j++) {
                int currentSum = 0;
                // Inner loop: Calculate the sum of the subarray from i to j
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                // Update maxSum if currentSum is greater
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum for arr1: " + maxSubArraySum(arr1)); // Expected: 6 (from [4, -1, 2, 1])

        int[] arr2 = {1};
        System.out.println("Maximum subarray sum for arr2: " + maxSubArraySum(arr2)); // Expected: 1

        int[] arr3 = {5, 4, -1, 7, 8};
        System.out.println("Maximum subarray sum for arr3: " + maxSubArraySum(arr3)); // Expected: 23 (from [5, 4, -1, 7, 8])

        int[] arr4 = {-1, -2, -3, -4};
        System.out.println("Maximum subarray sum for arr4: " + maxSubArraySum(arr4)); // Expected: -1 (from [-1])

        int[] arr5 = {};
        System.out.println("Maximum subarray sum for arr5: " + maxSubArraySum(arr5)); // Expected: 0 or handles as per logic
    }
}