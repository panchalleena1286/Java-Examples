import java.util.HashSet;
import java.util.Set;


public static int lenghtOfSubString(String s){
        Set<Character> set = new HashSet<>();

        int left =0; right =0; max = 0;

        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max, right - left +1);
                right++;
            }
            else{
                set.remove(s.charAt(left);
                left++;
            }
        }
        return s.substring(start, start+max);
    }

public class Example {
  
    
}
