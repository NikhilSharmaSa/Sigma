public class FindTargetusingBinary {

    public static int search(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
int mid=(start+end)/2;
if(arr[mid]==key){
    return mid;
}else if(arr[mid]<key){
    start=mid+1;
}else{
    end=mid-1;
}

        }
return -1;
    }
    public static void main(String[] args) {
        /*There is an integer array nums sorted in ascending order (with distinct values).
        Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)
        such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,nums[k-1]] (0-indexed).
         For   example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums,
        or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.*/


        int arr[]={4,  5, 6, 7, 0, 1, 2};
        int key=5;
      int ans=  search(arr,key);
        if(ans==-1){
            System.out.println("The Element is not Found");
        }else{
            System.out.println("The Element is at index: "+ans);
        }
    }
}
