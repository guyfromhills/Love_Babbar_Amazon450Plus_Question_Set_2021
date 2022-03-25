import edu.princeton.cs.algs4.StdOut;

public class Median2d_3 {


    public static int median(int[][] matrix, int r, int c) {

        int lo, hi;

        lo = 0;
        hi = r * c - 1;

        double Sum = 0;

        for (int i = lo; i <= hi; i++) {
            Sum += matrix[i / c][i % c];
        }

        double result = Math.ceil(Sum / (r * c));
        return (int) result;

    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 3, 5, 3, 7},
                {2, 6, 9, 3, 7},
                {3, 6, 9, 3, 7}};

        StdOut.println(median(arr1, 3, 3));


    }


}
