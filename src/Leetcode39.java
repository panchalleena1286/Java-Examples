import java.util.ArrayList;
import java.util.List;

public class Leetcode39 {

    List<List<Integer>> answer = new ArrayList<>();
        List<Integer> currentSeq = new ArrayList<>();

    public void recur(int target, int[] candidates, int start){

        if (target == 0) {
            answer.add(new ArrayList<Integer>(currentSeq));
            return;
        }

        for(int i = start; i<candidates.length; i++){
            if (target >= candidates[i]) {
                currentSeq.add(candidates[i]);
                recur(target-candidates[i], candidates, i);
                currentSeq.remove(currentSeq.size()-1);
            }
        }
    }
    
    public static void main(String[] args) {
         int candidates[] = {2, 3, 5};
        int target = 8;

        Leetcode39 obj = new Leetcode39();
        obj.recur(target, candidates, 0);

        System.out.println(obj.answer);

    }
}
