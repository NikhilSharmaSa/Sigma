package String;

public class ToupperCase {
    public static void toupperCase(String str){
StringBuilder str1= new StringBuilder();
char ch=str.charAt(0);
str1.append(Character.toUpperCase(ch));

for(int i=1; i<str.length(); i++){
    if(str.charAt(i)==' '){
str1.append(str.charAt(i));
i++;
        str1.append(Character.toUpperCase(str.charAt(i)));
    
    }else{
        str1.append(str.charAt(i));
    }

}

System.out.println(str1);
    }
    public static void main(String[] args) {
        String str="hi, i am nikhil";
        toupperCase(str);
    }
}
