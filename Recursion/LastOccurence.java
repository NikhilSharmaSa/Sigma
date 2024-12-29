package Recursion;

public class LastOccurence {
    public static int findLast(int arr[],int key, int index){
if(index==arr.length){
    return -1;
}

int isFound=findLast(arr, key, index+1);
// if(isFound!=-1){
// return isFound;
// }

// if(arr[index]==key){
//     return index;
// }
if(isFound==-1 && arr[index]==key) return index;
return isFound;

    }
    public static void main(String[] args) {
        int[] arr={5,7,8,6,5,4};
        System.out.println(findLast(arr,5,0));
    }
}
