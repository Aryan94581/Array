public class A_2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 4, 7, 12},
            {13, 15, 19, 11},
            {35, 12, 27, 1}
        };
        System.out.println("your value is found at index of :" + search(arr, 17));
    }
    public static int[] search(int[][] array, int target){
        int x= -1;
        int x2 = -1; 
        int[] newArr = {x, x2};
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                for (int y = 0; y < array[i].length; y++) {
                    if(array[i][y]== target){
                        x = i;
                        x2 = y;
                        return newArr;
                    }
                    
                }
                
            }

        }
        return newArr;

    }
}
