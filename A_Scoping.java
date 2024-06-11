public class A_Scoping {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(num);
        {
            System.out.println(num);  //this will not giving error because the value is in outer scope.
            int num2 = 5;           
        }
        System.out.println(num2); //this will raise error because we cannot excess a low scope value in outer scope .
    }
}
