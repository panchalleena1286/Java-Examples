import java.util.Scanner;

public class Leetcode1390 {

    // public int sumFourDivisors(int[] nums) {
        
    //     int N = 100000+1;
    //     int countDivisor[] = new int[N];
    //     int sumDivisor[] = new int[N];

    //     for(int i=1; i<N; i++){
    //         for(int j=i; j<N; j+=i){

    //             countDivisor[j]++;
    //             sumDivisor[j] += i;
    //         }
    //     }
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = 100000+1;
        int countDivisor[] = new int[N];
        int sumDivisor[] = new int[N];

        for(int i=1; i<N; i++){
            for(int j=i; j<N; j+=i){

                countDivisor[j]++;
                sumDivisor[j] += i;
            }
        }

        int n = sc.nextInt();
        int nums[] = new int[n];

        int count = 0;
        int len = nums.length;

        for(int i=0; i<len; i++){
            if (countDivisor[nums[i]] == 4) {
                count += sumDivisor[nums[i]];
            }
        }

        System.out.println(count);
    }
    
}
