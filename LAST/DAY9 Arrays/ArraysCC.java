import java.util.*;
public class ArraysCC {

    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        //int phy;
        //phy = sc.nextInt();
        System.out.println("length of array: " + marks.length);
         marks[0] = sc.nextInt();//phy
       marks[1] = sc.nextInt();//chem
       marks[2] = sc.nextInt();//math

    //     System.out.println("Physics: " + marks[0]);
    //     System.out.println("Chemistry: " + marks[1]);
    //     System.out.println("Maths: " + marks[2]);

    //     //marks[2]= 100; // updating the marks of Maths
    //    // System.out.println("Updated Maths Marks: " + marks[2]);

    //    // marks[1]= marks[1] + 10; // incrementing Chemistry marks by 10
    //     //98
    //     System.out.println("Updated Chemistry Marks: " + marks[1]);

    //     int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    //     System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
} 