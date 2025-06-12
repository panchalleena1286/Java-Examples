public class StringConsecutiveCharacter {

    public static void main(String[] args) {
         
        String str = "ATTCGGGA";

        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 1; // reset for new character
            }
        }

        System.out.println(maxCount);
    }
}