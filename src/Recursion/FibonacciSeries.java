package Recursion;
import java.util.Scanner;
public class FibonacciSeries {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        System.out.println(Fibo(n));
    }
    public static int Fibo(int n){
        if(n==0 || n==1) return n;
        return Fibo(n-1) + Fibo(n-2);
    }
}
