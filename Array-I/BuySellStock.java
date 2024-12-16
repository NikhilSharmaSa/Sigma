public class BuySellStock {
    public static int getprofit(int[] prices){
int buy=Integer.MAX_VALUE;
int maxProfit=0;
for(int i=0; i<prices.length; i++){
    if(buy<prices[i]){
        int profit=prices[i]-buy;
        if(maxProfit<profit){
             maxProfit=profit;
        }
        }else{
            buy=prices[i];
    }
}
return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices={7, 6, 4,  1, 5};
        int profit=getprofit(prices);
        System.out.println(profit);

    }
}
