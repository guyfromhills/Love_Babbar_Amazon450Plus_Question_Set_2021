import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;

public class SpiralTraversalMatrix_01 {


    /**
     * Adds the elements traversed spirally in the matrix into an ArrayList
     *
     * @param matrix is the 2d integer matrix
     * @param r      is  the rows
     * @param c      is the columns
     */
    public static ArrayList<Integer> spirallyTraverse(int[][] matrix, int r, int c) {

        // initializing Arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();

        // k is the start row index
        int k = 0;

        // l is the start column index
        int l = 0;

        // m is the last row index
        int m = r - 1;

        // n is the last column index
        int n = c - 1;

        while (k <= m && l <= n) {

            // traverse and put the first row in array list
            for (int i = l; i <= n; i++) {
                list.add(matrix[k][i]);
            }
            k++;

            // traverse and put the last column in array list
            for (int i = k; i <= m; i++) {
                list.add(matrix[i][n]);
            }
            n--;

            // traverse and put the last row in array list
            if (k <= m) {
                for (int i = n; i >= l; i--) {
                    list.add(matrix[m][i]);
                }
                m--;
            }

            if (l <= n) {
                // traverse and put the first column in array list
                for (int i = m; i >= k; i--) {
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };


        StdOut.println(spirallyTraverse(arr1, 3, 4));

    }

}
