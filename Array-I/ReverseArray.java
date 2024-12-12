public class ReverseArray {
    public static void reverse(int arr[]){
    int i=0;
    int j=arr.length-1;
    while(i<arr.length/2){
arr[i]+=arr[j];
arr[j]=arr[i]-arr[j];
arr[i]=arr[i]-arr[j];
        i++;
        j--;
    }
    }
    public static void main(String[] args) {
        int arr[]={4,8,12,89,55};
        reverse(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
