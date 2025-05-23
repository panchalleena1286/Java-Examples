import java.util.Scanner;

public class ExampleOnString8 {

    public static boolean match(String s, String t, int startIndex){
        int i = startIndex; //s string 
        int j = 0;//t string 

        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i) != t.charAt(j))
            {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Write the Sentence: ");

        String s = sc.nextLine();

        System.out.println("Enter the word to find index from sentence: ");

        String w = sc.next();

        for(int i=0; i<s.length()-1; i++)//starting point
        {
            if(match(s, w, i) == true)
            {
                System.out.print(i + " ");
            }
        }

    }
}
