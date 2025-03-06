import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Mango");
        linkedList.add("grapes");

        linkedList.add(1, "Orange"); 

        linkedList.remove(2);

        System.out.println(linkedList);

        System.out.println("LinkedList Elements: ");
        for(String fruit : linkedList){
            System.out.println(fruit);
        }
    }
    
}
