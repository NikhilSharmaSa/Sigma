package LinkedList;
//Singly Linked List in java with three operations addLast removeLast and print linkedList
public class LinkedListCreation {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addLast(10);
        l1.addLast(20);
        l1.print();
        l1.removeLast();
        l1.print();
    }
}


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}


class LinkedList{
    Node head=null;

void addLast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        System.out.println(newNode.data+" inserted Successfully!");
    }else{
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        System.out.println(newNode.data+" inserted Successfully!");
        
    }
}


void removeLast(){
    if(head==null){
        System.out.println("There is no node inside the LinkedList!");
    }else{
        Node current= head;
        while (current.next.next!=null) {
current=current.next;
            
        }
        System.out.println(current.next.data+" Removed Successfully!");
current.next=null;


    }
}

void print(){
    Node current=head;
    while (current!=null) {
        System.out.print(current.data+"->");
        current=current.next;
        
    }
    System.out.println("Null");
}
}