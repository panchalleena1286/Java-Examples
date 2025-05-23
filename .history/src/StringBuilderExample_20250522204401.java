public class StringBuilderExample {
    public static void main(String[] args) {
        
        StringBuilder s = new StringBuilder("abc");

        s.append("def");

        System.out.println(s);

        //to convert  again in string 

        System.out.println(s.toString());
    }
}
