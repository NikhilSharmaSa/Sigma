package Revision;

public class BubbleSort {
    public static void sort(int[] arr){
for(int i=0; i<arr.length-1; i++){
    for(int j=i+1; j<arr.length; j++){
        if(arr[i]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
}
    }
    public static void main(String[] args) {
        int[] arr={-1,-2,-3,-4,-5};
    sort(arr);
    for (int i : arr) {
        System.out.print(i+" ");
    }
    }
    
}
