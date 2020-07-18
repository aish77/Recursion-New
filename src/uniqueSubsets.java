import java.util.*;

public class uniqueSubsets {

    static Set<String> inputList = new HashSet<>();

    public static void main(String[] args) {
        solveSubsets("abcc", "");
    }
    static void solveSubsets(String input, String output){


        if(input.length() == 0){
            if(inputList.contains(output))
            return;
            inputList.add(output);
            System.out.println(output);
            return;
        }


        solveSubsets(input.substring(1), output);

        solveSubsets(input.substring(1), output+input.charAt(0));


        return;
    }
}
