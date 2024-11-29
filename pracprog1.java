import java.util.*;

class elecBill{
    int consumer_no;
    String consumer_name;
    int prev_month;
    int curr_month;
    int type;
}

public class pracprog1 {
    public static void main(String[] args){
        elecBill eb = new elecBill();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter consumer number: ");
        eb.consumer_no = s.nextInt();
        System.out.println("Enter Type of Bill(1 for domestic, 0 for commercial): ");
        eb.type = s.nextInt();
        System.out.println("Enter Prev Month reading: ");
        eb.prev_month = s.nextInt();
        System.out.println("Enter current month reading: ");
        eb.curr_month = s.nextInt();
        if(eb.type == 1){
            
            s.close();
        }
    }
}
