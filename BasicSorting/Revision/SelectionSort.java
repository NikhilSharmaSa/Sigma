package Revision;

public class SelectionSort {
    public static void sortS(int[] arr){
        for(int i=0; i<arr.length; i++){
         
            int k=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[k]>arr[j]){
                    
                    k=j;
                }
            }

            int temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
      
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,2,8,1,3};
        sortS(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
