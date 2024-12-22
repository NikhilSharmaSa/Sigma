package String;

public class CheckPal2 {
    
        public static boolean isPalindrome(String s) {
               if(s.length()==0 || s.length()==1){
                return true;
            }
            else{
      s=s.toLowerCase();
      String str=new String();
  
      for(int i=0; i<s.length(); i++){
        if(Character.isLetter(s.charAt(i))|| Character.isDigit(s.charAt(i))){
            str+=s.charAt(i);
        }
       
      }

      for(int i=0; i<str.length()/2; i++){
        if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
      }
    
      System.out.println(str);
      return true;
            }
    }


    public static void main(String[] args) {
        boolean ans=isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(ans);
    }
    }

