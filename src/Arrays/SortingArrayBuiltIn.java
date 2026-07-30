package Arrays;
import java.util.Arrays;

public class SortingArrayBuiltIn {
    static void main(String[] args) {
        int[] arr = {1,3,56,8,4,5};
        Print(arr);
        Arrays.sort(arr);
        Print(arr);
    }

    public static void Print(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
