import java.io.*;
import java.util.*;

public class filehandling3 {

    private static boolean validate(String username, String password){
        try{
            File obj = new File("credentials.txt");
            Scanner reader = new Scanner(obj);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(" ");
                if (parts.length == 2){
                    String uname = parts[0];
                    String pass = parts[1];
                    if(uname.equals(username) && pass.equals(password)){
                        reader.close();
                        return true;
                    }
                }
            }
            reader.close();
        }catch(IOException e){
            System.out.println("An error has occured");
        }
        return false;
    }

    private static void writeToFile(String[] args){
        try{
            FileWriter writer = new FileWriter("output.txt");
            for(String arg : args){
                writer.write(arg + " ");
            }
            writer.close();
            System.out.println("Content written into output.txt");
        }catch(IOException e){
            System.out.println("An error has occured");
        }
    }
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Username: ");
            String username = s.nextLine();
            System.out.println("Enter password: ");
            String password = s.nextLine();
            s.close();
            boolean isValid = validate(username, password);
            if(isValid){
                System.out.println("Validation successful");
                writeToFile(args);
            }
            else{
                System.out.println("Invalid Credentials");
            }
    }

}
