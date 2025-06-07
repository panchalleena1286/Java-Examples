import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.Element;

public class ExampleOnPascalTringle {

    public List<List<Integer>> generate (int numRows){

        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();

        firstRow.add(1);
         answer.add(new ArrayList<>(firstRow));
         int middleElement = 0;

         for (int i=1; i<=numRows; i++){
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            //middleElement 
             for(int j=1; j<=middleElement; j++){
            int element = answer.get(i-1).get(j) + answer.get(i-1).get(j-1);
            currentRow.add(element);
             }

             currentRow.add(1);

             answer.add(new ArrayList<>(currentRow));
             middleElement++;
         }
         return answer;
    }

    
}
