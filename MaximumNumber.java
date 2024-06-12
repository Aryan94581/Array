public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 6, 3, 9};
        System.out.println(MaxNum(arr));
    }
    static int MaxNum(int[] Array){
        int a = Array[0];
        for (int i : Array) {
            if( i > a){
                a = i;
            }
        }
        return a;
    }
}
