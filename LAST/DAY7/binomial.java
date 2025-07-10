public class binomial {
      public static int fac(int n ){
        int f = 1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;
    }
      public static int bincoeff(int n ,int r){
        int fac_n=fac(n);
        int fac_r=fac(r);
        int fac_nmr=fac(n-r);

        int bincoeff= fac_n/(fac_r * fac_nmr);
        return bincoeff;

    }
    public static void main(String[] args) {
        System.out.println(bincoeff(5, 02));
    }
}
