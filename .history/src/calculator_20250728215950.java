public class calculator {

    @FunctionalInterface
interface Calculator{
int add(int a , int b);
}

     public static void main(String[] args) {
        Cal c = (a, b) -> a + b ;
        System.out.println(cal.add(5, 7));

        

        
     }
}
