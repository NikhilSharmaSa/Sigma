class LinearSearch{

    public static int search(int arr[],int key){
for (int i=0; i<arr.length; i++) {
    if(arr[i]==key){
return i;
    }
   
}

return -1;

    }
    public static void main(String[] args) {
        int arr[]={15,46,78,11,89,852,14};
        int key=89;
       int ans= search(arr,key);
       if(ans==-1){
        System.out.println("The key is not Found");
       }
       else{
        System.out.println("The key is at index: "+ans);
       }
    }
}