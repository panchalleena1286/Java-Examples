public class StringBuilderExample {
    public static void main(String[] args) {
        
        StringBuilder s = new StringBuilder("abc");

        s.append("def");
        s.setCharAt(0, 'A');

        System.out.println(s);

        //to convert  again in string 

        System.out.println(s.toString());
    }
}
