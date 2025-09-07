public class CountStairsWayGeeksforGeeks {

    public static int countWays(int n){
        //n==1 , 1 way
        //n==2, 2 wayvoid 
        if (n <= 2) {
            return n;
        }

        int answer = countWays(n-1) + countWays(n-2);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(countWays(4));
    }
}
