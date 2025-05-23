public class StringPalindrome {
    public static void main(String[] args) {
        String s = "abccba";

        int i = 0;
        int j = s.length()-1;

        boolean isFlag = true;
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j)){
                isFlag = false;
                break;
            }
            
            i++;
            j--;
        }

        if (isFlag == true) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
