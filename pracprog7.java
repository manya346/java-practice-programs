import java.io.*;
import java.util.*;

public class pracprog7 {
    public static void main(String[] args){
        String filename = "balances.txt";
        try{
            File f1 = new File(filename);
            Scanner s = new Scanner(f1);
            while(s.hasNextLine()){
                try{
                    String buff = s.nextLine();
                    double bal = Double.parseDouble(buff.trim());
                    pracprog6.checkBal(bal);
                }
                catch(myexception e){
                    System.out.println(e.getMessage());
                }
            }
            s.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
