public class PrintSubarrays {
    //WAP to print sub arrays inside an array
    public static void printsub(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                System.out.print("[ ");
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println();
        }
      
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printsub(arr);
    }
}
