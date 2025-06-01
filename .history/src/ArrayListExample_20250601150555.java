import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        //Insert element in ArrayList
        arr.add(1);
        arr.add(2);
        arr.add(3);

        //Size of ArrayList : 
        System.out.println(arr.size());

        //print ArrayList :
        int n = arr.size();
        for(int i=0; i<n; i++)
        {
            System.out.print(arr.get(i) + " ");
        }
        
    }
}
