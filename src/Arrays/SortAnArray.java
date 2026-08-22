package Arrays;

public class SortAnArray {
    static void main(String[] args) {
       int[] arr = {2,1,3,4,6,7,8,5};
        for (int i = 0; i < arr.length-1; i++) { // n-1 passes
            for (int j = 0; j < arr.length-1-i; j++) { // n-1-i //i bcz after the every loop we got last element sorted
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            }
        for (int ele : arr){
            System.out.print(ele+" ");

        }
    }
}
