public class Search2dMatrix_2 {

    public boolean searchMatrix(int[][] matrix, int target) {


        return search(matrix, target);
    }


    private static boolean search(int[][] mat, int key) {

        int m = mat.length;
        int n = mat[0].length;

        int lo, hi;
        lo = 0;
        hi = m * n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mat[mid / n][mid % n] < key) {
                lo = mid + 1;
            } else if (mat[mid / n][mid % n] > key) {
                hi = mid - 1;
            } else {

                return true;

            }

        }
        return false;
    }

}
