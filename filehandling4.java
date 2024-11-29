import java.util.*;
import java.io.*;

public class filehandling4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = s.next();
        File file = new File(fileName);
        System.out.println("Checking file at "+ file.getAbsolutePath());
        if(file.exists()){
            System.out.println("File exists");
        }
        else{
            System.out.println("File does not exist");
        }
        if(file.canRead()){
            System.out.println("File is Readable");
        }
        else{
            System.out.println("File is not readable");
        }
        if(file.canWrite()){
            System.out.println("File is writeable");
        }
        else{
            System.out.println("File is not writeable");
        }
        System.out.println(file.length() + "bytes");
        s.close();
        try{
            FileWriter file2 = new FileWriter("file2.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
                String newStr = data.replaceAll("\\s", "");
                System.out.println(newStr);
                file2.write(newStr);
            }
            file2.close();
            reader.close();
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}
