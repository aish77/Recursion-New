public class PermutationsWithSpaces {
    public static void main(String[] args) {
        String input = "ABC";
        String output = "";

    solvePermutationsWithSpaces(input.substring(1), output+input.charAt(0));
    }
    static void solvePermutationsWithSpaces(String input, String output){

        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        solvePermutationsWithSpaces(input.substring(1), output+input.charAt(0));
        solvePermutationsWithSpaces(input.substring(1), output+" "+input.charAt(0));

        return;
    }
}
