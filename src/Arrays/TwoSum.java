package Arrays;

public class TwoSum {
    static void main(String[] args) {
         twoSum();

    }
    public static boolean twoSum(){
        int[] arr = {1,23,4,5,6,7};
        int target = 8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+ arr[j]==target);
                System.out.println("found");
                    return true;

            }

        }
    return false;
    }

}


