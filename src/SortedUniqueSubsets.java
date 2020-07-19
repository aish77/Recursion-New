import java.util.Set;
import java.util.TreeSet;

public class SortedUniqueSubsets {
    static Set<String> inputList = new TreeSet<>();



    public static void main(String[] args) {
        solveSubsets("abcc", "");
        System.out.println(inputList);

    }
    static void solveSubsets(String input, String output){


        if(input.length() == 0){
            if(inputList.contains(output))
                return;
            inputList.add(output);

            return;
        }


        solveSubsets(input.substring(1), output);

        solveSubsets(input.substring(1), output+input.charAt(0));


        return;
    }
}
