public class SortedSquare {
    public static void squaresorted(int arr[]){
        for(int i=0; i<arr.length; i++){
arr[i]=arr[i]*arr[i];
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
System.out.println();
       sort(arr);
    }

    public static void sort(int arr[]){
for(int i=0; i<arr.length-1; i++){
    for(int j=i+1; j<arr.length; j++){
        if(arr[i]>arr[j]){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}

    }
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
        squaresorted(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
