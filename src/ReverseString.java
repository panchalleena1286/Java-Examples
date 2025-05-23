public class ReverseString {
    public static void main(String[] args) {
        
        String s = "abcdef";

        StringBuilder S = new StringBuilder(s);
        int i = 0;
        int j = S.length()-1;

        while(i<j)
        {
            //swap S[i]  and S[j]
            char temp = S.charAt(i);
            S.setCharAt(i, s.charAt(j));
            S.setCharAt(j, temp);

            i++;
            j--;
        }

        System.out.println(S);
    }
    
}
