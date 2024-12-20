public class InsertionSort {
    //insertion sort -finding the correct position using while loop-O(n2)
    public static void sort(int arr[]){
for(int i=1; i<arr.length; i++){
    int curr=arr[i];
    int prev=i-1;
    while (prev>=0 && arr[prev]>curr) {
        arr[prev+1]=arr[prev];
        prev--;
    }
    arr[prev+1]=curr;
}
    }
    public static void main(String[] args) {
        int arr[]={14,23,6,1,5,4,16,789,456};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
       sort(arr);
       for (int i : arr) {
        System.out.print(i+" ");
       }

    }
}
