package Recursion;

public class FirstOccurence {
    public static int findIndex(int arr[], int key, int index){
        if(index==arr.length){
            return -1;
        }
if(arr[index]==key){
    return index;
}


return findIndex(arr,key,index+1);

    }
    public static void main(String[] args) {
        int[] arr={5,8,3,6,9,10,2,3};
        int key=5;
        System.out.println(findIndex(arr,key,0));
    }
}
