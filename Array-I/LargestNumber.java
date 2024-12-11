public class LargestNumber {
    //find Largest number inside the array
    public static int getLargest(int arr[]){
int largest=Integer.MIN_VALUE;
for (int i : arr) {
    if(largest<i){
        largest=i;
    }
}
return largest;
    }
    public static void main(String[] args) {
        int arr[]={12,88,14,16,1,3,89,15,32};
        int ans=getLargest(arr);
        System.out.println("The Largest Number in the array is:"+ ans);
    }
}
