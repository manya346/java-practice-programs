interface animal{
    void eat();
}

interface flyable{
    void fly();
}

class mammal implements animal{
    public void eat(){
        System.out.println("Mammal Eating");
    }
    void walk(){
        System.out.println("Mammal Walking");
    }
}

class bird implements flyable, animal{
    public void fly(){
        System.out.println("Bird Flying");
    }
    public void eat(){
        System.out.println("Bird Eating");
    }   
}

class bat extends mammal implements flyable{
    public void fly(){
        System.out.println("Bat flying");
    }
}


public class pracprog3 {
    public static void main(String[] args){
        bat b = new bat();
        b.eat();
        b.fly();
        b.walk();
    }
}
