public class A_shadow {
    static int A = 10;
    public static void main(String[] args) {
        System.out.println(A); // we are able to access it 
        // because int A is declared in a higher scope.  
        // The concept of shadowing is something like this 
        A = 5; // we change the value but the question is  is it changed?
        System.err.println(A); // now what will be the output?
    //   output is 5 because we shadowed the main A to different value 
    //    which can be accessed by only in main class
    }
    
    static {
        // wha now ?
        // what is the value of A is?
        System.out.println(" this is static init");
        System.out.println(A); 
    }
}