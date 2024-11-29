
public class prog3{
    public static <T extends Comparable <T>> T findMax(T[] arr){
        T max = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i].compareTo(max) >0){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Double[] arr = {1.4, 3.3, 7.2, 2.4, 8.6};
        System.out.println(findMax(arr)); 
    }
}