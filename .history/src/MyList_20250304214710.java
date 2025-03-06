import java.util.ArrayList;
import java.util.List;
public class MyList {

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add(2, "Grapes");
        list.remove(0);


        System.out.println(list);

}
    
}
