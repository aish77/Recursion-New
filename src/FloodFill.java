public class FloodFill {
    public static void main(String[] args) {


        int ar[][] = {{1, 1, 1}, {0, 0, 1}, {0, 1, 1}};

        System.out.println("Matrix before the flood fill");
        printMatrix(ar);

        solveFloodFill(ar, 0, 0, 1, 0);

        System.out.println("Matrix after the flood fill");
        printMatrix(ar);

    }

    static void solveFloodFill(int[][] ar, int row, int column, int prevFill, int toFill) {
        int rows = ar.length;
        int columns = ar[0].length;

        if(row < 0 || row >= rows || column >= columns || column < 0){
            return;
        }
        if(ar[row][column] != prevFill){
            return;
        }
        ar[row][column] = toFill;

        solveFloodFill(ar, row+1, column, prevFill, toFill);
        solveFloodFill(ar, row, column+1, prevFill, toFill);
        solveFloodFill(ar, row+1, column+1, prevFill, toFill);
        solveFloodFill(ar, row+1, column, prevFill, toFill);
    }

    static void printMatrix(int ar[][]){
        int rows = ar.length;
        int columns = ar[0].length;

        for(int i= 0 ; i<rows;i++){
            for(int j=0 ; j<columns; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

}