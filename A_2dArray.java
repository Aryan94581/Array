
import java.util.Arrays;

public class A_2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 4, 7, 12},
            {13, 15, 19, 11},
            {35, 12, 27, 1}
        };
        System.out.println("your value is found at index of :" + Arrays.toString(search(arr, 5)));
    }
    public static int[] search(int[][] array, int target){
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) { // iterating through rows
                for (int y = 0; y < array[i].length; y++) { // iterating through column 
                    if(array[i][y]== target){
                       return new int[]{i, y}; // returning values to new array
                    }
                    
                }
                
            }

        }
        return new int[]{-1, -1}; // no value found

    }
}
