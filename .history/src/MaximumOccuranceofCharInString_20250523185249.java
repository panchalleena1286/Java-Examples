import java.util.Scanner;

public class MaximumOccuranceofCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();

        //System.out.println("Enter the character for find frequency: ");
        char c = 'o';

        int count = 0;

        for(int i=0; i<s.length()-1; i++)
        {
            for(int j=1; j<s.length(); j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    count++;
                }
                System.out.println(s.charAt(i) + " = " + count);
            }
            
        }
        
    }
}
