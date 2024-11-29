class stack {
    static final int MAX = 100;
    int top;
    int a[] = new int[MAX];
    stack(){
        top = -1;
    }
    boolean push(int x){
        if(top>=MAX-1){
            System.out.println("Stack is full");
            return false;
        }
        else{
            a[++top] = x;
            return true;
        }
    }
    boolean isEmpty(){
        if(top<0){
            return true;
        }
        else{
            return false;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
    }
    void print(){
        for(int i=top; i>-1; i--){
            System.out.println(a[i]);
        }
    }
}

public class pracprog13{
    public static void main(String[] args){
        stack s = new stack();
        System.out.println(s.isEmpty());
        s.push(4);
        s.push(5);
        System.out.println(s.isEmpty());
        s.print();
    }
}
