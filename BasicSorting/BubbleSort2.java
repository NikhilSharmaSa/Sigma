public class BubbleSort2 {
    //bubble sort implementation-O(n2)
    public static void sort(int arr[]){
for(int i=0; i<arr.length-1; i++){
    for(int j=0;j<arr.length-(1+i); j++){
if(arr[j]>arr[j+1]){
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
}

    }
}


    }
    public static void main(String[] args) {
            int arr[]= {17,20,14,0,13,15,6};
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
