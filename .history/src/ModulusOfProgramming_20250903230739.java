public class ModulusOfProgramming {

    public static void main(String[] args) {
         
        int N = 100;

        int MOD = 1000000000 + 7;
        int sum =0;

        for(int i=0; i<=N; i++){
            sum = sum + i;
            //sum = ((sum%MOD + sum%MOD)%MOD);
            
        }

        System.out.println(sum);
    }
}