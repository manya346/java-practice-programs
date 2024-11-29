class Stack{
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    boolean isEmpty(){
        return(top<0);
    }
    Stack(){
        top = -1;
    }
    boolean push(int x){
        if(top>=MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top] = x;
            System.out.println(x+ " Pushed into stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
    }
    void print(){
        for(int i = top; i>-1; i--){
            System.out.println(a[i]);
        }   
    }
}

public class stackADT {
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(4);
        s.pop();
        s.push(3);
        s.peek();
        s.print();
    }
}
