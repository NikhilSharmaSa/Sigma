package Revision;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        
    Integer arr[]={14,156,1874,123,665,120};
        //ascending Order
        // Arrays.sort(arr);
Arrays.sort(arr);
        //decending Order
        Arrays.sort(arr,Collections.reverseOrder());
for (int i : arr) {
    System.out.print(i+" ");
}
    }
}
