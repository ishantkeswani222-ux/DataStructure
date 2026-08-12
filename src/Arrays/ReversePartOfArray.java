package Arrays;

public class ReversePartOfArray {
    static void main(String[] args) {
        int[] arr = {2,34,55,66,90,10,13,45}; // wanted to reverse from 55 to 10
        int temp;
        int n = arr.length - 1;
        int i = 2, j =5;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }


    }
}
