
public class L_Wealth2DArray {
    public static void main(String[] args) {
    
    
    
    
    }
    static int maximumWealth(int[][] arr){
        
        int maxNo = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j <arr[i].length ; j++) {
                temp += arr[i][j];
                }
                if(temp > maxNo){
                    maxNo = temp;
                }
            }            
        return maxNo;
        }
}
    