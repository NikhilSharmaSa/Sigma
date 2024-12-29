package Recursion;

public class PrintSum {
    public static int print(int num){
        if(num==1){
            return 1;
        }

        return num+print(num-1);
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println( print(num));
       

    }
}
