package Recursion;

public class TillingPRoblem {
    //find the ways to place the tiles in board
    public static int noOfWays(int n){
if(n==0 || n==1) return 1;

        return noOfWays(n-1)+ noOfWays(n-2);
    }
    public static void main(String[] args) {
       
        System.out.println( noOfWays(6));
    }
}
