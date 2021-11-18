import java.util.Scanner;

public class UpperTriangularMatrix {
    public static boolean isItUpperTriangularMatrix(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j) {
                    if (matrix[i][j] != 0)
                        return false;
                }
                if (i < j) {
                    if (matrix[i][j] == 0)
                        return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }


        if (isItUpperTriangularMatrix(matrix, size))
            System.out.println("it's an upper triangular matrix ");
        else
            System.out.println("Not an upper triangular matrix ");

    }
}
