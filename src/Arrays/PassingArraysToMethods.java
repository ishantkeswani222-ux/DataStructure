package Arrays;

public class PassingArraysToMethods {
    public static void main(){
        int[] x =  {1,2,3,4,5};
        System.out.println(x[2]);
        Change(x);
        System.out.println(x[2]);

    }
    public static void Change(int[] x){
        x[2] = 99;

    }


}
