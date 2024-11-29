import java.util.Scanner;
public class genericFunction {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of items in array:");
        int n = s.nextInt();
        Integer[] intArr = new Integer[n];
        System.out.println("Enter " + n + " elements");
        for(int i=0; i<n; i++){
            intArr[i] = s.nextInt();
        }
        Double[] doubleArr = {1.1, 2.2, 3.3, 5.5}; 
        String[] strArr = {"apple", "banana","zozo", "orange"};
        Integer maxInt = findMax(intArr);
        Double maxDouble = findMax(doubleArr);
        String maxStr = findMax(strArr);
        System.out.println(maxInt);
        System.out.println(maxDouble);
        System.out.println(maxStr);
        s.close();
    }
    
    public static <T extends Comparable <T>> T findMax(T[] arr){
        T max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i].compareTo(max)>0){
                max = arr[i];
            }
        }
        return max;
    }    
}
