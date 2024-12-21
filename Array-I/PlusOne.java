public class PlusOne {
        public static int[] plusOne(int[] digits) {
           
           if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
           }else{
            long number=0;
            int length=0;
            for(int i:digits){
    number=(number*10)+i;
            }
            number++;
    System.out.println(number);
    long number2=number;
         while (number>0) {
            number/=10;
            length++;
         }
         System.out.print(length);

       int[] arr=new int[length];
       int i=arr.length-1; 
       while (i>=0) {
        long r=number2%10;       
         arr[i]=(int)r;
        int d =arr[i];
        number2/=10;
        i--;
    
     }
       return arr;
        }}
    

        public static void main(String[] args){
            int[] digits={5,6,2,0,0,4,6,2,4,9};
int arr[]=plusOne(digits);

for (int i : arr) {
    System.out.print(i+" ");
}
     }
    }
