package Revision;

public class TwoSum {

    public static int[] findIndexes(int nums[], int target){
        int[] arr=new int[2];
        int temp=target;

        for(int i=0; i<nums.length; i++){
if(nums[i]<=target){
    temp=temp-nums[i];
}
if(temp<=0){
    arr[0]=i;
    temp=nums[i];
    break;
}
        }

        for(int j=0; j<nums.length; j++){
            if(temp+nums[j]==target){
arr[1]=j;
break;
            }
        }
     
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={-1,-2,-3,-4,-5};
        int target=-8;
        int []ok=findIndexes(nums, target);
        for (int i : ok) {
            System.out.print(i+" ");
        }
    }
}
