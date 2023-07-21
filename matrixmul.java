
public class matrixmul {
    public static void main(String[] args) {

        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] mat2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        int rows = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;
        int[][] matmul = new int[rows][cols2];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    matmul[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matmul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
