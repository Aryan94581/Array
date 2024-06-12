public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {11, 4, 12, 25, 16, 3, 9};
        System.out.print("Maximum one :");
        System.out.println(maxNum(arr));
        System.out.print("Minimum One :");
        System.out.println(minNum(arr));
        System.out.println("Maximum between indexes");
        System.out.println(maxRange(arr, 1, 4));
        }
    static int maxNum(int[] Array){
        int a = Array[0];
        for (int i : Array) {
            if( i > a){
                a = i;
            }
        }
        return a;
    }
    static int maxRange(int[] Array , int start , int end){
        int maxVal = Array[start];
        for (int i = start; i <= end ; i++) {
            if(Array[i] > maxVal){
                maxVal = Array[i];
            }
        }
        return maxVal;
    }
    static int minNum(int[] Array){
        int a = Array[0];
        for (int i : Array) {
            if( a > i){
                a = i;
            }
        }
        return a;
    }
        
}
