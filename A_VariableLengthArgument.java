
import java.util.Arrays;

public class A_VariableLengthArgument {
    public static void main(String[] args) {

        Fun(2,5,6,7,5,4,5,6,5,4,3,4,5,6);

    }
    public static void Fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
