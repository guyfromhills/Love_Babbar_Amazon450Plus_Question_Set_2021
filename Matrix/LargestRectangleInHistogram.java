import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class LargestRectangleInHistogram {


    public static int largest(int[] heights) {


        //brute solution
//        int maxArea = 0;
//        int N = heights.length;
//        for (int i = 0; i < N; i++) {
//            int minHeight = Integer.MAX_VALUE;
//            for (int j = i; j < N; j++) {
//                minHeight = Math.min(minHeight, heights[i]);
//                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
//            }
//        }
//        return maxArea;

        // 2 pass solution
//        int N = heights.length;
//        Stack<Integer> s = new Stack<>();
//        int[] leftSmall = new int[N];
//        int[] rightSmall = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
//                s.pop();
//            }
//
//            if (s.isEmpty())  // no left small value
//            {
//                leftSmall[i] = 0;
//
//            } else {
//                leftSmall[i] = s.peek() + 1;
//            }
//            s.push(i);
//
//
//        }
//
//        while (!s.isEmpty()) {
//            s.pop();
//        }
//
//        for (int i = N - 1; i >= 0; i--) {
//            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
//                s.pop();
//            }
//
//            if (s.isEmpty())  // no left small value
//            {
//                rightSmall[i] = N - 1;
//
//            } else {
//                rightSmall[i] = s.peek() - 1;
//            }
//
//            s.push(i);
//
//        }
//        int maxArea = 0;
//        for (int i = 0; i < N; i++) {
//            maxArea = Math.max(maxArea, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
//        }
//        return maxArea;

        // 1 pass solution

        Stack<Integer> s = new Stack<>();
        int N = heights.length;

        int maxArea = 0;
        for (int i = 0; i <= N; i++) {
            while (!s.isEmpty() && (i == N || heights[i] <= heights[s.peek()])) {
                int height = heights[s.peek()];
                s.pop();
                int width;
                if (s.isEmpty()) {
                    width = i;
                } else {
                    width = i - s.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);

            }
            s.push(i);
        }
        return maxArea;


    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 6, 2, 3};
        StdOut.println(largest(arr1));


    }


}
