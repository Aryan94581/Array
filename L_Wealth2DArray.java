
import java.util.ArrayList;
import java.util.Collections;

//richest-customer-wealth
public class L_Wealth2DArray {
    public static void main(String[] args) {
    
    
    
    
    }
    static int maximumWealth(int[][] arr){
        
        ArrayList<Integer> list = new ArrayList<>(); 
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j <arr[i].length ; j++) {
                temp += arr[i][j];
                }
                list.add(temp);
            }
            Collections.sort(list);
            int max = list.getLast();
        return max;
        }
}
    