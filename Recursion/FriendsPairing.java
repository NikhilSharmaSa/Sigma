package Recursion;

public class FriendsPairing {
    //no of ways in which friends stands in a party single or in pairs.

    public static int countWays(int n){
        if(n==1 || n==2){
            return n;
        }

        return countWays(n-1)+countWays(n-2)*(n-1);
    }
    public static void main(String[] args) {
        System.out.println(countWays(4));
        
    }
}
