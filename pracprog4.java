abstract class shape{
    int a = 5;
    int b = 4;
    abstract void printArea();
}

class rectangle extends shape{
    void printArea(){
        System.out.println("Area of rectangle is "+ a*b);
    }
}

class square extends shape{
    void printArea(){
        System.out.println("Area of square is "+ a*a);
    }
}

class triangle extends shape{
    void printArea(){
        System.out.println("Area of triangle is "+ 0.5*a*b);
    }
}

class circle extends shape{
    void printArea(){
        System.out.println("Area of circle is "+ Math.PI*a*a);
    }
}

public class pracprog4 {
    public static void main(String[] args){
        rectangle r = new rectangle();
        r.printArea();
    }
}
