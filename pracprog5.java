import java.util.*;

public class pracprog5 {
    public static void main(String[] args){
        int n = 15;
        ArrayList <String> str = new ArrayList<String>(n);
        str.add("Apple");
        str.add("Bananana");
        str.add(2, "Orange");
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);
        Collections.sort(str, Collections.reverseOrder());
        System.out.println(str);
        for(int i=0; i<str.size(); i++){
            if(str.get(i)== "Orange"){
                System.out.println("Orange found");
            }
        }
    }
}
