public class MatrixMultiplicationExample {

    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {4, 5, 3}, {5, 6, 3} };

        // Adding Two matrices
        int[][] mul = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mul[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("multiplication  of two matrices is: ");
        for(int[] row : mul) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}