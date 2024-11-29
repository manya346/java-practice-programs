import java.util.*;

public class prog5 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(1,4);
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == 4){
                System.out.println("4 is in the list");
            }
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
