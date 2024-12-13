public class SmallestNumber {
    //find Smallest Number inside the Array
    public static int getSmallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for (int i : arr) {
            if(smallest>i){
                smallest=i;
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={12,77,88,126,14,789,85,235,11,6,145,8466,523};
        System.out.println("The smallest array inside the array is:"+ getSmallest(arr));
        

    }
}
