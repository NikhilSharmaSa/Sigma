public class RotateArray {


    public static void reverse(int arr[], int start, int end){
while(start<end){
int temp=arr[end];
arr[end]=arr[start];
arr[start]=temp;

start++;
end--;
}

    }
    public static void rotate(int arr[], int key){
key%=arr.length;
reverse(arr,0,arr.length-1);
reverse(arr, 0, key-1);
reverse(arr, key,arr.length-1);



    }
    public static void main(String[] args) {
        int[] arr={14};
    
        int key=3;
        rotate(arr, key);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
