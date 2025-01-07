public class All4Sorting {
    //bubble sort
public static void bubbleSort(int arr[]){
for(int i=0; i<arr.length-1;i++){
    for(int j=0; j<arr.length-(i+1);j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
        }
    }
}
}

//Selection sort 

public static void selectionSort(int arr[]){
for(int i=0; i<arr.length-1; i++){
    int index=i;
    for(int j=i; j<arr.length; j++){
        if(arr[index]>arr[j]){
            index=j;
        }
    }

    //swap
    int temp=arr[i];
    arr[i]=arr[index];
    arr[index]=temp;
}
}



//insertion sort
public static void insertionSort(int arr[]){
    for(int i=1; i<arr.length; i++){
int curr=arr[i];
int prev=i-1;

while(prev>=0 && arr[prev]>curr){
    arr[prev+1]=arr[prev];
    prev--;
}

arr[prev+1]=curr;
    }
}


//countSort
public static void countSort(int arr[]){
    //find max
int max=Integer.MIN_VALUE;
for(int i=0; i<arr.length; i++){
    max=Math.max(max, arr[i]);
}
//create countarr
int[] countarr=new int[max+1];

//update countarr
for(int i=0; i<arr.length; i++){
    countarr[arr[i]]++;

}

//sorting with countarr this is a counting Sort techniqe
int j=0;
for(int i=0; i<countarr.length; i++){
while (countarr[i]>0) {
arr[j]=i;
j++;
countarr[i]--;    
}
}
}

    public static void main(String[] args) {
        int arr[]={14,16,12,8,9,6,15,16,3,1};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
