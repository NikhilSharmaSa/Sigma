package String;

public class StringCompression {
    public static String compress(String str){
        StringBuilder str1=new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            Integer count=1;
while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
count++;
i++;
}
str1.append(str.charAt(i));
if(count>1){
    str1.append(count);
}
        }


        return str1.toString();
    }
    public static void main(String[] args) {
        String str="abcdiii";
        System.out.println(compress(str));
    }
}
