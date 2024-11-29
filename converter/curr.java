package converter;
import java.util.Scanner;

public class curr {
    double dol, inr, euro, yen;
    int ch;
    Scanner sc = new Scanner(System.in);
    public void read(){
        System.out.println("Enter a choice:");
        System.out.println("1. DOLLAR TO INR/ INR TO DOLLAR");
        System.out.println("2. YEN TO INR/ INR TO YEN");
        System.out.println("3. EURO TO INR/ INR TO EURO");
        ch = sc.nextInt();
    }
    public void convert(){
    int type;
    double res;
    switch(ch){
        case 1:
            System.out.println("Choose conversion:");
            System.out.println("1. DOLLAR TO INR");
            System.out.println("2. INR TO DOLLAR");
            type = sc.nextInt();
            switch(type){
                case 1:
                    System.out.println("DOLLARS: ");
                    dol = sc.nextDouble();
                    res = dol*83.72;
                    System.out.println("INR: "+ res);
                    break;
                case 2:
                    System.out.println("INR: ");
                    inr = sc.nextDouble();
                    res = inr*0.012;
                    System.out.println("DOLLAR: "+ res);
                    break;
                }
            break;
        case 2:
            System.out.println("Choose conversion:");
            System.out.println("1. YEN TO INR");
            System.out.println("2. INR TO YEN");
            type = sc.nextInt();
            switch(type){
                case 1:
                    System.out.println("YEN: ");
                    yen = sc.nextDouble();
                    res = yen*0.55;
                    System.out.println("INR: "+ res);
                    break;
                case 2:System.out.println("INR: ");
                    inr = sc.nextDouble();
                    res = inr*1.83;
                    System.out.println("YEN: "+ res);
                    break;
                }
            break;
        case 3:
            System.out.println("Choose conversion:");
            System.out.println("1. EURO TO INR");
            System.out.println("2. INR TO EURO");
            type = sc.nextInt();
            switch(type){
                case 1:
                    System.out.println("EURO: ");
                    euro = sc.nextDouble();
                    res = yen*90.93;
                    System.out.println("INR: "+ res);
                    break;
                case 2:
                    System.out.println("INR: ");
                    inr = sc.nextDouble();
                    res = inr*0.011;
                    System.out.println("EURO: "+ res);
                    break;
                }
            break;
        }
    }
}
