import java.util.*;

class employee{
    String emp_name;
    int emp_id;
    String addr;
    String mail;
    int phone;
}

class programmer extends employee{
    double bp, da, hra, pf, cf, net, gross;
    void getData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        emp_name = s.next();
        System.out.println("Enter employee id: ");
        emp_id = s.nextInt();
        System.out.println("Enter Basic Pay: ");
        bp = s.nextDouble();
        s.close();
    }

    void calc(){
        System.out.println("FOR PROGRAMMER:");
        da = 0.97*bp;
        System.out.println("DA is:" + da);
        hra = 0.10*bp;
        System.out.println("HRA is:" + hra);
        pf = 0.12*bp;
        System.out.println("PF is:" + pf);
        cf = 0.001*bp;
        System.out.println("CF is:" + cf);
        gross = da+bp+hra;
        System.out.println("Gross is: " + gross);
        net = gross - pf - cf;
        System.out.println("net is:" + net);
        }
}

class asstprof extends employee{
    double bp, da, hra, pf, cf, net, gross;
    void getData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        emp_name = s.next();
        System.out.println("Enter employee id: ");
        emp_id = s.nextInt();
        System.out.println("Enter Basic Pay: ");
        bp = s.nextDouble();
        s.close();
    }

    void calc(){
        System.out.println("FOR ASSISTANT PROFESSOR:");
        da = 0.97*bp;
        System.out.println("DA is:" + da);
        hra = 0.10*bp;
        System.out.println("HRA is:" + hra);
        pf = 0.12*bp;
        System.out.println("PF is:" + pf);
        cf = 0.001*bp;
        System.out.println("CF is:" + cf);
        gross = da+bp+hra;
        System.out.println("Gross is: " + gross);
        net = gross - pf - cf;
        System.out.println("net is:" + net);
        }
}

class assocprof extends employee{
    double bp, da, hra, pf, cf, net, gross;
    void getData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        emp_name = s.next();
        System.out.println("Enter employee id: ");
        emp_id = s.nextInt();
        System.out.println("Enter Basic Pay: ");
        bp = s.nextDouble();
        s.close();
    }

    void calc(){
        System.out.println("FOR ASSOCIATE PROFESSFOR:");
        da = 0.97*bp;
        System.out.println("DA is:" + da);
        hra = 0.10*bp;
        System.out.println("HRA is:" + hra);
        pf = 0.12*bp;
        System.out.println("PF is:" + pf);
        cf = 0.001*bp;
        System.out.println("CF is:" + cf);
        gross = da+bp+hra;
        System.out.println("Gross is: " + gross);
        net = gross - pf - cf;
        System.out.println("net is:" + net);
        }
}

class prof extends employee{
    double bp, da, hra, pf, cf, net, gross;
    void getData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        emp_name = s.next();
        System.out.println("Enter employee id: ");
        emp_id = s.nextInt();
        System.out.println("Enter Basic Pay: ");
        bp = s.nextDouble();
        s.close();
    }

    void calc(){
        System.out.println("FOR PROFESSOR:");
        da = 0.97*bp;
        System.out.println("DA is:" + da);
        hra = 0.10*bp;
        System.out.println("HRA is:" + hra);
        pf = 0.12*bp;
        System.out.println("PF is:" + pf);
        cf = 0.001*bp;
        System.out.println("CF is:" + cf);
        gross = da+bp+hra;
        System.out.println("Gross is: " + gross);
        net = gross - pf - cf;
        System.out.println("net is:" + net);
        }
}

public class pracprog2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1.Programmer 2.Assistant Professor 3.Associate Professor 4.Professor");
        int ch = s.nextInt();
        if(ch == 1){
            programmer p = new programmer();
            p.getData();
            p.calc();
        }
        else if(ch == 2){
            asstprof a = new asstprof();
            a.getData();
            a.calc();
        }
        else if(ch == 3){
            assocprof ap = new assocprof();
            ap.getData();
            ap.calc();
        }
        else if(ch == 4){
            prof pr = new prof();
            pr.getData();
            pr.calc();
        }
        else{
            System.out.println("Invalid");
        }
        s.close();
    }
}
