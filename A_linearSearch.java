public class A_linearSearch {
public static void main(String[] args) {
    System.out.println(linearSearch(Array, 12));
}
    static int linearSearch(int[] array, int target){
        if(array.length > 0){
            int i = 0;
        while(i < array.length-1) {
            if(target == array[i]){
                System.out.println("Your element is at index of i");   
            }
            i++;
        }
        return i; 
        }
        return -1;
    }
}