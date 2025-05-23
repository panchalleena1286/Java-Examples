public class ExampleOnString7 {

    //Convert Integer to String and String to Integer
    public static void main(String[] args) {

        int a = 12;

        //Integer to String 
        String s = Integer.toString(a);
        
        System.out.println(s);

        //String to Integer
        int b = Integer.parseInt(s);

        System.out.println(b);
    }
}
