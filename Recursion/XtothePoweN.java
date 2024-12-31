package Recursion;

public class XtothePoweN {
    public static int findPower(int x, int n){
        if(n==1){
            return x;
        }

        return x*findPower(x, n-1);
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(findPower(x,n));
    }
}
