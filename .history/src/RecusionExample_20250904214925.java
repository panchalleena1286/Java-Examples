public class RecusionExample {

    void recr(int i, int n){
        if(i>n) return;

        System.out.print(i);

        recr(i+1, n);

        System.out.println();
        System.out.print(i);
    }
    public static void main(String[] args) {

        //int n = 5;

        RecusionExample re = new RecusionExample();

        re.recr(1, 5);
        
    }
}
