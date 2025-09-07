import java.util.ArrayList;
import java.util.List;

public class SubsetLeetcode78 {
    
    List<List<Integer>> answer = new ArrayList<>();
    List<Integer> currentSeq = new ArrayList<>();

    void recur(int index, int nums[]){

        if (index == num.length) {

            answer.add(new ArrayList<Integer>(currentSeq));
            return;
            
        }


        //Option 1 - choose the Elelment 
        currentSeq.add(nums[index]);
        recur(index + 1, nums);
        currentSeq.remove(currentSeq.size()-1);


        //Option 2 - Ignore the element 
        recur(index+1, nums);

    }

    public static void main(String[] args) {
        
    }
}
