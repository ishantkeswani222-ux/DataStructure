package Arrays;

public class ReverseArray {
    static void main(String[] args) { // 2 pointer
        int[] arr = {1,2,3,4,5,6};
        int i = 0, j = arr.length-1;
        int temp ;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr) {
            System.out.print(ele +" ");
        }


    }
}