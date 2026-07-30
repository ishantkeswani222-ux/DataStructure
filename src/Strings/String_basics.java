package Strings;

import java.util.Scanner;

public class String_basics {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
//        char[] arr = {'i','s','h','a','n','t'};
//        for (char ele : arr){
//            System.out.print(ele);
//        }
//        String Name = "ishant";
//        System.out.print(Name);

        // input string
        // nexline is important otherwise it will terminate when we
        System.out.println("enter your name : ");
        String Name = sc.nextLine();
        System.out.print(Name);
    }
}
