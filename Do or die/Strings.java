public class Strings {
    // public static void printLetters(String str) {
    //     for(int i=0;i<str.length();i++){
    //         System.out.print(str.charAt(i)+"  ");

    //     }
    //     System.out.println();
    // }
    //  public static void main(String args[]) {
    
    // Scanner sc=new Scanner(System.in);
    // String name;
    // name=sc.nextLine();
    // System.out.println(name);


//}
// String.length
// String fullName="Pranav zhawar";
// System.out.println(fullName.length()); 

//cocatenation
// String firstName="Pranav";
// String lastName="zhawar";
// String fullName=firstName+ " "+lastName;
// printLetters(fullName);
//  }

// public static float shortestPath(String path){
//     int x=0;
//     int y=0;
//     for(int i=0;i<path.length();i++){
//         char dir=path.charAt(i);
//         //South
//         if(dir=='S'){
//             y--;
//         }
//         else if(dir=='N'){
//             y++;
           
//             }
//              else if(dir=='W'){
//                 x--;

//         }
//         else{
//             x++;
//         }

//     }
//     int x2=x*x;
//     int y2 =y*y;

//     return (float)Math.sqrt(x2+y2);
// }
    
// public static void main(String[] args) {
//     String path="WNEENESENNN";
//     System.out.println(shortestPath(path));

// }
// public static void main(String[] args) {
//     //comparision of Strings
//     String s1 ="pz";
//     String s2="pz";
//     String s3=new String("pz");
//     if(s1.equals (s3)){
//         System.out.println("Strings are equal");
//     }else{
//         System.out.println("not equal");
//     }

    
// }
// public static String substring(String str,int si,int ei){
//     String substr="";
//     for(int i=si;i<ei;i++){
//         substr+=str.charAt(i);
//     }
//     return substr;
// }
// public static void main(String[] args) {
//     //SubString
//     String str="HelloWorld";
//     // System.out.println(substring(str, 0,4));
//     System.out.println(str.substring(0,5));
// }
public static void main(String[] args) {
    String fruits[]={"apple","mango","banana"};

    String largest=fruits[0];
    for(int i=1;i<fruits.length;i++){
        if(largest.compareTo(fruits[i])<0){
            largest=fruits[i];
        }
    }
System.out.println(largest);
}
 


}

