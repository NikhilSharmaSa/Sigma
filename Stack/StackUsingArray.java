public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack1=new Stack(10);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.peek();
        stack1.pop();
        stack1.peek();
stack1.pop();
stack1.peek();
stack1.pop();
stack1.peek();
    }
}

class Stack{
    int capacity;
      int top=-1;
   

    int arr[];
    Stack(int x){
        this.capacity=x;
arr=new int[x];


    }

    boolean isFull(){
        return top==capacity-1;
    }
    boolean isEmpty(){
       return top==-1;
    }


    void peek(){
        if(isEmpty()){
            System.out.println("The Stack is Empty");
        }else{
            System.out.println("The peek element is :"+arr[top]);
        }
    }


    boolean push(int num){
        if(isFull()){
            System.out.println("The stack is Full");
            return false;
        }else{
            arr[top+1]=num;
            top++;
            System.out.println("The element is inserted:"+ num);
            return true;
        }

    }



 boolean pop(){
    if(isEmpty()){
        System.out.println("The stack is Empty");
        return false;
    }
    else{
    System.out.println("The element is popped"+arr[top]);
        arr[top]=0;
        top--;
        return true;
    }
 }
}