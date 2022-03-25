import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class PrintElementsInSortedOrder_05 {


    public static int[][] sortedMatrix(int N, int[][] Mat) {

        N = Mat.length;
        int[] mat = new int[N * N];

        int k = 0;
        int z = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                mat[k++] = Mat[i][j];
            }
        }

        Arrays.sort(mat);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                Mat[i][j] = mat[z++];
            }
        }
        return Mat;

    }

    public static void main(String[] args) {

        int[][] arr1 = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        StdOut.println(sortedMatrix(4, arr1));

    }
}
