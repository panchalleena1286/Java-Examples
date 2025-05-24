public class ReverseWordInString {

    public static void main(String[] args) {
        String s = "abc def ghi";
        int l = s.length();
        int count = 0;

        for(int i=0; i<l; i++)
        {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        count = count + 1; //to count last word of string
         
        String words[] = new String[count];

        int index = 0;
        String currentWord = " ";

        for(int i=0; i<l; i++)
        {
            if (s.charAt(i) != ' ') {
                currentWord = currentWord + s.charAt(i);
            }
            else
            {
                words[index] = currentWord;
                currentWord = " ";
                index++;
            }
        }

        words[index] = currentWord;//to store last word in the array
        reverse(words);

        for(int i=0; i<words.length; i++)
        {
            System.out.println(words[i] + " ");
        }
    }
    
}
