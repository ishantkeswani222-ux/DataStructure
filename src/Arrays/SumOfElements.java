package Arrays;
import java.util.Scanner;

public class SumOfElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int sum = 0;
        for (int i=0; i<arr.length;i++){
            System.out.print("enter array elements : "+" ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("Sum = "+sum);

    }
}
