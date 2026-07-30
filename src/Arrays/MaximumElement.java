package Arrays;

public class MaximumElement {
    static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int max = arr[0];
        // other way to find that
        //int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("maxm element is : "+max);
    }
}
