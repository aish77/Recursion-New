import java.util.HashSet;
import java.util.Set;

public class PermuationsWithRandomCaseChangeAndLetters {
   static Set<String> permutations = new HashSet<>();
    public static void main(String[] args) {
        String input = "A1b2";
        String output = "";
        solvePermutationsWithRandomCaseChangeAndLetters(input, output);
        System.out.println(permutations);
    }

    private static void solvePermutationsWithRandomCaseChangeAndLetters(String input, String output) {
        if(input.length() == 0){
        permutations.add(output);
        return;
        }
        solvePermutationsWithRandomCaseChangeAndLetters(input.substring(1), output+input.charAt(0));
        solvePermutationsWithRandomCaseChangeAndLetters(input.substring(1), output+changeCase(input.charAt(0)));
        return;
    }

    public static char changeCase(char c){
        if (Character.isUpperCase(c)){
            return Character.toLowerCase(c);
        }
        else{
            return Character.toUpperCase(c);
        }
    }


}
