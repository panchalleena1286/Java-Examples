public class ExampleOnTC {
    public static void main(String[] args) {
        int sum = 0;
        int n =5;
        for(int i=0; i<n; i++)
        {
            sum += i;
        }

        System.out.println(sum);

        //TC = o(n)
        //SC = o(1)
    }
}
