public class pracprog10 {
    public static <T extends Comparable<T>> T findMax(T[] arr){
        T max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i].compareTo(max)>0){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5};
        System.out.println(findMax(arr));
    }
}
