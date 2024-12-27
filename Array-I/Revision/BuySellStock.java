package Revision;

public class BuySellStock {
    public static int buySell(int[] arr){
int buy=Integer.MAX_VALUE;
int maxProfit=0;
for(int i=0; i<arr.length; i++){
    if(buy<arr[i]){
        int profit=arr[i]-buy;
        if(maxProfit<profit){
            maxProfit=profit;
        }
    }
    else{
        buy=arr[i];
    }
}

return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(buySell(arr));
    }
}
