import java.util.*;
class Employee{
    String empName;
    int empId;
    String address;
    String mailId;
    double phNo;

    Scanner s = new Scanner(System.in);
    void getData(){
        System.out.println("Enter employee name:");
        empName = s.nextLine();
        System.out.println("Enter employee address:");
        address = s.nextLine();
        System.out.println("Enter employee mail ID:");
        mailId = s.nextLine();
        System.out.println("Enter employee ID:");
        empId = s.nextInt();
        System.out.println("Enter employee phone number:");
        phNo = s.nextDouble();
    }
    void display(){
        System.out.println("Employee name = "+ empName);
        System.out.println("Employee ID = "+ empId);
        System.out.println("Employee address = "+ address);
        System.out.println("Employee mail ID = "+ mailId);
        System.out.println("Employee phone number = "+ phNo);
    }

}

class Programmer extends Employee{
    double bp, da, hra, pf, cf, gross, net;
    void getProg(){
        System.out.println("Enter basic pay:");
        bp = s.nextDouble();
    }

    void calcProg(){
        da = 0.97*bp;
        hra = 0.10*bp;
        pf = 0.12*bp;
        cf = 0.001*bp;
        gross = bp+hra+da;
        net = gross - (pf+cf);
        System.out.println("For Programmer:");
        System.out.println("Basic Pay: "+bp);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("PF: "+pf);
        System.out.println("CF: "+cf);
        System.out.println("Gross: "+gross);
        System.out.println("Net: "+net);
    }

}

class AsstProf extends Employee{
    double bp, da, hra, pf, cf, gross, net;
    void getAsstProf(){
        System.out.println("Enter basic pay:");
        bp = s.nextDouble();
    }

    void calcAsstProf(){
        da = 0.97*bp;
        hra = 0.10*bp;
        pf = 0.12*bp;
        cf = 0.001*bp;
        gross = bp+hra+da;
        net = gross - (pf+cf);
        System.out.println("For Assitant Professor:");
        System.out.println("Basic Pay: "+bp);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("PF: "+pf);
        System.out.println("CF: "+cf);
        System.out.println("Gross: "+gross);
        System.out.println("Net: "+net);
    }

}

public class prog2 {
    public static void main(String[] args){
        int ch, cont=1;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1. Programmer");
            System.out.println("2. Assistant Professor");
            System.out.println("Enter your choice:");
            ch = s.nextInt();
            switch(ch){
                case 1:
                    Programmer p = new Programmer();
                    p.getData();
                    p.display();
                    p.getProg();
                    p.calcProg();
                    break;
                case 2:
                    AsstProf a = new AsstProf();
                    a.getData();
                    a.display();
                    a.getAsstProf();
                    a.calcAsstProf();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to continue? (1/0)");
            cont = s.nextInt();
        }while(cont==1);
        s.close();
    }
}
