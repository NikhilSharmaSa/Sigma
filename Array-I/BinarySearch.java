public class BinarySearch {
    //Binary Search Algorithm-Prerequisite Sorted Arrays
    public static int search(int arr[], int key){
        int start=0;
        int end=arr.length-1;
    
        while (start<=end) {
            int mid=(start+end)/2;
             if(key==arr[mid]){
                return mid;
             }
             else if(key<arr[mid]){
                end=mid-1;
             }else if(key>arr[mid]){
                start=mid+1;
             }
        }
        
return -1;
       
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12}; //sorted Array
        int key=18;
      
        System.out.println("the key at the index:"+ search(arr,key));
    }
}
