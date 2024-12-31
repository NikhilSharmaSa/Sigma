package Recursion;

public class PrintNumbersTillN {
    public static void print(int n){
if(n==0){
    return ;
}

System.out.print(n+" ");
print(n-1);
return;
    }
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
}
