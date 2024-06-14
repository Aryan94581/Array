//1295 find number with even number of digit
public class L_evenDigit {
    public static void main(String[] args) {
        int[] Array = {54345, 63233, 637, 677711, 15463, 13442, 19};
        System.out.println("total even digit Are " + evenDigit(Array));
    }
    public static int evenDigit(int[] arr){
        if(arr.length < 0){
         return -1;   
        }
        int evenValue = 0;
        
        for (int i : arr) {
            if(digit(i)%2 == 0){
                evenValue++;
            }
        }
    
        return evenValue;
    }
    public static int digit(int digit){
        int count = 0;
        while(digit > 0){
            count ++;
            digit = digit / 10;
        }
        return count;
    }
}
