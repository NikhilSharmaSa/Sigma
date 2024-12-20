public class SelectionSort {
    //selection sort implementation--O(n2)
    public static void sort(int arr[]){
for(int i=0; i<arr.length-1; i++){

    int index=i;
    for(int j=i+1; j<arr.length; j++){
        if(arr[index]>arr[j]){
            index=j;
        }
    }
    //swap elements
    int temp=arr[i];
    arr[i]=arr[index];
    arr[index]=temp;

}
    }
    public static void main(String[] args) {
        int arr[]={17,20,25,6,14,13,0,2,4};
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
