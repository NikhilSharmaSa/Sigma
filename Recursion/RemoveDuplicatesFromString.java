package Recursion;

public class RemoveDuplicatesFromString {
    public static void removeDuplicate(String str, int index, StringBuilder newStr,boolean[] map){
if(index==str.length()){
    System.out.println(newStr);
    return;
}
if(map[str.charAt(index)-'a']!=true){

    newStr.append(str.charAt(index));
    map[str.charAt(index)-'a']=true;
}



removeDuplicate(str, index+1, newStr, map);

    }



   

    public static void main(String[] args) {
        boolean[] map= new boolean[26];
        StringBuilder newStr= new StringBuilder();
        String str="appnnacollege";
        removeDuplicate(str,0, newStr, map);
    }
}
