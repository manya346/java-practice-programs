import java.io.*;
import java.util.*;
public class filehandling1 {
    public static void main(String[] args){
        String fileName = "balances.txt";
        try{
            File obj = new File(fileName);
            Scanner reader = new Scanner(obj);
            while(reader.hasNextLine()){
                try{
                    String line = reader.nextLine();
                    double balance = Double.parseDouble(line.trim());
                    exceptionHandling.checkBalance(balance);
                }catch(myException e){
                    System.out.println(e.getMessage());
                }
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }    
}
