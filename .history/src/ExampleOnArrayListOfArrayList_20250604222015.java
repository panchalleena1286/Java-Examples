import java.util.*;
public class ExampleOnArrayListOfArrayList {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();

        ArrayList<Integer> row = new ArrayList<>();

       row.add(1);
       row.add(2);
       row.add(3);
       row.add(4);

       ar.add(new ArrayList<>(row));//[[1,2,3]]

       System.out.println(ar);

       row.remove(2);

       ar.add(new ArrayList<>(row));

       System.out.println(ar);;




    }
}
