package Recursion;
import java.util.Scanner;

public class IncreasingDecreasing {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        Print(n);
    }
    public static void Print(int n){
        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        System.out.print(n+" ");
        Print(n-1);
        System.out.print(n+" ");
    }

}
