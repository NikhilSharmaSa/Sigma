package Revision;

public class CountingSort {

    public static void sortC(int arr[]){
int max=Integer.MIN_VALUE;
for(int i=0; i<arr.length; i++){
    if(max<arr[i]){
        max=arr[i];
    }
}
//Counting Sort
//in java
int[] arr2=new int[max];

for(int j=0; j<arr.length; j++){
arr2[arr[j]-1]++;
}
int p=0;

for(int k=0; k<arr2.length; k++){
    while(arr2[k]>0){
        arr[p]=k+1;
        
        arr2[k]--;
        p++;
    }
}

    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        sortC(arr);
        System.out.println();
        for (int i : arr) {
           
            System.out.print(i+" ");
        }

    }
}
