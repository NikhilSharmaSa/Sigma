package Recursion;

import java.util.ArrayList;

public class BinaryStringUsingArrayList {

    public static void setString(int n, int lastplace, ArrayList <String> list, String str){
        if(n==0){
            list.add(str);
            return;
        }

        if(lastplace==0){
            setString(n-1,1, list,str+"1");
        }else{
            
            setString(n-1,0, list,str+"0");
            
            setString(n-1,1, list,str+"1");
        }

    }
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();

        setString(3,0,list,"");
        setString(3,1,list,"");
        

        for (String item : list) {
            System.out.println(item);
        }
    }
}
