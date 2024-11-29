import java.util.*;
import java.io.*;

public class pracprog12 {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("Provide input");
            return;
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = s.nextLine();
        System.out.println("Enter password: ");
        String password = s.nextLine();
        boolean isValid = validate(username, password);
        if(isValid){
            String content = String.join(" ", args);
            try{
                FileWriter f1 = new FileWriter("output.txt");
                f1.write(content);
                f1.close();
            }
            catch(IOException e){
                System.out.println("Error");
            }
        }
        else{
            System.out.println("Invalid");
        }
        s.close();
    }
    public static boolean validate(String uname, String password){
        try{
            String input = "credentials.txt";
            File f1 = new File(input);
            Scanner read = new Scanner(f1);
            while(read.hasNextLine()){
                String line;
                line = read.nextLine();
                String[] part = line.split(" ");
                if(part.length == 2 && part[0].equals(uname) && part[1].equals(password)){
                    return true;
                }
                read.close();
            }
            read.close();
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }
        return false;
    }
}
