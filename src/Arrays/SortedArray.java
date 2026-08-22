package Arrays;

public class SortedArray {
    static void main(String[] args) {
        int[] arr = {10,20,30,49,5};
        boolean sorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted==true)
            System.out.println("it is sorted");
        if(sorted==false)
            System.out.println("not sorted");
    }
}
