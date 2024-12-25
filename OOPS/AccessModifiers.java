package OOPS;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount p1=new BankAccount();
        System.out.println(p1.userName);
        p1.setPassword("N1i2k3h45");
System.out.println(p1.getPassword());


    }
}


class BankAccount{
    String userName="Nikhil";
     private String password;
     void setPassword(String pwd){
        this.password=pwd;
     }
     String getPassword(){
        return this.password;
     }
}