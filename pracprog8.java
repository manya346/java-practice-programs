import java.util.*;
import java.io.*;

public class pracprog8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String fname = s.next();
        File f1 = new File(fname);
        if(f1.exists()){
            System.out.println("File exists");
        }
        if(f1.canRead()){
            System.out.println("File is readable");
        }
        if(f1.canWrite()){
            System.out.println("File is writable");
        }
        System.out.println(f1.length());
        try{
            Scanner reader = new Scanner(f1);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        s.close();
    }
}
