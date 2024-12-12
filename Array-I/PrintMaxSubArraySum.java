public class PrintMaxSubArraySum {
    //wap to find the max sum of subarray OR maximum subarray sum
    //WAP to find the minsum of subarray OR Minimum sbuarray sum
    public static void printmaxsubsum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                System.out.print("[ ");
                int total=0;
                for(int k=i; k<=j; k++){
                    total+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                if(maxSum<total){
                    maxSum=total;
                }
                if(minSum>total){
                    minSum=total;
                }
                System.out.print("]----->"+"the sum is:"+total);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The Max Sum of The Sub Arrays is:"+maxSum);
        
        System.out.println("The Min Sum of The Sub Arrays is:"+minSum);
      
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        printmaxsubsum(arr);
    }
}
