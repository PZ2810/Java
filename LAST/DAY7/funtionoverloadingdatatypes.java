public abstract class funtionoverloadingdatatypes {
    //funt to cal int sum
    public static int sum (int a, int b){
        return a+b;

    }
    public static float sum(float a , float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 01));
        System.out.println(sum(5.2f, 1.8f));
    }
}
