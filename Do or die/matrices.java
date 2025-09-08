import java.security.Key;
import java.util.*;

  public class matrices {
// //     public static boolean search(int matrix[][], int key) {
// //         for (int i = 0; i < matrix.length; i++) {
// //             for (int j = 0; j < matrix[0].length; j++) {
// //                 if (matrix[i][j] == key) {
// //                     System.out.println("found at cell (" + i + "," + j + ")");
// //                     return true;
// //                 }
// //             }
// //         }
// //         System.out.println("key not found");
// //         return false;
// //     }

// //     public static void main(String[] args) {
// //         int matrix[][] = new int[3][3];

// //         int n = matrix.length, m = matrix[0].length;
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter 9 elements for the matrix:");
// //         for (int i = 0; i < n; i++) {
// //             for (int j = 0; j < m; j++) {
// //                 matrix[i][j] = sc.nextInt();
// //             }
// //         }
// //         // output
// //         System.out.println("Matrix:");
// //         for (int i = 0; i < n; i++) {
// //             for (int j = 0; j < m; j++) {
// //                 System.out.print(matrix[i][j] + "  ");
// //             }
// //             System.out.println();
// //         }

// //         search(matrix, 5); // Example search for key 5
// //     }

// public static int diagoanalSum(int matrix[][]){

//     //Brute force

//      int sum=0;
//     // for(int i=0;i<matrix.length;i++){
//     //     for(int j=0;j<matrix[0].length;j++){
//     //         if(i==j){
//     //         sum+=matrix[i][j];
//     //         }else if(i+j==matrix.length-1){
//     //             sum+=matrix[i][j];
//     //         }
//     //     }
//     // }
//     // return sum;

//     for(int i=0;i<matrix.length;i++){
//         //pd
//         sum+=matrix[i][i];
//         //sd
//         if(i!=matrix.length-1-i){
//         sum+=matrix[i][matrix.length-i-1];
//         }
//     }
//     return sum;
// }

// public static boolean sortedMatrix(int matrix[][],int key){
//     int row=0,col=matrix[0].length-1;
//      while (row < matrix.length && col >= 0) {
//             if (matrix[row][col] == key) {
//                 System.out.println(row + " " + col);
//                 return true;
//             } else if (key < matrix[row][col]) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }
//         System.out.println("not found");
//         return false;
//     }




// public static void main(String[] args) {
// int matrix[][]={{10,20,30,40},
//                {15,25,35,45},
//             {27,29,37,48},
//         {32,33,39,50}};


// int key=30;
//         //int c=    diagoanalSum(matrix);
//         //System.out.println(c);
//        sortedMatrix(matrix,key);
// }
public static void countof7(int matrix[][]){
    int count7=0;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==7){
                count7++;
            }


        }
    }
    System.out.println(count7);

}
public static void main(String[] args) {
    int matrix[][]={{4,7,8},{8,8,7}};
    countof7(matrix);
}


}

