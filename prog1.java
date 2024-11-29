import java.util.Scanner;

class elecBill{
    int consumerNo;
    String consumerName;
    int prevMonthReading;
    int currMonthReading;
    int typeof;
    double bill;    
}

public class prog1{
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            elecBill eb = new elecBill();
            System.out.println("Enter consumer Number:");
            eb.consumerNo = s.nextInt();
            s.nextLine();
            System.out.println("Enter consumer Name:");
            eb.consumerName = s.nextLine();
            System.out.println("Enter previous month reading:");
            eb.prevMonthReading = s.nextInt();
            System.out.println("Enter current month reading:");
            eb.currMonthReading = s.nextInt();
            System.out.println("Enter type of EB connection(1 for domestic, 0 for commercial):");
            eb.typeof = s.nextInt();
            s.close();
            if(eb.typeof == 1){
                int reading = eb.currMonthReading - eb.prevMonthReading;
                if(reading>500){
                    eb.bill = 100*1 + 100*2.50 + 300*4 + (reading-500)*6;
                }
                else if(reading<500 && reading>200){
                    eb.bill = 100*1 + 100*2.50 + (reading-200)*4;
                }

                else if(reading>100 && reading<200){
                    eb.bill = 100*1 + (reading-100)*2.50;
                }
                else{
                    eb.bill = reading*1;
                }
            }
            else{
                int reading = eb.currMonthReading - eb.prevMonthReading;
                if(reading>500){
                    eb.bill = 100*2 + 100*4.50 + 300*6 + (reading-500)*7;
                }
                else if(reading<500 && reading>200){
                    eb.bill = 100*2 + 100*4.50 + (reading-200)*4;
                }

                else if(reading>100 && reading<200){
                    eb.bill = 100*2 + (reading-100)*4.50;
                }
                else{
                    eb.bill = reading*2;
                }
            }
            System.out.println("Consumer Number: "+eb.consumerNo);
            System.out.println("Consumer Name: "+eb.consumerName);
            System.out.println("Previous Month Reading: "+eb.prevMonthReading);
            System.out.println("Current Month Reading: "+eb.currMonthReading);
            System.out.println("Type of EB Connection: "+eb.typeof);
            System.out.println("Bill: "+eb.bill);
    }
}