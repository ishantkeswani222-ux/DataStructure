package Strings;
import java.util.Scanner;
public class PalindromeCheck {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any name : "+" ");
        String s = sc.nextLine();
        System.out.print(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int i = 0, j= s.length()-1;
        while (i<=j){
            if(s.charAt(i)!= s.charAt(j)) {
                return false;
            }
                i++;
                j--;

        }
        return true;

    }
}
