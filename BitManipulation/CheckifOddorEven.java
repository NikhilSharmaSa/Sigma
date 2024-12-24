package BitManipulation;

import java.util.Scanner;

public class CheckifOddorEven {

    public static void oddEven(int n){
        if((n&1)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    public static void main(String[] args) {
        System.out.print("Please Enter the Number:");
        Scanner sc= new Scanner(System.in);
        oddEven(sc.nextInt());
        sc.close();

    }
}
