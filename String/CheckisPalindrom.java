package String;

public class CheckisPalindrom {
    public static void check(String str){
        String str1= new String();
        for(int i=0; i<str.length(); i++){
            str1+=str.charAt(str.length()-1-i);
        }

       if(str.equals(str1)){
        System.out.println("Palindrome");
       }else{
        System.out.println("Not-Palindrome");
       }
    }
    public static void main(String[] args) {
        String str=new String("RACECAR");
        check(str);
    }
}
