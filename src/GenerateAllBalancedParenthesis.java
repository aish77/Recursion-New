import java.util.ArrayList;
import java.util.List;

public class GenerateAllBalancedParenthesis {

    static List<String> outputList = new ArrayList<>();
    public static void main(String[] args) {
        int n=4;
        int open = n;
        int close = n;
        String output = "";
        solveGenerateAllBalancedParenthesis(open, close, output, outputList);
        System.out.println(outputList);
    }

    private static void solveGenerateAllBalancedParenthesis(int open, int close, String output, List outputList) {
        if(open == 0 && close == 0){
            outputList.add(output);
            return;
        }
        if(open != 0 ){
            // pass output 1 or concatenated output both are fine
//            String output1 = output+ "(" ;
            solveGenerateAllBalancedParenthesis(open - 1, close, output+"(", outputList);
        }
        if(close>open){
//            String output2 = output + ")";
            solveGenerateAllBalancedParenthesis(open, close - 1, output+")", outputList);
            return;
        }
    }
}
