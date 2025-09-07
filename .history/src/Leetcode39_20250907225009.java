import java.util.ArrayList;
import java.util.List;

public class Leetcode39 {

    List<List<Integer>> answer = new ArrayList<>();
        List<Integer> currentSeq = new ArrayList<>();

    public void recur(int target, int[] candidates, int start){

        if (target == 0) {
            answer.add(new ArrayList<Integer>(currentSeq));
        }
    }
    
    public static void main(String[] args) {
        
    }
}
