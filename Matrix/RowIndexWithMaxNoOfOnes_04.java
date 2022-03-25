import edu.princeton.cs.algs4.StdOut;

public class RowIndexWithMaxNoOfOnes_04 {


    public static int rowWithMax1s(int[][] arr, int n, int m) {


//        n = arr.length;
//        m = arr[0].length;
//        int maxRowCount = Integer.MIN_VALUE;
//        int temp = Integer.MAX_VALUE;
//
//
//        for (int i = 0; i < n; i++) {
//            int rowCount = 0;
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] == 1) {
//                    rowCount++;
//
//                }
//
//
//            }
//
//            if (maxRowCount < rowCount) {
//
//                maxRowCount = rowCount;
//                temp = i;
//            }
//
//
//            if (rowCount == m) {
//                StdOut.println("runs");
//                return temp;
//            }
//
//            if (i == m - 1 && maxRowCount == 0) {
//                return -1;
//            }
//
//
//        }
//        return temp;


        // below is the 0(n+m) solution
        int row = -1;
        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (arr[i][j] == 1) {
                j--;
                row = i; //updating row value
            } else {
                i++; //switch to next row
            }
        }
        return row;

    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

        int[][] arr2 = {
                {0, 0}, {0, 0}
        };


        StdOut.println(rowWithMax1s(arr1, 4, 4));
        StdOut.println(rowWithMax1s(arr2, 2, 2));

    }


}
