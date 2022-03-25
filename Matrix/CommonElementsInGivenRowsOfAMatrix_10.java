import java.util.HashMap;

public class CommonElementsInGivenRowsOfAMatrix_10 {


    public static void printCommonElements(int[][] matrix) {

        int M = matrix.length;
        int N = matrix[0].length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // adding first row to matrix
        for (int j = 0; j < matrix[0].length; j++) {

            map.put(matrix[0][j], 1);

        }

        // checking from row 2nd if element is inside hash table
        for (int i = 1; i < M; i++) {
            for (int j = 0; j < N; j++) {
                // deal with duplicates in the row
                // check against element in hash table

                if (map.containsKey(matrix[i][j]) && (map.get(matrix[i][j]) == i)) {

                    map.put(matrix[i][j], i + 1);

                    // upon traversing last row, if value of key is i print it
                    if (i == M - 1) {
                        System.out.println(matrix[i][j] + " ");
                    }


                }
            }
        }


    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 2, 1, 4, 8},
                        {3, 7, 8, 5, 1},
                        {8, 7, 7, 3, 1},
                        {8, 1, 8, 7, 9},
                };

        printCommonElements(mat);
    }


}
