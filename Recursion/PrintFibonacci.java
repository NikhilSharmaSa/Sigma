package Recursion;

public class PrintFibonacci {
    public static int print(int num){
        if(num==0){
          
           return 0;
        }
        if(num==1){

return 1;
        }

      int n1= (print(num-1)); 
      int n2= (print(num-2));
  
    return n1+n2;
    
    }
    public static void main(String[] args) {
        int num=7;
  System.out.print(  print(num));
      
    }
}
