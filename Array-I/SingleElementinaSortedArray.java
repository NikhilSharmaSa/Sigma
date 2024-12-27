public class SingleElementinaSortedArray {

    public static int findSingle(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]!=(mid!=0?arr[mid-1]:0)&& arr[mid]!=(mid!=arr.length-1?arr[mid+1]:0)){
                return arr[mid];
            }
          else if(mid%2==0 && arr[mid]==arr[mid+1] || mid%2!=0 && arr[mid]==arr[mid-1]){
           start=mid+1;
           }else {
            end=mid;
           }
           
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,8,8};
      System.out.println(findSingle(arr));
     
    }
}
