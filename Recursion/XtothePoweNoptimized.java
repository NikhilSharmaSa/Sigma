package Recursion;

public class XtothePoweNoptimized {


    public static int findPower(int x, int n ){
        if(n==0){
            return 1;
        }

        int ok= findPower(x, n/2)*findPower(x, n/2);
        if(n%2!=0){
            ok=ok*x;
        }
        return ok;
       
    }

    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(findPower(x,n));
    }
}
