public class BubbleSort {
//Basic Bubble Algorithm
    public static void bubble(int arr[]){
        for(int j=0; j<arr.length-1; j++){
            for(int i=0; i<arr.length-(j+1); i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
        }
      
        }
    }
 public static void main(String[] args) {
 int arr[]={17,20,23,4,6,2,1};
bubble(arr);
for (int i : arr) {
    System.out.print(i+" ");
}
}

}
