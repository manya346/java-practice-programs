import java.util.Random;

class squ extends Thread{
    int x;
    squ(int a){
        x = a;
    }
    public void run(){
        int squ = x*x;
        System.out.println("Square is " + squ);
    }
}

class cub extends Thread{
    int x;
    cub(int a){
        x = a;
    }
    public void run(){
        int cub = x*x*x;
        System.out.println("Cube is " + cub);
    }
}

class num extends Thread{
    public void run(){
        Random random = new Random();
        for(int i=0; i<100; i++){
            int rand = random.nextInt(100);
            if(rand%2==0){
                squ s = new squ(rand);
                s.start();
            }
            else{
                cub c = new cub(rand);
                c.start();
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class pracprog9 {
    public static void main(String[] args){
        num n = new num();
        n.start();
    }
}
