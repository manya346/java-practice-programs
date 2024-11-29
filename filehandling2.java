import java.io.*;
import java.util.*;
public class filehandling2 {
    public static void main(String[] args){
        try{
            File obj = new File("file1.txt");
            if(obj.createNewFile()){
                System.out.println("File Created");
            }
            else{
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("An error has occured");
        }
        try{
            FileWriter filewrite = new FileWriter("file1.txt");
            filewrite.write("Writing into file...");
            filewrite.close();
            System.out.println("Successfully written.");
        }catch(IOException e){
            System.out.println("An error has occuredd");
        }
        try{
            File obj = new File("file1.txt");
            Scanner reader = new Scanner(obj);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("An error has occured");
        }
    }
}
