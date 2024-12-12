public class PrintSubArraySum {
    //WAP to print sub array sum
    public static void printsubsum(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                System.out.print("[ ");
                int total=0;
                for(int k=i; k<=j; k++){
                    total+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]----->"+"the sum is:"+total);
                System.out.println();
            }
            System.out.println();
        }
      
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printsubsum(arr);
    }
}
