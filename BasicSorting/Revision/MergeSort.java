package Revision;

public class MergeSort {
    public static void mergeS(int arr[],int start, int end){
        if(start>end){
            return ;
        }
        int mid=start+(end-start)/2;
        mergeS(arr, start, mid);
        mergeS(arr, mid+1, end);
        mergeBoth(arr,start,mid,end);
    }

    //merge method
    public static void mergeBoth(int arr[], int start, int mid, int end){
int [] temp=new int[end-start+1];


    }
    public static void main(String[] args) {
        int [] arr={14,16,10,8,45,23};
        mergeS(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
