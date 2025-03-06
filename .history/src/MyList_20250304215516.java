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
        list.set(1, "papaya");
        list.size();

        list.forEach(item -> System.out.println(item));

        System.out.println(list);
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Size of list: "+ list.size());

}
    
}
