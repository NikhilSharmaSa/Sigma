package OOPS;

public class BasicsofOops {
    public static void main(String[] args) {
        Pen p1= new Pen();
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.changeColor("red");
        System.out.println(p1.color);
    }
}
class Pen{
    String color="Blue";
    int tip=5;

    public void changeColor(String color){
        this.color=color;
    }

    public void changeTip(int tip){
        this.tip=tip;
    }
}