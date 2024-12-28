public class KadaneAlgo {
    //get maximus subArraySum
    public static int maxSum(int arr[]){
int curr=0;
int max=Integer.MIN_VALUE;
for (int i : arr) {
    curr+=i;
    if(curr<0){
        curr=0;
    }
    if(max<curr){
        max=curr;
    }
}
return max;
    }
    public static void main(String[] args) {
        int [] arr={-2,-3,4,-1,-2,1,5,-3};
       int ans= maxSum(arr);
       System.out.println("The maxSubArraySum is :"+ans);
    }
}
