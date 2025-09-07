public class CountStairsWayGeeksforGeeks {

    void int countWays(int n){
        //n==1 , 1 way
        //n==2, 2 way
        if (n <= 2) {
            return n;
        }

        int answer = countWays(n-1) + countWays(n-2);
        System.out.println(answer);
    }
    public static void main(String[] args) {
        
    }
}
