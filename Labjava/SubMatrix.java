public class SubMatrix {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrixB = {
            {1, 2},
            {3, 4}
        };

        int[][] result = subMatrix(matrixA, matrixB);

        printMatrix(result);
    }

    public static int[][] subMatrix(int[][] aArray, int[][] bArray) {
        int numRows = aArray.length;
        int numCols = aArray[0].length;
        int[][] result = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = aArray[i][j] - bArray[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] nArray) {
        int numRows = nArray.length;
        int numCols = nArray[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(nArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
