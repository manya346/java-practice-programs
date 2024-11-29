import java.util.*;
import java.io.*;

public class prog4 {
    public static <T extends Comparable <T>> List<T> joinLists(List<T> arr1, List<T> arr2){
        List<T> finalList = new ArrayList<T>();
        finalList.addAll(arr1);
        finalList.addAll(arr2);
        return finalList;
    }
    public static void main(String[] args){
        // List<String> arr1 = new ArrayList<String>();
        // arr1.add("manya");
        // arr1.add("helloo");
        // arr1.add("ok");
        // List<String> arr2 = new ArrayList<String>();
        // arr2.add("List2");
        // arr2.add("okok");
        List<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        List<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(3);
        arr2.add(4);
        System.out.println(joinLists(arr1, arr2));
        // List<String> resList = joinLists(arr1, arr2);
        List<Integer> resList = joinLists(arr1, arr2);
        File obj = new File("file2.txt");
        try{
            if(obj.createNewFile()){
                System.out.println("New File has been created.");
            }
            else{
                System.out.println("File Already Exists");
            }
        }catch(IOException e){
            System.out.println("File not found");
        }
        try{
            FileWriter writer = new FileWriter(obj);
            // String resStr = String.join(" ", resList);
            // writer.write(resStr);
            for(Integer num : resList){
                writer.write(num.toString());
            }
            System.out.println("Writing into file...");
            writer.close();
        }catch(IOException e){
            System.out.println("Error");
        }
        try{
            Scanner reader = new Scanner(obj);
            String data;
            while(reader.hasNextLine()){
                data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }
    }
}
