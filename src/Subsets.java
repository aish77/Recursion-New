import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
     solveSubsets("abc", "");
    }

    static void solveSubsets(String input, String output){

        List<String> inputList = new ArrayList<>();


        if(input.length() == 0){
            inputList.add(output);
          System.out.println(inputList);
            return;
            }


        solveSubsets(input.substring(1), output);
        solveSubsets(input.substring(1), output+input.charAt(0));
        return;
        }

}



