public class PermutationsWithCaseChange {
    public static void main(String[] args) {
        String input = "abc";
        String output = "";
        solvePermutationsWithCaseChange(input, output);
    }

    private static void solvePermutationsWithCaseChange(String input, String output) {
        if (input.length() == 0){
            System.out.println(output);
            return;
        }
        solvePermutationsWithCaseChange(input.substring(1), output+input.charAt(0));
        solvePermutationsWithCaseChange(input.substring(1), output + Character.toUpperCase(input.charAt(0)));
        return;
    }
}
