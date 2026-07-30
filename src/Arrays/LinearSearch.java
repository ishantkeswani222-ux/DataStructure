package Arrays;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 7;
        boolean flag = false;
        for (int i = 1; i <arr.length; i++) {
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        if(flag==true)
            System.out.println("target exits");
        else
            System.out.println("target does not exist");
    }
}
