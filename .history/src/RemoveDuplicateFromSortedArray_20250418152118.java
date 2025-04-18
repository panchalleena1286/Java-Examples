public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicates(int ar[]){

        int i = 0;
        
        for(int j=0; j<ar.length; j++){
            if (ar[j] != ar[i])
            {
                i++;
                ar[i] =ar[j];
            }
        }
        return i+1;
    }
    
    public static void main(String[] args) {

        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));

        
    }
    
}
