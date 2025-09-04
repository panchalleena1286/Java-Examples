public class FactorialUsingRecursion {
    
    static long fac(int n){

         if (n == 0 || n ==1 ) {
            return 1;
         }
        long answer = n * fac(n-1);

        return answer;
    }
    public static void main(String[] args) {
        int n =5;

        System.out.println(fac(n));
    }
}
