public class A_linearSearch {
public static void main(String[] args) {
    int[] Array = {5, 6, 3, 11, 13, 12, 19};
    System.out.println("Your element is at index of : " + linearSearch(Array, 22));
}
    static int linearSearch(int[] array, int target){
        if(array.length > 0){
            int i = 0;
            while(i < array.length-1) {
                if(target == array[i]){   
                    return i; 
                }
                i++;
            }
        } 
        return -1;
    }
}