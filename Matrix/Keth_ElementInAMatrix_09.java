public class Keth_ElementInAMatrix_09 {
    public int kthSmallest(int[][] matrix, int k) {


        // priority queue solution
//        int N = matrix.length;
//        // implements a max oriented heap
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                pq.offer(matrix[i][j]);
//                if (pq.size() > k) {
//                    pq.poll();
//                }
//            }
//        }
//
//        int result = pq.peek();
//        return result;

        // binary search implementation
        int N = matrix.length;

        int lo, hi;
        lo = matrix[0][0];
        hi = matrix[N - 1][N - 1];

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            int count = 0;
            int j = N - 1;

            // calculate count in each row
            for (int i = 0; i < N; i++) {
                while (j >= 0 && matrix[i][j] > mid) {
                    j--;
                }

                count += (j + 1);
            }

            if (count < k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }


        }
        return lo;

    }

}
