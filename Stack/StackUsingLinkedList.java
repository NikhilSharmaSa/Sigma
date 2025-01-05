public class StackUsingLinkedList {

    
 static class Node{
    int data;
    Node next;
  public   Node(int data){
this.data=data;
this.next=null;
    }
}
    static class Stack{
    Node head=null;
   
   
   void push(int data){
       Node newNode=new Node(data);
       if(head==null){
       head=newNode;
       }else{
         newNode.next=head;
         head=newNode;
       }
   
       return;
   }
   

   void pop(){
    if(head==null){
        System.out.println("The Stack is Empty!");
    }else{
        Node current=head;
       head=head.next;
        System.out.println(current.data);
    }
   }
   
   void peek(){
     
       if(head==null){
           System.out.println("The Stack is Empty!");
       }else{
           
           System.out.println(head.data);
       }
   }
   }
   
   
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.peek();
        s1.pop();
        s1.peek();
    }
}


