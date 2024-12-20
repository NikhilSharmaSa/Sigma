public class CountingSort {
    //Counting Sort Algorithm- Use in cases where the number of elements are fixed; //only works with positive integer values 
    public static void sort(int arr[]){
        //find max value in array
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max=Math.max(max, arr[i]);
        }
        int[] countarr=new int[max+1];
        //update count array
        for(int j=0; j<arr.length; j++){
countarr[arr[j]]++;
        }
    
        for (int i : countarr) {
            System.out.print(i+" ");
        }
        int j=0;
        for(int i=0; i<countarr.length; i++){
            while(countarr[i]>0){
arr[j]=i;
j++;
countarr[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={14,6,5,14,7,9,13};
        sort(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
}
