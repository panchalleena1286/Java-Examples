import java.util.Scanner;

public class MaximumOccuranceofCharInString {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //System.out.println("Enter the sentence: ");
        String s = "abcdefabca";

        int maxFreq = 0;
        char answer = ' ';
        for(int i=0; i<s.length(); i++)
        {
            char fixedCharacter = s.charAt(i);
                int currentFreq = 0;
            for(int j=1; j<s.length(); j++)
            {
                if(s.charAt(j) == fixedCharacter)
                {
                    currentFreq++;
                }
               
            }
            if (currentFreq > maxFreq) {
                
                maxFreq = currentFreq;
                answer = fixedCharacter;
            }
        }
        System.out.println(answer);
        System.out.println(maxFreq); 
    }
}
