package Arrays;

public class RotateArray {
    public static void rotate(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void main(String[] args) {
        int[] arr = {6,8,1,2,4,9,0};
        int n = arr.length;
        int d  = 3;
        rotate(arr,0,d-1); // starting part from 6 to 1
        rotate(arr,d,n-1); // ending part 2 to 0
        rotate(arr,0,n-1); // whole array
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
