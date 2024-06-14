public class A_liSearchString {
    public static void main(String[] args) {
        String name = "Aryan Swami";
        System.out.println(StringSearch(name, 'w'));
    }
    public static boolean  StringSearch(String Name, char target){
        if(Name.length() > 0 ){
            for (int i = 0; i < Name.length(); i++) {
                if(target == Name.charAt(i) ){
                    return true;
                }
            }
        }
        return false;
    }
}
