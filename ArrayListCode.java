import java.util.ArrayList;
public class ArrayListCode {
    public static void main(String[] args) {
        //TO declare a ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(41);
        list.add(42);
        list.add(43);
        list.add(41);
        list.add(48);
        
        // check if the value is there or not
        if(list.contains(42)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(list.contains(2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        // delete Item from list
        list.remove(48);
        // for Print list
        System.out.println(list);
        if(list.contains(48)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}