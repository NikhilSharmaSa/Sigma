package Revision;

public class BinarySearch {
    public static int search(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
return -1;
    }
    public static void main(String[] args) {
        int[] arr={17,25,27,96,99,105};
  
        System.out.println(search(arr,99));

    }
}
