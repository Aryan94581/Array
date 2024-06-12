import java.util.Arrays;

    public class A_reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] Array){
        int start = 0;
        int end = Array.length-1;
        //kab tak chlle loop
        while(start < end){
            swap(Array, start, end);
            start++;
            end--;
        }       
    }
    static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1]= array[index2];
        array[index2] = temp;
    }
}
