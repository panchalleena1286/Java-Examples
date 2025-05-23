import java.util.Scanner;

public class TargetCharacterInString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Wriite the Sentence: ");
        String s = sc.nextLine();

        char T = 'o';

        for(int i=0; i<s.length()-1; i++)
        {
            if(s.charAt(i) == T)
            {
                System.out.println(i);
            }
        }
    }
    
}
