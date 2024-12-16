public class PrefixMaxsubArraySum {

    public static void prefixmaxSum(int arr[]){
int[] prefix= new int[arr.length];
int maxSum=Integer.MIN_VALUE;
int curr=0;
//calculate prefixarray
prefix[0]=arr[0];
        for(int i=1;i<arr.length; i++ ){
prefix[i]=prefix[i-1]+arr[i];
        }
    

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
             curr=i==0? prefix[j]:prefix[j]-prefix[i-1];
            }
            if (maxSum<curr) {
                maxSum=curr;
            }
        }
        System.out.println("The max sum is:"+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        prefixmaxSum(arr);
    }
}
