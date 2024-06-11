public class A_Scoping {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(num);
        {
            System.out.println(num);  //this will not giving error because the value is in outer scope.
            int num2 = 5;           
        }
        // System.out.println(num2); //this will raise error because we cannot excess a low scope value in outer scope .
        // this concept is called scoping 
        for(int i = 0; i < 3; i++){
            System.out.println(i); // we can success it here in side the block but when we try this in outer code it
            //  will give error because the scop of i is only for the block.
        }
        // System.out.println(i);  // it said cant find the symbol 
    }
}
