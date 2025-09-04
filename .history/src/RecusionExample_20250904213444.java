public class RecusionExample {

    void recr(int i, int n){
        if(i>n) return;

        System.out.println(i);

        recr(i+1, n);
    }
    public static void main(String[] args) {
        
    }
}
