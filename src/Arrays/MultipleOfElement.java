package Arrays;
import java.util.Scanner;

public class MultipleOfElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0;i <arr.length;i++){
            System.out.println("Enter the array element : " + (i+1));
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
             System.out.println("The multiple of "+ " "+ arr[i] +" "+"is : "+arr[i]*2);
        }

    }

}
