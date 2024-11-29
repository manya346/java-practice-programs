abstract class Shape{
    int x = 2, y = 4;
    public abstract void printArea();
    public void display(){
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape{
    @Override
    public void printArea(){
        double area = x*y;
        System.out.println("Area of the rectangle is: "+ area);
    }
}

class Triangle extends Shape{
    @Override
    public void printArea(){
        double area = 0.5*x*y;
        System.out.println("Area of the Triangle is: "+ area);
    }
}

class Circle extends Shape{
    @Override
    public void printArea(){
        double area = 2*(Math.PI)*x*y;
        System.out.println("Area of the rectangle is: "+ area);
    }
}

public class abstraction{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.display();
        r.printArea();
    }
}