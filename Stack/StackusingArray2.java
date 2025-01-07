public class StackusingArray2 {


    public static class Stack{
int top;
int capacity;
int[] arr;
public Stack(int length){
arr=new int[length];
this.capacity=length;
this.top=-1;
}

boolean isEmpty(){
    return top==-1;
    //check for is empty
}


boolean isFull(){
    return top==capacity-1;
}


void push(int data){
if(isFull()){
    System.out.println("Stack is Full!");
}else{
    arr[++top]=data;
    System.out.println(data +" Inserted Successfully !");
}
}

void pop(){
    if(isEmpty()){
        System.out.println("The Stack is Empty!");
    }else{
        System.out.println(arr[top]+" Removed Success!");
        arr[top--]=0;
       
       
    }
}


void peek(){
    if ((isEmpty())){
        System.out.println("The Stack is Empty!");
        
    }else{
System.out.println(arr[top]);
    }
}




    }
    public static void main(String[] args) {
        Stack s1=new Stack(5);
        s1.push(10);
        s1.push(20);
        s1.peek();
        s1.pop();
    s1.peek();
    s1.pop();
    s1.peek();
    }
}
