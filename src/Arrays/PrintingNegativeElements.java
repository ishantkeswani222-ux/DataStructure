package Arrays;

import java.util.Scanner;

public class PrintingNegativeElements {
    static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.println("enter an element : ");
            arr[i] = sc.nextInt();

        }
        int count  = 0;
        for (int i=0 ; i<arr.length; i++){
            if(arr[i]<0){
                System.out.println("negative number is : "+" "+arr[i]);
                count++;
            }
        }
       System.out.println("Total negative numbers are : "+" "+count);
    }
}
